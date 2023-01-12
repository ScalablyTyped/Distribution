package typings.blueprintjsDatetime

import typings.blueprintjsCore.mod.AbstractPureComponent2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmDatePickerCaptionMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCaption", "DatePickerCaption")
  @js.native
  open class DatePickerCaption protected ()
    extends AbstractPureComponent2[IDatePickerCaptionProps, IDatePickerCaptionState, js.Object] {
    def this(props: IDatePickerCaptionProps) = this()
    def this(props: IDatePickerCaptionProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDatePickerCaption(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDatePickerCaption(): Unit = js.native
    
    /* private */ var containerElement: Any = js.native
    
    /* private */ var dateChangeHandler: Any = js.native
    
    /* private */ var displayedMonthText: Any = js.native
    
    /* private */ var handleMonthSelectChange: Any = js.native
    
    /* private */ var handleYearSelectChange: Any = js.native
    
    /* private */ var positionArrows: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CaptionElementProps * / any */ trait IDatePickerCaptionProps extends StObject {
    
    var maxDate: js.Date
    
    var minDate: js.Date
    
    /** Callback invoked when the month or year `<select>` is changed. */
    var onDateChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.undefined
    
    var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.undefined
    
    var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  }
  object IDatePickerCaptionProps {
    
    inline def apply(maxDate: js.Date, minDate: js.Date): IDatePickerCaptionProps = {
      val __obj = js.Dynamic.literal(maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerCaptionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDatePickerCaptionProps] (val x: Self) extends AnyVal {
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setOnDateChange(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnMonthChange(value: /* month */ Double => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnYearChange(value: /* year */ Double => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
      
      inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
      
      inline def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      inline def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
    }
  }
  
  trait IDatePickerCaptionState extends StObject {
    
    var monthRightOffset: Double
  }
  object IDatePickerCaptionState {
    
    inline def apply(monthRightOffset: Double): IDatePickerCaptionState = {
      val __obj = js.Dynamic.literal(monthRightOffset = monthRightOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerCaptionState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDatePickerCaptionState] (val x: Self) extends AnyVal {
      
      inline def setMonthRightOffset(value: Double): Self = StObject.set(x, "monthRightOffset", value.asInstanceOf[js.Any])
    }
  }
}
