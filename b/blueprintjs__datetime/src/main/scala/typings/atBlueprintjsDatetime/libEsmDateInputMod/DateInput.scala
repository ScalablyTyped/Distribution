package typings.atBlueprintjsDatetime.libEsmDateInputMod

import typings.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractPureComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput")
@js.native
class DateInput () extends AbstractPureComponent[IDateInputProps, IDateInputState] {
  var handleClosePopover: js.Any = js.native
  var handleDateChange: js.Any = js.native
  var handleInputBlur: js.Any = js.native
  var handleInputChange: js.Any = js.native
  var handleInputClick: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleInputKeyDown: js.Any = js.native
  var handlePopoverBlur: js.Any = js.native
  var inputEl: js.Any = js.native
  var inputRef: js.Any = js.native
  var lastElementInPopover: js.Any = js.native
  var popoverContentEl: js.Any = js.native
  var registerPopoverBlurHandler: js.Any = js.native
  var unregisterPopoverBlurHandler: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDateInput(nextProps: IDateInputProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDateInput(): Unit = js.native
  /* private */ def formatDate(date: js.Any): js.Any = js.native
  /* private */ def hasMonthChanged(prevDate: js.Any, nextDate: js.Any): js.Any = js.native
  /* private */ def hasTimeChanged(prevDate: js.Any, nextDate: js.Any): js.Any = js.native
  /* private */ def isDateInRange(value: js.Any): js.Any = js.native
  /* private */ def parseDate(dateString: js.Any): js.Any = js.native
  /** safe wrapper around invoking input props event handler (prop defaults to undefined) */
  /* private */ def safeInvokeInputProp(name: js.Any, e: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateInput", "DateInput")
@js.native
object DateInput extends js.Object {
  var defaultProps: Partial[IDateInputProps] = js.native
  var displayName: String = js.native
}

