package typings.carbonComponents.datePickerMod

import typings.carbonComponents.anon.CalendarContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait DatePicker extends js.Object {
  def _addInputLogic(input: js.Any, index: js.Any): Unit = js.native
  def _formatDate(date: js.Any): js.Any = js.native
  def _handleBlur(event: js.Any): Unit = js.native
  def _handleFocus(): Unit = js.native
  def _initDatePicker(`type`: js.Any): js.Any = js.native
  def _leftArrowHTML(): String = js.native
  def _rightArrowHTML(): String = js.native
  def _updateClassNames(hasCalendarContainerSelectedDates: CalendarContainer): Unit = js.native
  def _updateInputFields(selectedDates: js.Any, `type`: js.Any): Unit = js.native
  def release(): js.Any = js.native
}

object DatePicker {
  @scala.inline
  def apply(
    _addInputLogic: (js.Any, js.Any) => Unit,
    _formatDate: js.Any => js.Any,
    _handleBlur: js.Any => Unit,
    _handleFocus: () => Unit,
    _initDatePicker: js.Any => js.Any,
    _leftArrowHTML: () => String,
    _rightArrowHTML: () => String,
    _updateClassNames: CalendarContainer => Unit,
    _updateInputFields: (js.Any, js.Any) => Unit,
    release: () => js.Any
  ): DatePicker = {
    val __obj = js.Dynamic.literal(_addInputLogic = js.Any.fromFunction2(_addInputLogic), _formatDate = js.Any.fromFunction1(_formatDate), _handleBlur = js.Any.fromFunction1(_handleBlur), _handleFocus = js.Any.fromFunction0(_handleFocus), _initDatePicker = js.Any.fromFunction1(_initDatePicker), _leftArrowHTML = js.Any.fromFunction0(_leftArrowHTML), _rightArrowHTML = js.Any.fromFunction0(_rightArrowHTML), _updateClassNames = js.Any.fromFunction1(_updateClassNames), _updateInputFields = js.Any.fromFunction2(_updateInputFields), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DatePicker]
  }
  @scala.inline
  implicit class DatePickerOps[Self <: DatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_addInputLogic(value: (js.Any, js.Any) => Unit): Self = this.set("_addInputLogic", js.Any.fromFunction2(value))
    @scala.inline
    def set_formatDate(value: js.Any => js.Any): Self = this.set("_formatDate", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleBlur(value: js.Any => Unit): Self = this.set("_handleBlur", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleFocus(value: () => Unit): Self = this.set("_handleFocus", js.Any.fromFunction0(value))
    @scala.inline
    def set_initDatePicker(value: js.Any => js.Any): Self = this.set("_initDatePicker", js.Any.fromFunction1(value))
    @scala.inline
    def set_leftArrowHTML(value: () => String): Self = this.set("_leftArrowHTML", js.Any.fromFunction0(value))
    @scala.inline
    def set_rightArrowHTML(value: () => String): Self = this.set("_rightArrowHTML", js.Any.fromFunction0(value))
    @scala.inline
    def set_updateClassNames(value: CalendarContainer => Unit): Self = this.set("_updateClassNames", js.Any.fromFunction1(value))
    @scala.inline
    def set_updateInputFields(value: (js.Any, js.Any) => Unit): Self = this.set("_updateInputFields", js.Any.fromFunction2(value))
    @scala.inline
    def setRelease(value: () => js.Any): Self = this.set("release", js.Any.fromFunction0(value))
  }
  
}

