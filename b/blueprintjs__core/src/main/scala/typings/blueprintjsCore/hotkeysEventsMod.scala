package typings.blueprintjsCore

import typings.blueprintjsCore.anon.IHotkeysPropschildrenReacChildren
import typings.blueprintjsCore.hotkeyMod.IHotkeyProps
import typings.blueprintjsCore.hotkeyParserMod.IKeyCombo
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysEventsMod {
  
  @js.native
  sealed trait HotkeyScope extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeyScope")
  @js.native
  object HotkeyScope extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HotkeyScope with String] = js.native
    
    @js.native
    sealed trait GLOBAL extends HotkeyScope
    /* "global" */ val GLOBAL: typings.blueprintjsCore.hotkeysEventsMod.HotkeyScope.GLOBAL with String = js.native
    
    @js.native
    sealed trait LOCAL extends HotkeyScope
    /* "local" */ val LOCAL: typings.blueprintjsCore.hotkeysEventsMod.HotkeyScope.LOCAL with String = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeysEvents")
  @js.native
  class HotkeysEvents protected () extends StObject {
    def this(scope: HotkeyScope) = this()
    
    var actions: js.Any = js.native
    
    def clear(): Unit = js.native
    
    def count(): Double = js.native
    
    def handleKeyDown(e: KeyboardEvent): Unit = js.native
    
    def handleKeyUp(e: KeyboardEvent): Unit = js.native
    
    var invokeNamedCallbackIfComboRecognized: js.Any = js.native
    
    var isScope: js.Any = js.native
    
    var isTextInput: js.Any = js.native
    
    var scope: js.Any = js.native
    
    def setHotkeys(props: IHotkeysPropschildrenReacChildren): Unit = js.native
  }
  
  @js.native
  trait IHotkeyAction extends StObject {
    
    var combo: IKeyCombo = js.native
    
    var props: IHotkeyProps = js.native
  }
  object IHotkeyAction {
    
    @scala.inline
    def apply(combo: IKeyCombo, props: IHotkeyProps): IHotkeyAction = {
      val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHotkeyAction]
    }
    
    @scala.inline
    implicit class IHotkeyActionMutableBuilder[Self <: IHotkeyAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombo(value: IKeyCombo): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: IHotkeyProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
