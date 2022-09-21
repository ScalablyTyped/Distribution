package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressEvent extends StObject {
  
  /**
    * For requests with a status of FAILED, the associated error code. For error code definitions, see Handler error codes in the CloudFormation Command Line Interface User Guide for Extension Development.
    */
  var ErrorCode: js.UndefOr[HandlerErrorCode] = js.undefined
  
  /**
    * When the resource operation request was initiated.
    */
  var EventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The primary identifier for the resource.  In some cases, the resource identifier may be available before the resource operation has reached a status of SUCCESS. 
    */
  var Identifier: js.UndefOr[typings.awsSdk.cloudcontrolMod.Identifier] = js.undefined
  
  /**
    * The resource operation type.
    */
  var Operation: js.UndefOr[typings.awsSdk.cloudcontrolMod.Operation] = js.undefined
  
  /**
    * The current status of the resource operation request.    PENDING: The resource operation hasn't yet started.    IN_PROGRESS: The resource operation is currently in progress.    SUCCESS: The resource operation has successfully completed.    FAILED: The resource operation has failed. Refer to the error code and status message for more information.    CANCEL_IN_PROGRESS: The resource operation is in the process of being canceled.    CANCEL_COMPLETE: The resource operation has been canceled.  
    */
  var OperationStatus: js.UndefOr[typings.awsSdk.cloudcontrolMod.OperationStatus] = js.undefined
  
  /**
    * The unique token representing this resource operation request. Use the RequestToken with GetResourceRequestStatus to return the current status of a resource operation request.
    */
  var RequestToken: js.UndefOr[typings.awsSdk.cloudcontrolMod.RequestToken] = js.undefined
  
  /**
    * A JSON string containing the resource model, consisting of each resource property and its current value.
    */
  var ResourceModel: js.UndefOr[Properties] = js.undefined
  
  /**
    * When to next request the status of this resource operation request.
    */
  var RetryAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Any message explaining the current status.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.cloudcontrolMod.StatusMessage] = js.undefined
  
  /**
    * The name of the resource type used in the operation.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudcontrolMod.TypeName] = js.undefined
}
object ProgressEvent {
  
  inline def apply(): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEvent]
  }
  
  extension [Self <: ProgressEvent](x: Self) {
    
    inline def setErrorCode(value: HandlerErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationStatus(value: OperationStatus): Self = StObject.set(x, "OperationStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationStatusUndefined: Self = StObject.set(x, "OperationStatus", js.undefined)
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUndefined: Self = StObject.set(x, "RequestToken", js.undefined)
    
    inline def setResourceModel(value: Properties): Self = StObject.set(x, "ResourceModel", value.asInstanceOf[js.Any])
    
    inline def setResourceModelUndefined: Self = StObject.set(x, "ResourceModel", js.undefined)
    
    inline def setRetryAfter(value: js.Date): Self = StObject.set(x, "RetryAfter", value.asInstanceOf[js.Any])
    
    inline def setRetryAfterUndefined: Self = StObject.set(x, "RetryAfter", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
