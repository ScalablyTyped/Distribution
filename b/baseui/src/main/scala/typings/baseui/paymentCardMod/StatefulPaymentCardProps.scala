package typings.baseui.paymentCardMod

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.inputMod.InputOverrides
import typings.baseui.inputMod.SharedProps
import typings.baseui.inputMod.State
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/input.InputProps & baseui.baseui/input.StatefulContainerProps & {  children :never | undefined,   overrides :baseui.baseui/payment-card.PaymentCardOverrides | undefined} */
@js.native
trait StatefulPaymentCardProps extends js.Object {
  var adjoined: js.UndefOr[none | left | right | both] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var initialState: js.UndefOr[State] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var overrides: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[Double] = js.native
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object StatefulPaymentCardProps {
  @scala.inline
  def apply(
    children: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing],
    overrides: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides]
  ): StatefulPaymentCardProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulPaymentCardProps]
  }
  @scala.inline
  implicit class StatefulPaymentCardPropsOps[Self <: StatefulPaymentCardProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrides(value: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdjoined(value: none | left | right | both): Self = this.set("adjoined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjoined: Self = this.set("adjoined", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClearable(value: Boolean): Self = this.set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearable: Self = this.set("clearable", js.undefined)
    @scala.inline
    def `setData-baseweb`(value: String): Self = this.set("data-baseweb", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-baseweb`: Self = this.set("data-baseweb", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = this.set("endEnhancer", js.Any.fromFunction1(value))
    @scala.inline
    def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = this.set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndEnhancer: Self = this.set("endEnhancer", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: Ref[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = this.set("startEnhancer", js.Any.fromFunction1(value))
    @scala.inline
    def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = this.set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartEnhancer: Self = this.set("startEnhancer", js.undefined)
    @scala.inline
    def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

