package typings.blueprintjsCore

import typings.blueprintjsCore.anon.AllowInInput
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.hotkeyConfigMod.HotkeyConfig
import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeyMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkey", "Hotkey")
  @js.native
  open class Hotkey protected ()
    extends AbstractPureComponent2[IHotkeyProps, js.Object, js.Object] {
    def this(props: IHotkeyProps) = this()
    def this(props: IHotkeyProps, context: Any) = this()
  }
  /* static members */
  object Hotkey {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkey", "Hotkey")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkey", "Hotkey.defaultProps")
    @js.native
    def defaultProps: AllowInInput = js.native
    inline def defaultProps_=(x: AllowInInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkey", "Hotkey.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IHotkeyProps
    extends StObject
       with IProps
       with HotkeyConfig
  object IHotkeyProps {
    
    inline def apply(combo: String): IHotkeyProps = {
      val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHotkeyProps]
    }
  }
}
