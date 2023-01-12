package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/menu/types.StatefulContainerState> */
trait PartialStatefulContainerS extends StObject {
  
  var activedescendantId: js.UndefOr[String | Null] = js.undefined
  
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
}
object PartialStatefulContainerS {
  
  inline def apply(): PartialStatefulContainerS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatefulContainerS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStatefulContainerS] (val x: Self) extends AnyVal {
    
    inline def setActivedescendantId(value: String): Self = StObject.set(x, "activedescendantId", value.asInstanceOf[js.Any])
    
    inline def setActivedescendantIdNull: Self = StObject.set(x, "activedescendantId", null)
    
    inline def setActivedescendantIdUndefined: Self = StObject.set(x, "activedescendantId", js.undefined)
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
  }
}
