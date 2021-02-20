package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var open: js.UndefOr[Boolean | String] = js.native
}
object DialogHTMLAttributes {
  
  @scala.inline
  def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DialogHTMLAttributesMutableBuilder[Self <: DialogHTMLAttributes[_], T] (val x: Self with DialogHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setOpen(value: Boolean | String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
