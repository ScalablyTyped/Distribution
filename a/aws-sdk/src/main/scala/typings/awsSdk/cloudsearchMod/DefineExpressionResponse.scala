package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineExpressionResponse extends StObject {
  
  var Expression: ExpressionStatus
}
object DefineExpressionResponse {
  
  inline def apply(Expression: ExpressionStatus): DefineExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineExpressionResponse]
  }
  
  extension [Self <: DefineExpressionResponse](x: Self) {
    
    inline def setExpression(value: ExpressionStatus): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
