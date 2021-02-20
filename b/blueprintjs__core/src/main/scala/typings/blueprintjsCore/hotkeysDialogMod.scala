package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIHotkeysDialogProp
import typings.blueprintjsCore.dialogMod.IDialogProps
import typings.blueprintjsCore.hotkeyMod.IHotkeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysDialogMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", "hideHotkeysDialog")
  @js.native
  def hideHotkeysDialog(): Unit = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", "hideHotkeysDialogAfterDelay")
  @js.native
  def hideHotkeysDialogAfterDelay(): Unit = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", "isHotkeysDialogShowing")
  @js.native
  def isHotkeysDialogShowing(): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", "setHotkeysDialogProps")
  @js.native
  def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog", "showHotkeysDialog")
  @js.native
  def showHotkeysDialog(hotkeys: js.Array[IHotkeyProps]): Unit = js.native
  
  @js.native
  trait IHotkeysDialogProps extends IDialogProps {
    
    /**
      * This string displayed as the group name in the hotkeys dialog for all
      * global hotkeys.
      */
    var globalHotkeysGroup: js.UndefOr[String] = js.native
  }
  object IHotkeysDialogProps {
    
    @scala.inline
    def apply(isOpen: Boolean): IHotkeysDialogProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHotkeysDialogProps]
    }
    
    @scala.inline
    implicit class IHotkeysDialogPropsMutableBuilder[Self <: IHotkeysDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalHotkeysGroup(value: String): Self = StObject.set(x, "globalHotkeysGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalHotkeysGroupUndefined: Self = StObject.set(x, "globalHotkeysGroup", js.undefined)
    }
  }
}
