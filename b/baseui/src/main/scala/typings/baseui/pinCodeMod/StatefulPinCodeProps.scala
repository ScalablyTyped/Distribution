package typings.baseui.pinCodeMod

import typings.baseui.AnonValues
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
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<baseui.baseui/pin-code.PinCodeProps> & baseui.baseui/pin-code.StatefulContainerProps & {  children ? :never,   overrides ? :baseui.baseui/pin-code.PinCodeOverrides} */
@js.native
trait StatefulPinCodeProps extends js.Object {
  var adjoined: js.UndefOr[none | left | right | both] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var initialState: js.UndefOr[State] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  var manageFocus: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ AnonValues, Unit]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var overrides: js.UndefOr[InputOverrides with PinCodeOverrides] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[Double] = js.native
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[String]] = js.native
}

