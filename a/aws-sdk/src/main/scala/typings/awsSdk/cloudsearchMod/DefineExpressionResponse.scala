package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineExpressionResponse extends StObject {
  
  var Expression: ExpressionStatus
}
object DefineExpressionResponse {
  
  @scala.inline
  def apply(Expression: ExpressionStatus): DefineExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineExpressionResponse]
  }
  
  @scala.inline
  implicit class DefineExpressionResponseMutableBuilder[Self <: DefineExpressionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: ExpressionStatus): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
