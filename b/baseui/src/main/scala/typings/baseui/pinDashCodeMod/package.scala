package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinDashCodeMod {
  import typings.baseui.Anon_ArgsManageFocus
  import typings.baseui.Anon_Input
  import typings.baseui.Anon_OverridesPinCodeOverrides
  import typings.baseui.baseuiStrings.onChange
  import typings.baseui.baseuiStrings.value
  import typings.baseui.inputMod.InputOverrides
  import typings.baseui.inputMod.InputProps
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PinCodeOverrides = InputOverrides with Anon_Input
  type PinCodeProps = (Omit[InputProps, onChange | value]) with Anon_ArgsManageFocus
  type StatefulPinCodeProps = Partial[PinCodeProps] with StatefulContainerProps with Anon_OverridesPinCodeOverrides
}
