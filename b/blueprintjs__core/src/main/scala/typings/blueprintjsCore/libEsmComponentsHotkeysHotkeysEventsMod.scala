package typings.blueprintjsCore

import typings.blueprintjsCore.anon.IHotkeysPropschildrenReacChildren
import typings.blueprintjsCore.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
import typings.blueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysHotkeysEventsMod {
  
  @js.native
  sealed trait HotkeyScope extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeyScope")
  @js.native
  object HotkeyScope extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HotkeyScope & String] = js.native
    
    @js.native
    sealed trait GLOBAL
      extends StObject
         with HotkeyScope
    /* "global" */ val GLOBAL: typings.blueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope.GLOBAL & String = js.native
    
    @js.native
    sealed trait LOCAL
      extends StObject
         with HotkeyScope
    /* "local" */ val LOCAL: typings.blueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope.LOCAL & String = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeysEvents")
  @js.native
  open class HotkeysEvents protected () extends StObject {
    def this(scope: HotkeyScope) = this()
    
    /* private */ var actions: Any = js.native
    
    def clear(): Unit = js.native
    
    def count(): Double = js.native
    
    def handleKeyDown(e: KeyboardEvent): Unit = js.native
    
    def handleKeyUp(e: KeyboardEvent): Unit = js.native
    
    /* private */ var invokeNamedCallbackIfComboRecognized: Any = js.native
    
    /* private */ var isScope: Any = js.native
    
    /* private */ var isTextInput: Any = js.native
    
    /* private */ var scope: Any = js.native
    
    def setHotkeys(props: IHotkeysPropschildrenReacChildren): Unit = js.native
  }
  
  trait IHotkeyAction extends StObject {
    
    var combo: IKeyCombo
    
    var props: IHotkeyProps
  }
  object IHotkeyAction {
    
    inline def apply(combo: IKeyCombo, props: IHotkeyProps): IHotkeyAction = {
      val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHotkeyAction]
    }
    
    extension [Self <: IHotkeyAction](x: Self) {
      
      inline def setCombo(value: IKeyCombo): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
      
      inline def setProps(value: IHotkeyProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
