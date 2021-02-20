package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageHyphenFallback[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]] = js.native
}
object PageHyphenFallback {
  
  @scala.inline
  def apply[TLength](): PageHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphenFallback[TLength]]
  }
  
  @scala.inline
  implicit class PageHyphenFallbackMutableBuilder[Self <: PageHyphenFallback[_], TLength] (val x: Self with PageHyphenFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def setSize(value: PageSizeProperty[TLength] | js.Array[PageSizeProperty[TLength]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: PageSizeProperty[TLength]*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
