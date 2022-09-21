package typings.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationContainerState[T] extends StObject {
  
  var highlightedDate: js.UndefOr[T | Null] = js.undefined
  
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  var lastHighlightedDate: js.UndefOr[T] = js.undefined
}
object NavigationContainerState {
  
  inline def apply[T](): NavigationContainerState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerState[T]]
  }
  
  extension [Self <: NavigationContainerState[?], T](x: Self & NavigationContainerState[T]) {
    
    inline def setHighlightedDate(value: T): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDateNull: Self = StObject.set(x, "highlightedDate", null)
    
    inline def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setLastHighlightedDate(value: T): Self = StObject.set(x, "lastHighlightedDate", value.asInstanceOf[js.Any])
    
    inline def setLastHighlightedDateUndefined: Self = StObject.set(x, "lastHighlightedDate", js.undefined)
  }
}
