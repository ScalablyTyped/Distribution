package typings.carbonComponents

import typings.carbonComponents.anon.CalendarContainer
import typings.carbonComponents.anon.PartialDatePickerOptions
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("carbon-components/components/date-picker/date-picker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DatePicker {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialDatePickerOptions) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/date-picker/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/date-picker/date-picker", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait DatePicker extends StObject {
    
    def _addInputLogic(input: HTMLElement, index: Double): Unit = js.native
    
    def _formatDate(date: js.Date): String = js.native
    
    def _handleBlur(event: FocusEvent): Unit = js.native
    
    def _handleFocus(): Unit = js.native
    
    def _initDatePicker(): Any = js.native
    def _initDatePicker(`type`: String): Any = js.native
    
    def _leftArrowHTML(): String = js.native
    
    // returns a Flatpickr calendar instance
    def _rightArrowHTML(): String = js.native
    
    def _updateClassNames(hasCalendarContainerSelectedDates: CalendarContainer): Unit = js.native
    
    def _updateInputFields(selectedDates: js.Array[js.Date]): Unit = js.native
    def _updateInputFields(selectedDates: js.Array[js.Date], `type`: String): Unit = js.native
    
    def release(): Any = js.native
  }
  
  trait DatePickerOptions extends StObject {
    
    var attribType: String
    
    var classCalendarContainer: String
    
    var classDay: String
    
    var classDays: String
    
    var classFlatpickrCurrentMonth: String
    
    var classFocused: String
    
    var classMonth: String
    
    var classVisuallyHidden: String
    
    var classWeekday: String
    
    var classWeekdays: String
    
    var dateFormat: String
    
    var selectorDatePickerIcon: String
    
    var selectorDatePickerInput: String
    
    var selectorDatePickerInputFrom: String
    
    var selectorDatePickerInputTo: String
    
    var selectorFlatpickrCurrentMonth: String
    
    var selectorFlatpickrMonthYearContainer: String
    
    var selectorFlatpickrYearContainer: String
    
    var selectorInit: String
  }
  object DatePickerOptions {
    
    inline def apply(
      attribType: String,
      classCalendarContainer: String,
      classDay: String,
      classDays: String,
      classFlatpickrCurrentMonth: String,
      classFocused: String,
      classMonth: String,
      classVisuallyHidden: String,
      classWeekday: String,
      classWeekdays: String,
      dateFormat: String,
      selectorDatePickerIcon: String,
      selectorDatePickerInput: String,
      selectorDatePickerInputFrom: String,
      selectorDatePickerInputTo: String,
      selectorFlatpickrCurrentMonth: String,
      selectorFlatpickrMonthYearContainer: String,
      selectorFlatpickrYearContainer: String,
      selectorInit: String
    ): DatePickerOptions = {
      val __obj = js.Dynamic.literal(attribType = attribType.asInstanceOf[js.Any], classCalendarContainer = classCalendarContainer.asInstanceOf[js.Any], classDay = classDay.asInstanceOf[js.Any], classDays = classDays.asInstanceOf[js.Any], classFlatpickrCurrentMonth = classFlatpickrCurrentMonth.asInstanceOf[js.Any], classFocused = classFocused.asInstanceOf[js.Any], classMonth = classMonth.asInstanceOf[js.Any], classVisuallyHidden = classVisuallyHidden.asInstanceOf[js.Any], classWeekday = classWeekday.asInstanceOf[js.Any], classWeekdays = classWeekdays.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], selectorDatePickerIcon = selectorDatePickerIcon.asInstanceOf[js.Any], selectorDatePickerInput = selectorDatePickerInput.asInstanceOf[js.Any], selectorDatePickerInputFrom = selectorDatePickerInputFrom.asInstanceOf[js.Any], selectorDatePickerInputTo = selectorDatePickerInputTo.asInstanceOf[js.Any], selectorFlatpickrCurrentMonth = selectorFlatpickrCurrentMonth.asInstanceOf[js.Any], selectorFlatpickrMonthYearContainer = selectorFlatpickrMonthYearContainer.asInstanceOf[js.Any], selectorFlatpickrYearContainer = selectorFlatpickrYearContainer.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerOptions]
    }
    
    extension [Self <: DatePickerOptions](x: Self) {
      
      inline def setAttribType(value: String): Self = StObject.set(x, "attribType", value.asInstanceOf[js.Any])
      
      inline def setClassCalendarContainer(value: String): Self = StObject.set(x, "classCalendarContainer", value.asInstanceOf[js.Any])
      
      inline def setClassDay(value: String): Self = StObject.set(x, "classDay", value.asInstanceOf[js.Any])
      
      inline def setClassDays(value: String): Self = StObject.set(x, "classDays", value.asInstanceOf[js.Any])
      
      inline def setClassFlatpickrCurrentMonth(value: String): Self = StObject.set(x, "classFlatpickrCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setClassFocused(value: String): Self = StObject.set(x, "classFocused", value.asInstanceOf[js.Any])
      
      inline def setClassMonth(value: String): Self = StObject.set(x, "classMonth", value.asInstanceOf[js.Any])
      
      inline def setClassVisuallyHidden(value: String): Self = StObject.set(x, "classVisuallyHidden", value.asInstanceOf[js.Any])
      
      inline def setClassWeekday(value: String): Self = StObject.set(x, "classWeekday", value.asInstanceOf[js.Any])
      
      inline def setClassWeekdays(value: String): Self = StObject.set(x, "classWeekdays", value.asInstanceOf[js.Any])
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setSelectorDatePickerIcon(value: String): Self = StObject.set(x, "selectorDatePickerIcon", value.asInstanceOf[js.Any])
      
      inline def setSelectorDatePickerInput(value: String): Self = StObject.set(x, "selectorDatePickerInput", value.asInstanceOf[js.Any])
      
      inline def setSelectorDatePickerInputFrom(value: String): Self = StObject.set(x, "selectorDatePickerInputFrom", value.asInstanceOf[js.Any])
      
      inline def setSelectorDatePickerInputTo(value: String): Self = StObject.set(x, "selectorDatePickerInputTo", value.asInstanceOf[js.Any])
      
      inline def setSelectorFlatpickrCurrentMonth(value: String): Self = StObject.set(x, "selectorFlatpickrCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setSelectorFlatpickrMonthYearContainer(value: String): Self = StObject.set(x, "selectorFlatpickrMonthYearContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorFlatpickrYearContainer(value: String): Self = StObject.set(x, "selectorFlatpickrYearContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
