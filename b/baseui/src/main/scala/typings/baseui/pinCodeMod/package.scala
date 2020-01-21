package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinCodeMod {
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type PinCodeOverrides = typings.baseui.inputMod.InputOverrides with typings.baseui.AnonInput
  type PinCodeProps = (typings.baseui.pinCodeMod.Omit[
    typings.baseui.inputMod.InputProps, 
    typings.baseui.baseuiStrings.onChange | typings.baseui.baseuiStrings.value
  ]) with typings.baseui.AnonArgsManageFocus
  type StatefulPinCodeProps = typings.std.Partial[typings.baseui.pinCodeMod.PinCodeProps] with typings.baseui.pinCodeMod.StatefulContainerProps with typings.baseui.AnonOverridesPinCodeOverrides
}
