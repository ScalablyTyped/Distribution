package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TupleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var `type`: TupleExpression
}
object `208` {
  
  inline def apply(): `208` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setType(value: TupleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
