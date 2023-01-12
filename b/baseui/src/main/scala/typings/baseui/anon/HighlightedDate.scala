package typings.baseui.anon

import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightedDate extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var highlightedDate: Any
  
  def onChange(): Unit
  
  def onDayBlur(): Unit
  
  def onDayClick(): Unit
  
  def onDayFocus(): Unit
  
  def onDayMouseLeave(): Unit
  
  def onDayMouseOver(): Unit
  
  var peekNextMonth: Boolean
}
object HighlightedDate {
  
  inline def apply(
    adapter: DateIOAdapter[js.Date],
    highlightedDate: Any,
    onChange: () => Unit,
    onDayBlur: () => Unit,
    onDayClick: () => Unit,
    onDayFocus: () => Unit,
    onDayMouseLeave: () => Unit,
    onDayMouseOver: () => Unit,
    peekNextMonth: Boolean
  ): HighlightedDate = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onDayBlur = js.Any.fromFunction0(onDayBlur), onDayClick = js.Any.fromFunction0(onDayClick), onDayFocus = js.Any.fromFunction0(onDayFocus), onDayMouseLeave = js.Any.fromFunction0(onDayMouseLeave), onDayMouseOver = js.Any.fromFunction0(onDayMouseOver), peekNextMonth = peekNextMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightedDate] (val x: Self) extends AnyVal {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDate(value: Any): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnDayBlur(value: () => Unit): Self = StObject.set(x, "onDayBlur", js.Any.fromFunction0(value))
    
    inline def setOnDayClick(value: () => Unit): Self = StObject.set(x, "onDayClick", js.Any.fromFunction0(value))
    
    inline def setOnDayFocus(value: () => Unit): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction0(value))
    
    inline def setOnDayMouseLeave(value: () => Unit): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction0(value))
    
    inline def setOnDayMouseOver(value: () => Unit): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction0(value))
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
  }
}
