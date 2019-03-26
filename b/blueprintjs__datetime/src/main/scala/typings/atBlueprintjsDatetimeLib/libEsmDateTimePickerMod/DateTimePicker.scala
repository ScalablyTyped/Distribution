package typings
package atBlueprintjsDatetimeLib.libEsmDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
@js.native
class DateTimePicker ()
  extends atBlueprintjsCoreLib.atBlueprintjsCoreMod.AbstractPureComponent[IDateTimePickerProps, IDateTimePickerState] {
  def this(props: IDateTimePickerProps) = this()
  def this(props: IDateTimePickerProps, context: js.Any) = this()
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDateTimePicker(nextProps: atBlueprintjsDatetimeLib.libEsmDatePickerMod.IDatePickerProps): scala.Unit = js.native
  def handleDateChange(dateValue: stdLib.Date, isUserChange: scala.Boolean): scala.Unit = js.native
  def handleTimeChange(timeValue: stdLib.Date): scala.Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var defaultProps: atBlueprintjsDatetimeLib.libEsmDateTimePickerMod.IDateTimePickerProps = js.native
  var displayName: java.lang.String = js.native
}

