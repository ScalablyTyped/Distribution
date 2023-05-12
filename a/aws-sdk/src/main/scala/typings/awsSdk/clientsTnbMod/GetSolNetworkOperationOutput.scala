package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkOperationOutput extends StObject {
  
  /**
    * Network operation ARN.
    */
  var arn: NsLcmOpOccArn
  
  /**
    * Error related to this specific network operation occurrence.
    */
  var error: js.UndefOr[ProblemDetails] = js.undefined
  
  /**
    * ID of this network operation occurrence.
    */
  var id: js.UndefOr[NsLcmOpOccId] = js.undefined
  
  /**
    * Type of the operation represented by this occurrence.
    */
  var lcmOperationType: js.UndefOr[LcmOperationType] = js.undefined
  
  /**
    * Metadata of this network operation occurrence.
    */
  var metadata: js.UndefOr[GetSolNetworkOperationMetadata] = js.undefined
  
  /**
    * ID of the network operation instance.
    */
  var nsInstanceId: js.UndefOr[NsInstanceId] = js.undefined
  
  /**
    * The state of the network operation.
    */
  var operationState: js.UndefOr[NsLcmOperationState] = js.undefined
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * All tasks associated with this operation occurrence.
    */
  var tasks: js.UndefOr[GetSolNetworkOperationTasksList] = js.undefined
}
object GetSolNetworkOperationOutput {
  
  inline def apply(arn: NsLcmOpOccArn): GetSolNetworkOperationOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkOperationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkOperationOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsLcmOpOccArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProblemDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: NsLcmOpOccId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLcmOperationType(value: LcmOperationType): Self = StObject.set(x, "lcmOperationType", value.asInstanceOf[js.Any])
    
    inline def setLcmOperationTypeUndefined: Self = StObject.set(x, "lcmOperationType", js.undefined)
    
    inline def setMetadata(value: GetSolNetworkOperationMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceIdUndefined: Self = StObject.set(x, "nsInstanceId", js.undefined)
    
    inline def setOperationState(value: NsLcmOperationState): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    inline def setOperationStateUndefined: Self = StObject.set(x, "operationState", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTasks(value: GetSolNetworkOperationTasksList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: GetSolNetworkOperationTaskDetails*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
