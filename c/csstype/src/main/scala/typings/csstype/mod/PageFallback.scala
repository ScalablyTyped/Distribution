package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageFallback[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]] = js.undefined
}
object PageFallback {
  
  @scala.inline
  def apply[TLength](): PageFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFallback[TLength]]
  }
  
  @scala.inline
  implicit class PageFallbackMutableBuilder[Self <: PageFallback[?], TLength] (val x: Self & PageFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def setSize(value: PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: PageSizeProperty[TLength]*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
