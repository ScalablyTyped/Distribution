package typings.baseui.datepickerTypesMod

import typings.baseui.anon.DateTEventEvent
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthProps[T]
  extends StObject
     with WeekProps[T] {
  
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
}
object MonthProps {
  
  inline def apply[T](
    adapter: DateIOAdapter[T],
    date: T,
    density: Density,
    focusedCalendar: Boolean,
    hasLockedBehavior: Boolean,
    onDayBlur: DateTEventEvent[T] => Any,
    onDayClick: DateTEventEvent[T] => Any,
    onDayFocus: DateTEventEvent[T] => Any,
    onDayMouseLeave: DateTEventEvent[T] => Any,
    onDayMouseOver: DateTEventEvent[T] => Any,
    peekNextMonth: Boolean
  ): MonthProps[T] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], focusedCalendar = focusedCalendar.asInstanceOf[js.Any], hasLockedBehavior = hasLockedBehavior.asInstanceOf[js.Any], onDayBlur = js.Any.fromFunction1(onDayBlur), onDayClick = js.Any.fromFunction1(onDayClick), onDayFocus = js.Any.fromFunction1(onDayFocus), onDayMouseLeave = js.Any.fromFunction1(onDayMouseLeave), onDayMouseOver = js.Any.fromFunction1(onDayMouseOver), peekNextMonth = peekNextMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonthProps[?], T] (val x: Self & MonthProps[T]) extends AnyVal {
    
    inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
    
    inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
  }
}
