package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var max: js.UndefOr[Double | String] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
}
object ProgressHTMLAttributes {
  
  @scala.inline
  def apply[T](): ProgressHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ProgressHTMLAttributesMutableBuilder[Self <: ProgressHTMLAttributes[_], T] (val x: Self with ProgressHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
