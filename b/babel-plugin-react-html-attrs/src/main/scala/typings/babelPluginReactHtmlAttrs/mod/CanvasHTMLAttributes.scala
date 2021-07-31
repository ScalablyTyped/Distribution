package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object CanvasHTMLAttributes {
  
  @scala.inline
  def apply[T](): CanvasHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class CanvasHTMLAttributesMutableBuilder[Self <: CanvasHTMLAttributes[?], T] (val x: Self & CanvasHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
