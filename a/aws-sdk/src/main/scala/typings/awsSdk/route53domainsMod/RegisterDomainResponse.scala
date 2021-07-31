package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDomainResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: typings.awsSdk.route53domainsMod.OperationId
}
object RegisterDomainResponse {
  
  @scala.inline
  def apply(OperationId: OperationId): RegisterDomainResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainResponse]
  }
  
  @scala.inline
  implicit class RegisterDomainResponseMutableBuilder[Self <: RegisterDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
