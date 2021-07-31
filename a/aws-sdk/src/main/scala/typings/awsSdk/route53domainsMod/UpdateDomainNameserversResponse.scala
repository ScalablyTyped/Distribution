package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainNameserversResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: typings.awsSdk.route53domainsMod.OperationId
}
object UpdateDomainNameserversResponse {
  
  @scala.inline
  def apply(OperationId: OperationId): UpdateDomainNameserversResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameserversResponse]
  }
  
  @scala.inline
  implicit class UpdateDomainNameserversResponseMutableBuilder[Self <: UpdateDomainNameserversResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
