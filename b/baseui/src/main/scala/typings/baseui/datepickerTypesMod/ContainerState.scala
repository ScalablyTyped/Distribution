package typings.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerState[T] extends StObject {
  
  var highlightedDate: js.UndefOr[T | Null] = js.undefined
  
  /** Selected `Date`. If `range` is set, `value` is an array of 2 values. */
  var value: js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])] = js.undefined
}
object ContainerState {
  
  inline def apply[T](): ContainerState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState[T]]
  }
  
  extension [Self <: ContainerState[?], T](x: Self & ContainerState[T]) {
    
    inline def setHighlightedDate(value: T): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDateNull: Self = StObject.set(x, "highlightedDate", null)
    
    inline def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    inline def setValue(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
