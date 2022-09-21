package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlowLogsIntegrationTemplateRequest extends StObject {
  
  /**
    * To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
    */
  var ConfigDeliveryS3DestinationArn: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the flow log.
    */
  var FlowLogId: VpcFlowLogId
  
  /**
    * Information about the service integration.
    */
  var IntegrateServices: typings.awsSdk.ec2Mod.IntegrateServices
}
object GetFlowLogsIntegrationTemplateRequest {
  
  inline def apply(
    ConfigDeliveryS3DestinationArn: String,
    FlowLogId: VpcFlowLogId,
    IntegrateServices: IntegrateServices
  ): GetFlowLogsIntegrationTemplateRequest = {
    val __obj = js.Dynamic.literal(ConfigDeliveryS3DestinationArn = ConfigDeliveryS3DestinationArn.asInstanceOf[js.Any], FlowLogId = FlowLogId.asInstanceOf[js.Any], IntegrateServices = IntegrateServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowLogsIntegrationTemplateRequest]
  }
  
  extension [Self <: GetFlowLogsIntegrationTemplateRequest](x: Self) {
    
    inline def setConfigDeliveryS3DestinationArn(value: String): Self = StObject.set(x, "ConfigDeliveryS3DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFlowLogId(value: VpcFlowLogId): Self = StObject.set(x, "FlowLogId", value.asInstanceOf[js.Any])
    
    inline def setIntegrateServices(value: IntegrateServices): Self = StObject.set(x, "IntegrateServices", value.asInstanceOf[js.Any])
  }
}
