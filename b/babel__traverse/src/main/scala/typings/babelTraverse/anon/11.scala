package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var `type`: TypeCastExpression
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setType(value: TypeCastExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
