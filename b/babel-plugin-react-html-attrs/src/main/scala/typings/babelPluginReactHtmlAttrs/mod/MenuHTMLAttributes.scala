package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MenuHTMLAttributes {
  
  inline def apply[T](): MenuHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuHTMLAttributes[T]]
  }
  
  extension [Self <: MenuHTMLAttributes[?], T](x: Self & MenuHTMLAttributes[T]) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
