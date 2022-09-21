package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `169` extends StObject {
  
  var `type`: ConditionalExpression
}
object `169` {
  
  inline def apply(): `169` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[`169`]
  }
  
  extension [Self <: `169`](x: Self) {
    
    inline def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
