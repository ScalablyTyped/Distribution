package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightedIndex extends StObject {
  
  var highlightedIndex: Double
  
  var isFocused: Boolean
}
object HighlightedIndex {
  
  inline def apply(highlightedIndex: Double, isFocused: Boolean): HighlightedIndex = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightedIndex] (val x: Self) extends AnyVal {
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}
