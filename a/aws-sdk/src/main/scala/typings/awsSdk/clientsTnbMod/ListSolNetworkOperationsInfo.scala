package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkOperationsInfo extends StObject {
  
  /**
    * Network operation ARN.
    */
  var arn: NsLcmOpOccArn
  
  /**
    * Error related to this specific network operation.
    */
  var error: js.UndefOr[ProblemDetails] = js.undefined
  
  /**
    * ID of this network operation.
    */
  var id: NsLcmOpOccId
  
  /**
    * Type of lifecycle management network operation.
    */
  var lcmOperationType: LcmOperationType
  
  /**
    * Metadata related to this network operation.
    */
  var metadata: js.UndefOr[ListSolNetworkOperationsMetadata] = js.undefined
  
  /**
    * ID of the network instance related to this operation.
    */
  var nsInstanceId: NsInstanceId
  
  /**
    * The state of the network operation.
    */
  var operationState: NsLcmOperationState
}
object ListSolNetworkOperationsInfo {
  
  inline def apply(
    arn: NsLcmOpOccArn,
    id: NsLcmOpOccId,
    lcmOperationType: LcmOperationType,
    nsInstanceId: NsInstanceId,
    operationState: NsLcmOperationState
  ): ListSolNetworkOperationsInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lcmOperationType = lcmOperationType.asInstanceOf[js.Any], nsInstanceId = nsInstanceId.asInstanceOf[js.Any], operationState = operationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolNetworkOperationsInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkOperationsInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsLcmOpOccArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProblemDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: NsLcmOpOccId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLcmOperationType(value: LcmOperationType): Self = StObject.set(x, "lcmOperationType", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ListSolNetworkOperationsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setOperationState(value: NsLcmOperationState): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
  }
}
