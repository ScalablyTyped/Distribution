package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowDefinitionSummary extends StObject {
  
  /**
    * The timestamp when SageMaker created the flow definition.
    */
  var CreationTime: Timestamp
  
  /**
    * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition status is Failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typings.awsSdk.sagemakerMod.FlowDefinitionArn
  
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName
  
  /**
    * The status of the flow definition. Valid values:
    */
  var FlowDefinitionStatus: typings.awsSdk.sagemakerMod.FlowDefinitionStatus
}
object FlowDefinitionSummary {
  
  inline def apply(
    CreationTime: Timestamp,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus
  ): FlowDefinitionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionSummary]
  }
  
  extension [Self <: FlowDefinitionSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionStatus(value: FlowDefinitionStatus): Self = StObject.set(x, "FlowDefinitionStatus", value.asInstanceOf[js.Any])
  }
}
