package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEdgeDeploymentPlanRequest extends StObject {
  
  /**
    * The device fleet used for this edge deployment plan.
    */
  var DeviceFleetName: EntityName
  
  /**
    * The name of the edge deployment plan.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * List of models associated with the edge deployment plan.
    */
  var ModelConfigs: EdgeDeploymentModelConfigs
  
  /**
    * List of stages of the edge deployment plan. The number of stages is limited to 10 per deployment.
    */
  var Stages: js.UndefOr[DeploymentStages] = js.undefined
  
  /**
    * List of tags with which to tag the edge deployment plan.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateEdgeDeploymentPlanRequest {
  
  inline def apply(
    DeviceFleetName: EntityName,
    EdgeDeploymentPlanName: EntityName,
    ModelConfigs: EdgeDeploymentModelConfigs
  ): CreateEdgeDeploymentPlanRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], ModelConfigs = ModelConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEdgeDeploymentPlanRequest]
  }
  
  extension [Self <: CreateEdgeDeploymentPlanRequest](x: Self) {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setModelConfigs(value: EdgeDeploymentModelConfigs): Self = StObject.set(x, "ModelConfigs", value.asInstanceOf[js.Any])
    
    inline def setModelConfigsVarargs(value: EdgeDeploymentModelConfig*): Self = StObject.set(x, "ModelConfigs", js.Array(value*))
    
    inline def setStages(value: DeploymentStages): Self = StObject.set(x, "Stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "Stages", js.undefined)
    
    inline def setStagesVarargs(value: DeploymentStage*): Self = StObject.set(x, "Stages", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
