package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageFallback[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]] = js.undefined
}
object PageFallback {
  
  inline def apply[TLength](): PageFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFallback[TLength]]
  }
  
  extension [Self <: PageFallback[?], TLength](x: Self & PageFallback[TLength]) {
    
    inline def setSize(value: PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: PageSizeProperty[TLength]*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
