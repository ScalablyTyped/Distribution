package typings.blueprintjsDatetime.timePickerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
@js.native
class TimePicker ()
  extends Component[ITimePickerProps, ITimePickerState, js.Any] {
  def this(props: ITimePickerProps) = this()
  def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  def this(props: ITimePickerProps, context: js.Any) = this()
  var decrementTime: js.Any = js.native
  /**
    * Generates a full ITimePickerState object with all text fields set to formatted strings based on value
    */
  var getFullStateFromValue: js.Any = js.native
  var getInputBlurHandler: js.Any = js.native
  var getInputChangeHandler: js.Any = js.native
  var getInputFocusHandler: js.Any = js.native
  var getInputKeyDownHandler: js.Any = js.native
  var getInputKeyUpHandler: js.Any = js.native
  var handleAmPmChange: js.Any = js.native
  var incrementTime: js.Any = js.native
  var maybeRenderAmPm: js.Any = js.native
  var maybeRenderArrowButton: js.Any = js.native
  var renderDivider: js.Any = js.native
  var renderInput: js.Any = js.native
  var shiftTime: js.Any = js.native
  var updateState: js.Any = js.native
  var updateTime: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTimePicker(prevProps: ITimePickerProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/timePicker", "TimePicker")
@js.native
object TimePicker extends js.Object {
  var defaultProps: ITimePickerProps = js.native
  var displayName: String = js.native
}

