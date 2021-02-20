package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var name: js.UndefOr[String] = js.native
}
object SlotHTMLAttributes {
  
  @scala.inline
  def apply[T](): SlotHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class SlotHTMLAttributesMutableBuilder[Self <: SlotHTMLAttributes[_], T] (val x: Self with SlotHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
