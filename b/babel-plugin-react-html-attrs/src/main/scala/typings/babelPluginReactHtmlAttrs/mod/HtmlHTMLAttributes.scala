package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var manifest: js.UndefOr[String] = js.undefined
}
object HtmlHTMLAttributes {
  
  @scala.inline
  def apply[T](): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class HtmlHTMLAttributesMutableBuilder[Self <: HtmlHTMLAttributes[?], T] (val x: Self & HtmlHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
