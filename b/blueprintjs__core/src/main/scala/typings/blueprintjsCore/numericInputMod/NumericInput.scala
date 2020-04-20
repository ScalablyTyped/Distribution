package typings.blueprintjsCore.numericInputMod

import typings.blueprintjsCore.AnonPrevMaxProp
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
@js.native
class NumericInput ()
  extends AbstractPureComponent2[HTMLInputProps with INumericInputProps, INumericInputState, js.Object] {
  var decrementButtonHandlers: js.Any = js.native
  var delta: js.Any = js.native
  var didPasteEventJustOccur: js.Any = js.native
  var getButtonEventHandlers: js.Any = js.native
  var getIncrementDelta: js.Any = js.native
  var getSanitizedValue: js.Any = js.native
  var handleButtonClick: js.Any = js.native
  var handleContinuousChange: js.Any = js.native
  var handleInputBlur: js.Any = js.native
  var handleInputChange: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleInputKeyDown: js.Any = js.native
  var handleInputKeyPress: js.Any = js.native
  var handleInputPaste: js.Any = js.native
  var incrementButtonHandlers: js.Any = js.native
  var incrementValue: js.Any = js.native
  var inputElement: js.Any = js.native
  var inputRef: js.Any = js.native
  var intervalId: js.Any = js.native
  var renderButtons: js.Any = js.native
  var renderInput: js.Any = js.native
  var startContinuousChange: js.Any = js.native
  var stopContinuousChange: js.Any = js.native
  var updateDelta: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNumericInput(prevProps: INumericInputProps, prevState: INumericInputState): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
@js.native
object NumericInput extends js.Object {
  var CONTINUOUS_CHANGE_DELAY: js.Any = js.native
  var CONTINUOUS_CHANGE_INTERVAL: js.Any = js.native
  var VALUE_EMPTY: String = js.native
  var VALUE_ZERO: String = js.native
  var defaultProps: INumericInputProps = js.native
  var displayName: String = js.native
  var getSanitizedValue: js.Any = js.native
  var getStepMaxPrecision: js.Any = js.native
  def getDerivedStateFromProps(props: INumericInputProps, state: INumericInputState): AnonPrevMaxProp = js.native
}

