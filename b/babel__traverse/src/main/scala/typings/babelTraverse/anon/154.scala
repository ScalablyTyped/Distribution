package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  var `type`: JSXNamespacedName
}
object `154` {
  
  inline def apply(): `154` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `154`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
