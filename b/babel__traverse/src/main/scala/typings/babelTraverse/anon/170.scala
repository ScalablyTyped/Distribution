package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  var `type`: ConditionalExpression
}
object `170` {
  
  inline def apply(): `170` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `170`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
