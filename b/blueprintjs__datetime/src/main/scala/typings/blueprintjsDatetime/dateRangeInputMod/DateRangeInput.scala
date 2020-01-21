package typings.blueprintjsDatetime.dateRangeInputMod

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
@js.native
class DateRangeInput protected ()
  extends AbstractPureComponent2[IDateRangeInputProps, IDateRangeInputState, js.Object] {
  def this(props: IDateRangeInputProps) = this()
  def this(props: IDateRangeInputProps, context: js.Any) = this()
  var doBoundaryDatesOverlap: js.Any = js.native
  /**
    * Returns true if the provided boundary is an END boundary overlapping the
    * selected start date. (If the boundaries overlap, we consider the END
    * boundary to be erroneous.)
    */
  var doesEndBoundaryOverlapStartBoundary: js.Any = js.native
  var endInputRef: js.Any = js.native
  var formatDate: js.Any = js.native
  var getDateRangeForCallback: js.Any = js.native
  var getFormattedMinMaxDateString: js.Any = js.native
  var getInitialRange: js.Any = js.native
  var getInputDisplayString: js.Any = js.native
  var getInputGroupCallbackForEvent: js.Any = js.native
  var getInputPlaceholderString: js.Any = js.native
  var getInputProps: js.Any = js.native
  var getInputRef: js.Any = js.native
  var getIsOpenValueWhenDateChanges: js.Any = js.native
  var getOtherBoundary: js.Any = js.native
  var getSelectedRange: js.Any = js.native
  var getStateKeysAndValuesForBoundary: js.Any = js.native
  var handleDateRangePickerChange: js.Any = js.native
  var handleDateRangePickerHoverChange: js.Any = js.native
  var handleEndInputEvent: js.Any = js.native
  var handleInputBlur: js.Any = js.native
  var handleInputChange: js.Any = js.native
  var handleInputClick: js.Any = js.native
  var handleInputEvent: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleInputKeyDown: js.Any = js.native
  var handleInputMouseDown: js.Any = js.native
  var handlePopoverClose: js.Any = js.native
  var handleShortcutChange: js.Any = js.native
  var handleStartInputEvent: js.Any = js.native
  var isControlled: js.Any = js.native
  var isDateValidAndInRange: js.Any = js.native
  var isInputEmpty: js.Any = js.native
  var isInputInErrorState: js.Any = js.native
  var isNextDateRangeValid: js.Any = js.native
  var parseDate: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderInputGroup: js.Any = js.native
  var shouldFocusInputRef: js.Any = js.native
  var startInputRef: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateRangeInput(prevProps: IDateRangeInputProps, prevState: IDateRangeInputState): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateRangeInput(prevProps: IDateRangeInputProps, prevState: IDateRangeInputState, snapshot: js.Object): Unit = js.native
  /**
    * Public method intended for unit testing only. Do not use in feature work!
    */
  def reset(): Unit = js.native
  def reset(props: IDateRangeInputProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
@js.native
object DateRangeInput extends js.Object {
  var defaultProps: Partial[IDateRangeInputProps] = js.native
  var displayName: String = js.native
}

