package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var `type`: FunctionExpression
}
object `193` {
  
  inline def apply(): `193` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `193`] (val x: Self) extends AnyVal {
    
    inline def setType(value: FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
