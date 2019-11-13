package typings.atBlueprintjsDatetime.libEsmDatePickerMod

import typings.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
@js.native
class DatePicker protected ()
  extends AbstractPureComponent2[IDatePickerProps, IDatePickerState, js.Object] {
  def this(props: IDatePickerProps) = this()
  def this(props: IDatePickerProps, context: js.Any) = this()
  var computeValidDateInSpecifiedMonthYear: js.Any = js.native
  var disabledDays: js.Any = js.native
  var getDatePickerModifiers: js.Any = js.native
  var getDisabledDaysModifier: js.Any = js.native
  var handleClearClick: js.Any = js.native
  var handleDayClick: js.Any = js.native
  var handleMonthChange: js.Any = js.native
  var handleShortcutClick: js.Any = js.native
  var handleTimeChange: js.Any = js.native
  var handleTodayClick: js.Any = js.native
  var ignoreNextMonthChange: js.Any = js.native
  var isToday: js.Any = js.native
  var maybeRenderShortcuts: js.Any = js.native
  var maybeRenderTimePicker: js.Any = js.native
  var renderCaption: js.Any = js.native
  var renderDay: js.Any = js.native
  var renderNavbar: js.Any = js.native
  var renderOptionsBar: js.Any = js.native
  var shouldHighlightCurrentDay: js.Any = js.native
  var updateDay: js.Any = js.native
  /**
    * Update `value` by invoking `onChange` (always) and setting state (if uncontrolled).
    */
  var updateValue: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDatePicker(prevProps: IDatePickerProps, prevState: IDatePickerState): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDatePicker(prevProps: IDatePickerProps, prevState: IDatePickerState, snapshot: js.Object): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
@js.native
object DatePicker extends js.Object {
  var defaultProps: IDatePickerProps = js.native
  var displayName: String = js.native
}

