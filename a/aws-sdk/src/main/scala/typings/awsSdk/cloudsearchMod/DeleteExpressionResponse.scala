package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteExpressionResponse extends StObject {
  
  /**
    * The status of the expression being deleted.
    */
  var Expression: ExpressionStatus = js.native
}
object DeleteExpressionResponse {
  
  @scala.inline
  def apply(Expression: ExpressionStatus): DeleteExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionResponse]
  }
  
  @scala.inline
  implicit class DeleteExpressionResponseMutableBuilder[Self <: DeleteExpressionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: ExpressionStatus): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
