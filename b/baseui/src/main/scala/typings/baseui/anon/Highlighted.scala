package typings.baseui.anon

import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlighted extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var disabled: Boolean
  
  var highlighted: Boolean
  
  def onBlur(): Unit
  
  def onClick(): Unit
  
  def onFocus(): Unit
  
  def onMouseLeave(): Unit
  
  def onMouseOver(): Unit
  
  def onSelect(): Unit
  
  var peekNextMonth: Boolean
  
  var range: Boolean
  
  var value: Any
}
object Highlighted {
  
  inline def apply(
    adapter: DateIOAdapter[js.Date],
    disabled: Boolean,
    highlighted: Boolean,
    onBlur: () => Unit,
    onClick: () => Unit,
    onFocus: () => Unit,
    onMouseLeave: () => Unit,
    onMouseOver: () => Unit,
    onSelect: () => Unit,
    peekNextMonth: Boolean,
    range: Boolean,
    value: Any
  ): Highlighted = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onClick = js.Any.fromFunction0(onClick), onFocus = js.Any.fromFunction0(onFocus), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onMouseOver = js.Any.fromFunction0(onMouseOver), onSelect = js.Any.fromFunction0(onSelect), peekNextMonth = peekNextMonth.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlighted]
  }
  
  extension [Self <: Highlighted](x: Self) {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    
    inline def setOnMouseOver(value: () => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction0(value))
    
    inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
