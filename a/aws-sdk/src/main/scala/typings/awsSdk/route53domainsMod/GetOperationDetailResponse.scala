package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationDetailResponse extends StObject {
  
  /**
    * The name of a domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.route53domainsMod.DomainName] = js.undefined
  
  /**
    * Detailed information on the status including possible errors.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The identifier for the operation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.undefined
  
  /**
    * The current status of the requested operation in the system.
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
  
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The type of operation that was requested.
    */
  var Type: js.UndefOr[OperationType] = js.undefined
}
object GetOperationDetailResponse {
  
  @scala.inline
  def apply(): GetOperationDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationDetailResponse]
  }
  
  @scala.inline
  implicit class GetOperationDetailResponseMutableBuilder[Self <: GetOperationDetailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    @scala.inline
    def setStatus(value: OperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubmittedDate(value: Timestamp): Self = StObject.set(x, "SubmittedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedDateUndefined: Self = StObject.set(x, "SubmittedDate", js.undefined)
    
    @scala.inline
    def setType(value: OperationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
