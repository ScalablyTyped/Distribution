package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmComponentsDialogDialogMod.IDialogProps
import typings.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysHotkeysDialog2Mod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog2", "HotkeysDialog2")
  @js.native
  val HotkeysDialog2: FC[HotkeysDialog2Props] = js.native
  
  trait HotkeysDialog2Props
    extends StObject
       with IDialogProps {
    
    /**
      * This string displayed as the group name in the hotkeys dialog for all
      * global hotkeys.
      */
    var globalGroupName: js.UndefOr[String] = js.undefined
    
    var hotkeys: js.Array[HotkeyConfig]
  }
  object HotkeysDialog2Props {
    
    inline def apply(hotkeys: js.Array[HotkeyConfig], isOpen: Boolean): HotkeysDialog2Props = {
      val __obj = js.Dynamic.literal(hotkeys = hotkeys.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotkeysDialog2Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HotkeysDialog2Props] (val x: Self) extends AnyVal {
      
      inline def setGlobalGroupName(value: String): Self = StObject.set(x, "globalGroupName", value.asInstanceOf[js.Any])
      
      inline def setGlobalGroupNameUndefined: Self = StObject.set(x, "globalGroupName", js.undefined)
      
      inline def setHotkeys(value: js.Array[HotkeyConfig]): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      inline def setHotkeysVarargs(value: HotkeyConfig*): Self = StObject.set(x, "hotkeys", js.Array(value*))
    }
  }
}
