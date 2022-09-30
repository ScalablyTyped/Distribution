package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.ltr
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BdoHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  @JSName("dir")
  var dir_BdoHTMLAttributes: js.UndefOr[ltr | rtl] = js.undefined
}
object BdoHTMLAttributes {
  
  inline def apply[T](): BdoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BdoHTMLAttributes[T]]
  }
  
  extension [Self <: BdoHTMLAttributes[?], T](x: Self & BdoHTMLAttributes[T]) {
    
    inline def setDir(value: ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
  }
}
