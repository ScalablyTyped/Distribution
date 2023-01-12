package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXSpreadAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var `type`: JSXSpreadAttribute
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
