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
  def this(props: atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with INumericInputProps) = this()
  def this(props: atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with INumericInputProps, context: js.Any) = this()
  var delta: js.Any = js.native
  var didPasteEventJustOccur: js.Any = js.native
  var handleButtonBlur: js.Any = js.native
  var handleButtonClick: js.Any = js.native
  var handleButtonFocus: js.Any = js.native
  var handleButtonKeyUp: js.Any = js.native
  var handleContinuousChange: js.Any = js.native
  var handleDecrementButtonClick: js.Any = js.native
  var handleDecrementButtonKeyDown: js.Any = js.native
  var handleDecrementButtonKeyUp: js.Any = js.native
  var handleDecrementButtonMouseDown: js.Any = js.native
  var handleIncrementButtonClick: js.Any = js.native
  var handleIncrementButtonKeyDown: js.Any = js.native
  var handleIncrementButtonKeyUp: js.Any = js.native
  var handleIncrementButtonMouseDown: js.Any = js.native
  var handleInputBlur: js.Any = js.native
  var handleInputChange: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleInputKeyDown: js.Any = js.native
  var handleInputKeyPress: js.Any = js.native
  var handleInputPaste: js.Any = js.native
  var inputElement: js.Any = js.native
  var inputRef: js.Any = js.native
  var intervalId: js.Any = js.native
  var shouldSelectAfterUpdate: js.Any = js.native
  var stopContinuousChange: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNumericInput(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MNumericInput(nextProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with INumericInputProps): scala.Unit = js.native
  /* private */ def getIncrementDelta(direction: js.Any, isShiftKeyPressed: js.Any, isAltKeyPressed: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any, delta: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any, delta: js.Any, min: js.Any): js.Any = js.native
  /* private */ def getSanitizedValue(value: js.Any, delta: js.Any, min: js.Any, max: js.Any): js.Any = js.native
  /* private */ def getStepMaxPrecision(props: js.Any): js.Any = js.native
  /* private */ def getValueOrEmptyValue(value: js.Any): js.Any = js.native
  /* private */ def incrementValue(delta: js.Any): js.Any = js.native
  /* private */ def invokeValueCallback(value: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def isFloatingPointNumericCharacter(character: js.Any): js.Any = js.native
  /* private */ def isKeyboardEventDisabledForBasicNumericEntry(e: js.Any): js.Any = js.native
  /* private */ def isValueNumeric(value: js.Any): js.Any = js.native
  /* private */ def renderButton(key: js.Any, iconName: js.Any, onMouseDown: js.Any, onKeyDown: js.Any, onKeyUp: js.Any): js.Any = js.native
  /* private */ def startContinuousChange(): js.Any = js.native
  /* private */ def toMaxPrecision(value: js.Any): js.Any = js.native
  /* private */ def updateDelta(direction: js.Any, e: js.Any): js.Any = js.native
}

@JSImport("@blueprintjs/core/lib/esm/components/forms/numericInput", "NumericInput")
@js.native
object NumericInput extends js.Object {
  var CONTINUOUS_CHANGE_DELAY: js.Any = js.native
  var CONTINUOUS_CHANGE_INTERVAL: js.Any = js.native
  var DECREMENT_ICON_NAME: js.Any = js.native
  var DECREMENT_KEY: js.Any = js.native
  /**
       * A regex that matches a string of length 1 (i.e. a standalone character)
       * if and only if it is a floating-point number character as defined by W3C:
       * https://www.w3.org/TR/2012/WD-html-markup-20120329/datatypes.html#common.data.float
       *
       * Floating-point number characters are the only characters that can be
       * printed within a default input[type="number"]. This component should
       * behave the same way when this.props.allowNumericCharactersOnly = true.
       * See here for the input[type="number"].value spec:
       * https://www.w3.org/TR/2012/WD-html-markup-20120329/input.number.html#input.number.attrs.value
       */
  var FLOATING_POINT_NUMBER_CHARACTER_REGEX: js.Any = js.native
  var INCREMENT_ICON_NAME: js.Any = js.native
  var INCREMENT_KEY: js.Any = js.native
  var VALUE_EMPTY: java.lang.String = js.native
  var VALUE_ZERO: java.lang.String = js.native
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod.INumericInputProps = js.native
  var displayName: java.lang.String = js.native
}

