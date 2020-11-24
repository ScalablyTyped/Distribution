package typings.blueprintjsCore.hotkeyMod

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.ReactNode
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHotkeyProps extends IProps {
  
  /**
    * Whether the hotkey should be triggerable when focused in a text input.
    * @default false
    */
  var allowInInput: js.UndefOr[Boolean] = js.native
  
  /**
    * Hotkey combination string, such as "space" or "cmd+n".
    */
  var combo: String = js.native
  
  /**
    * Whether the hotkey cannot be triggered.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false`, the hotkey is active only when the target is focused. If
    * `true`, the hotkey can be triggered regardless of what component is
    * focused.
    * @default false
    */
  var global: js.UndefOr[Boolean] = js.native
  
  /**
    * Unless the hotkey is global, you must specify a group where the hotkey
    * will be displayed in the hotkeys dialog. This string will be displayed
    * in a header at the start of the group of hotkeys.
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * Human-friendly label for the hotkey.
    */
  var label: ReactNode = js.native
  
  /**
    * `keydown` event handler.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  
  /**
    * `keyup` event handler.
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  
  /**
    * When `true`, invokes `event.preventDefault()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, invokes `event.stopPropagation()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var stopPropagation: js.UndefOr[Boolean] = js.native
}
object IHotkeyProps {
  
  @scala.inline
  def apply(combo: String): IHotkeyProps = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeyProps]
  }
  
  @scala.inline
  implicit class IHotkeyPropsOps[Self <: IHotkeyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCombo(value: String): Self = this.set("combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInInput(value: Boolean): Self = this.set("allowInInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInInput: Self = this.set("allowInInput", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: /* e */ KeyboardEvent => _): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
}
