package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHyphen[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength]] = js.undefined
}
object PageHyphen {
  
  @scala.inline
  def apply[TLength](): PageHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphen[TLength]]
  }
  
  @scala.inline
  implicit class PageHyphenMutableBuilder[Self <: PageHyphen[?], TLength] (val x: Self & PageHyphen[TLength]) extends AnyVal {
    
    @scala.inline
    def setSize(value: PageSizeProperty[TLength]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
