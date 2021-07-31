package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExpressionsResponse extends StObject {
  
  /**
    * The expressions configured for the domain.
    */
  var Expressions: ExpressionStatusList
}
object DescribeExpressionsResponse {
  
  @scala.inline
  def apply(Expressions: ExpressionStatusList): DescribeExpressionsResponse = {
    val __obj = js.Dynamic.literal(Expressions = Expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExpressionsResponse]
  }
  
  @scala.inline
  implicit class DescribeExpressionsResponseMutableBuilder[Self <: DescribeExpressionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: ExpressionStatusList): Self = StObject.set(x, "Expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: ExpressionStatus*): Self = StObject.set(x, "Expressions", js.Array(value :_*))
  }
}
