package typings.blueprintjsCore

import typings.blueprintjsCore.anon.AllowInInput
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.ReactNode
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeyMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkey", "Hotkey")
  @js.native
  class Hotkey protected ()
    extends AbstractPureComponent2[IHotkeyProps, js.Object, js.Object] {
    def this(props: IHotkeyProps) = this()
    def this(props: IHotkeyProps, context: js.Any) = this()
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
       with IProps {
    
    /**
      * Whether the hotkey should be triggerable when focused in a text input.
      * @default false
      */
    var allowInInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hotkey combination string, such as "space" or "cmd+n".
      */
    var combo: String
    
    /**
      * Whether the hotkey cannot be triggered.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, the hotkey is active only when the target is focused. If
      * `true`, the hotkey can be triggered regardless of what component is
      * focused.
      * @default false
      */
    var global: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Unless the hotkey is global, you must specify a group where the hotkey
      * will be displayed in the hotkeys dialog. This string will be displayed
      * in a header at the start of the group of hotkeys.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      * Human-friendly label for the hotkey.
      */
    var label: ReactNode
    
    /**
      * `keydown` event handler.
      */
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, js.Any]] = js.undefined
    
    /**
      * `keyup` event handler.
      */
    var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent, js.Any]] = js.undefined
    
    /**
      * When `true`, invokes `event.preventDefault()` before the respective `onKeyDown` and
      * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
      * @default false
      */
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, invokes `event.stopPropagation()` before the respective `onKeyDown` and
      * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
      * @default false
      */
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
  }
  object IHotkeyProps {
    
    inline def apply(combo: String): IHotkeyProps = {
      val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHotkeyProps]
    }
    
    extension [Self <: IHotkeyProps](x: Self) {
      
      inline def setAllowInInput(value: Boolean): Self = StObject.set(x, "allowInInput", value.asInstanceOf[js.Any])
      
      inline def setAllowInInputUndefined: Self = StObject.set(x, "allowInInput", js.undefined)
      
      inline def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent => js.Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent => js.Any): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
}
