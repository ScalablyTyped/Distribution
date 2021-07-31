package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("carbon-components/components/date-picker/date-picker", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with DatePicker {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _addInputLogic(input: js.Any, index: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _formatDate(date: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def _handleBlur(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _handleFocus(): Unit = js.native
    
    /* CompleteClass */
    override def _initDatePicker(`type`: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def _leftArrowHTML(): String = js.native
    
    /* CompleteClass */
    override def _rightArrowHTML(): String = js.native
    
    /* CompleteClass */
    override def _updateClassNames(hasCalendarContainerSelectedDates: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _updateInputFields(selectedDates: js.Any, `type`: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def release(): js.Any = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/date-picker/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/date-picker/date-picker", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait DatePicker extends StObject {
    
    def _addInputLogic(input: js.Any, index: js.Any): Unit
    
    def _formatDate(date: js.Any): js.Any
    
    def _handleBlur(event: js.Any): Unit
    
    def _handleFocus(): Unit
    
    def _initDatePicker(`type`: js.Any): js.Any
    
    def _leftArrowHTML(): String
    
    def _rightArrowHTML(): String
    
    def _updateClassNames(hasCalendarContainerSelectedDates: js.Any): Unit
    
    def _updateInputFields(selectedDates: js.Any, `type`: js.Any): Unit
    
    def release(): js.Any
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
      _updateClassNames: js.Any => Unit,
      _updateInputFields: (js.Any, js.Any) => Unit,
      release: () => js.Any
    ): DatePicker = {
      val __obj = js.Dynamic.literal(_addInputLogic = js.Any.fromFunction2(_addInputLogic), _formatDate = js.Any.fromFunction1(_formatDate), _handleBlur = js.Any.fromFunction1(_handleBlur), _handleFocus = js.Any.fromFunction0(_handleFocus), _initDatePicker = js.Any.fromFunction1(_initDatePicker), _leftArrowHTML = js.Any.fromFunction0(_leftArrowHTML), _rightArrowHTML = js.Any.fromFunction0(_rightArrowHTML), _updateClassNames = js.Any.fromFunction1(_updateClassNames), _updateInputFields = js.Any.fromFunction2(_updateInputFields), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[DatePicker]
    }
    
    @scala.inline
    implicit class DatePickerMutableBuilder[Self <: DatePicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelease(value: () => js.Any): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_addInputLogic(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_addInputLogic", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_formatDate(value: js.Any => js.Any): Self = StObject.set(x, "_formatDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleBlur(value: js.Any => Unit): Self = StObject.set(x, "_handleBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleFocus(value: () => Unit): Self = StObject.set(x, "_handleFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_initDatePicker(value: js.Any => js.Any): Self = StObject.set(x, "_initDatePicker", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_leftArrowHTML(value: () => String): Self = StObject.set(x, "_leftArrowHTML", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_rightArrowHTML(value: () => String): Self = StObject.set(x, "_rightArrowHTML", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_updateClassNames(value: js.Any => Unit): Self = StObject.set(x, "_updateClassNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_updateInputFields(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_updateInputFields", js.Any.fromFunction2(value))
    }
  }
}
