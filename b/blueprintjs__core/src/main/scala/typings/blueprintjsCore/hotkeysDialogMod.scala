package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIHotkeysDialogProp
import typings.blueprintjsCore.dialogMod.IDialogProps
import typings.blueprintjsCore.hotkeyMod.IHotkeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysDialogMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hideHotkeysDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideHotkeysDialog")().asInstanceOf[Unit]
  
  inline def hideHotkeysDialogAfterDelay(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideHotkeysDialogAfterDelay")().asInstanceOf[Unit]
  
  inline def isHotkeysDialogShowing(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHotkeysDialogShowing")().asInstanceOf[Boolean]
  
  inline def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHotkeysDialogProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showHotkeysDialog(hotkeys: js.Array[IHotkeyProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showHotkeysDialog")(hotkeys.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IHotkeysDialogProps
    extends StObject
       with IDialogProps {
    
    /**
      * This string displayed as the group name in the hotkeys dialog for all
      * global hotkeys.
      */
    var globalHotkeysGroup: js.UndefOr[String] = js.undefined
  }
  object IHotkeysDialogProps {
    
    inline def apply(isOpen: Boolean): IHotkeysDialogProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHotkeysDialogProps]
    }
    
    extension [Self <: IHotkeysDialogProps](x: Self) {
      
      inline def setGlobalHotkeysGroup(value: String): Self = StObject.set(x, "globalHotkeysGroup", value.asInstanceOf[js.Any])
      
      inline def setGlobalHotkeysGroupUndefined: Self = StObject.set(x, "globalHotkeysGroup", js.undefined)
    }
  }
}
