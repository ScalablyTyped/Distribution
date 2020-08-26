package typings.blueprintjsDatetime.dateTimePickerMod

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
@js.native
class DateTimePicker ()
  extends AbstractPureComponent2[IDateTimePickerProps, IDateTimePickerState, js.Object] {
  def this(props: IDateTimePickerProps) = this()
  def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  def this(props: IDateTimePickerProps, context: js.Any) = this()
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateTimePicker(prevProps: IDatePickerProps): Unit = js.native
  def handleDateChange(dateValue: Date, isUserChange: Boolean): Unit = js.native
  def handleTimeChange(timeValue: Date): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var defaultProps: IDateTimePickerProps = js.native
  var displayName: String = js.native
}

