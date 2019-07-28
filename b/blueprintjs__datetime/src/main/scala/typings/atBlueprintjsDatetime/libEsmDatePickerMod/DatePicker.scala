package typings.atBlueprintjsDatetime.libEsmDatePickerMod

import typings.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractPureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
@js.native
class DatePicker protected () extends AbstractPureComponent[IDatePickerProps, IDatePickerState] {
  def this(props: IDatePickerProps) = this()
  def this(props: IDatePickerProps, context: js.Any) = this()
  var disabledDays: js.Any = js.native
  var getDatePickerModifiers: js.Any = js.native
  var getDisabledDaysModifier: js.Any = js.native
  var handleClearClick: js.Any = js.native
  var handleDayClick: js.Any = js.native
  var handleMonthChange: js.Any = js.native
  var handleTimeChange: js.Any = js.native
  var handleTodayClick: js.Any = js.native
  var ignoreNextMonthChange: js.Any = js.native
  var isToday: js.Any = js.native
  var renderCaption: js.Any = js.native
  var renderDay: js.Any = js.native
  var renderNavbar: js.Any = js.native
  var shouldHighlightCurrentDay: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDatePicker(nextProps: IDatePickerProps): Unit = js.native
  /* private */ def computeValidDateInSpecifiedMonthYear(displayYear: js.Any, displayMonth: js.Any): js.Any = js.native
  /* private */ def maybeRenderTimePicker(): js.Any = js.native
  /* private */ def renderOptionsBar(): js.Any = js.native
  /**
    * Update `value` by invoking `onChange` (always) and setting state (if uncontrolled).
    */
  /* private */ def updateValue(value: js.Any, isUserChange: js.Any): js.Any = js.native
  /* private */ def updateValue(value: js.Any, isUserChange: js.Any, skipOnChange: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
@js.native
object DatePicker extends js.Object {
  var defaultProps: IDatePickerProps = js.native
  var displayName: String = js.native
}

