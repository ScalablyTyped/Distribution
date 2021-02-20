package typings.blueprintjsDatetime

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.reactDayPicker.classNamesMod.ClassNames
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.propsMod.CaptionElementProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCaptionMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCaption", "DatePickerCaption")
  @js.native
  class DatePickerCaption protected ()
    extends AbstractPureComponent2[IDatePickerCaptionProps, IDatePickerCaptionState, js.Object] {
    def this(props: IDatePickerCaptionProps) = this()
    def this(props: IDatePickerCaptionProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDatePickerCaption(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDatePickerCaption(): Unit = js.native
    
    var containerElement: js.Any = js.native
    
    var dateChangeHandler: js.Any = js.native
    
    var displayedMonthText: js.Any = js.native
    
    var handleMonthSelectChange: js.Any = js.native
    
    var handleYearSelectChange: js.Any = js.native
    
    var positionArrows: js.Any = js.native
  }
  
  @js.native
  trait IDatePickerCaptionProps extends CaptionElementProps {
    
    var maxDate: Date = js.native
    
    var minDate: Date = js.native
    
    /** Callback invoked when the month or year `<select>` is changed. */
    var onDateChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    
    var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.native
    
    var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.native
    
    var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
  }
  object IDatePickerCaptionProps {
    
    @scala.inline
    def apply(
      classNames: ClassNames,
      date: Date,
      locale: String,
      localeUtils: LocaleUtils,
      maxDate: Date,
      minDate: Date
    ): IDatePickerCaptionProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerCaptionProps]
    }
    
    @scala.inline
    implicit class IDatePickerCaptionPropsMutableBuilder[Self <: IDatePickerCaptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDateChange(value: /* date */ Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      @scala.inline
      def setOnMonthChange(value: /* month */ Double => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      @scala.inline
      def setOnYearChange(value: /* year */ Double => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
      
      @scala.inline
      def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
    }
  }
  
  @js.native
  trait IDatePickerCaptionState extends StObject {
    
    var monthRightOffset: Double = js.native
  }
  object IDatePickerCaptionState {
    
    @scala.inline
    def apply(monthRightOffset: Double): IDatePickerCaptionState = {
      val __obj = js.Dynamic.literal(monthRightOffset = monthRightOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerCaptionState]
    }
    
    @scala.inline
    implicit class IDatePickerCaptionStateMutableBuilder[Self <: IDatePickerCaptionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonthRightOffset(value: Double): Self = StObject.set(x, "monthRightOffset", value.asInstanceOf[js.Any])
    }
  }
}
