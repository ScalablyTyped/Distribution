package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var `type`: TypeCastExpression
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setType(value: TypeCastExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
