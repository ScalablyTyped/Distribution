package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineExpressionRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  var Expression: typings.awsSdk.cloudsearchMod.Expression
}
object DefineExpressionRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, Expression: Expression): DefineExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineExpressionRequest]
  }
  
  @scala.inline
  implicit class DefineExpressionRequestMutableBuilder[Self <: DefineExpressionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
