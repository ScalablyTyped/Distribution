package typings.baseui.menuTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerState extends StObject {
  
  var activedescendantId: js.UndefOr[String | Null] = js.undefined
  
  var highlightedIndex: Double
  
  var isFocused: Boolean
}
object StatefulContainerState {
  
  inline def apply(highlightedIndex: Double, isFocused: Boolean): StatefulContainerState = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerState]
  }
  
  extension [Self <: StatefulContainerState](x: Self) {
    
    inline def setActivedescendantId(value: String): Self = StObject.set(x, "activedescendantId", value.asInstanceOf[js.Any])
    
    inline def setActivedescendantIdNull: Self = StObject.set(x, "activedescendantId", null)
    
    inline def setActivedescendantIdUndefined: Self = StObject.set(x, "activedescendantId", js.undefined)
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}
