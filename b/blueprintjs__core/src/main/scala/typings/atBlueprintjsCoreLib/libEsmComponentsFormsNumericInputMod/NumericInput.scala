package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
@js.native
class NumericInput ()
  extends atBlueprintjsCoreLib.libEsmCommonMod.AbstractPureComponent[
      atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with INumericInputProps, 
      INumericInputState
    ] {
  var decrementButtonHandlers: js.Any = js.native
  var delta: js.Any = js.native
  var didPasteEventJustOccur: js.Any = js.native
  var handleButtonClick: js.Any = js.native
  var handleContinuousChange: js.Any = js.native
  var handleInputBlur: js.Any = js.native
  var handleInputChange: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleInputKeyDown: js.Any = js.native
  var handleInputKeyPress: js.Any = js.native
  var handleInputPaste: js.Any = js.native
  var incrementButtonHandlers: js.Any = js.native
  var inputElement: js.Any = js.native
  var inputRef: js.Any = js.native
  var intervalId: js.Any = js.native
  var stopContinuousChange: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNumericInput(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MNumericInput(nextProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with INumericInputProps): scala.Unit = js.native
  /* private */ def getButtonEventHandlers(direction: js.Any): js.Any = js.native
  /* private */ def getIncrementDelta(direction: js.Any, isShiftKeyPressed: js.Any, isAltKeyPressed: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any, delta: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any, delta: js.Any, min: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any, delta: js.Any, min: js.Any, max: js.Any): js.Any = js.native
  /* private */ def getStepMaxPrecision(props: js.Any): js.Any = js.native
  /* private */ def incrementValue(delta: js.Any): js.Any = js.native
  /* private */ def invokeValueCallback(value: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def renderButtons(): js.Any = js.native
  /* private */ def renderInput(): js.Any = js.native
  /* private */ def startContinuousChange(): js.Any = js.native
  /* private */ def updateDelta(direction: js.Any, e: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
@js.native
object NumericInput extends js.Object {
  var CONTINUOUS_CHANGE_DELAY: js.Any = js.native
  var CONTINUOUS_CHANGE_INTERVAL: js.Any = js.native
  var VALUE_EMPTY: java.lang.String = js.native
  var VALUE_ZERO: java.lang.String = js.native
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod.INumericInputProps = js.native
  var displayName: java.lang.String = js.native
}

