package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHyphenFallback[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]] = js.undefined
}
object PageHyphenFallback {
  
  inline def apply[TLength](): PageHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphenFallback[TLength]]
  }
  
  extension [Self <: PageHyphenFallback[?], TLength](x: Self & PageHyphenFallback[TLength]) {
    
    inline def setSize(value: PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: PageSizeProperty[TLength]*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
