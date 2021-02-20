package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteExpressionRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  
  /**
    * The name of the Expression to delete.
    */
  var ExpressionName: StandardName = js.native
}
object DeleteExpressionRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, ExpressionName: StandardName): DeleteExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ExpressionName = ExpressionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionRequest]
  }
  
  @scala.inline
  implicit class DeleteExpressionRequestMutableBuilder[Self <: DeleteExpressionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionName(value: StandardName): Self = StObject.set(x, "ExpressionName", value.asInstanceOf[js.Any])
  }
}
