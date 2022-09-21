package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionVariantSummary extends StObject {
  
  /**
    * The number of instances associated with the variant.
    */
  var CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined
  
  /**
    * The serverless configuration for the endpoint.
    */
  var CurrentServerlessConfig: js.UndefOr[ProductionVariantServerlessConfig] = js.undefined
  
  /**
    * The weight associated with the variant.
    */
  var CurrentWeight: js.UndefOr[VariantWeight] = js.undefined
  
  /**
    * An array of DeployedImage objects that specify the Amazon EC2 Container Registry paths of the inference images deployed on instances of this ProductionVariant.
    */
  var DeployedImages: js.UndefOr[typings.awsSdk.sagemakerMod.DeployedImages] = js.undefined
  
  /**
    * The number of instances requested in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
  
  /**
    * The serverless configuration requested for the endpoint update.
    */
  var DesiredServerlessConfig: js.UndefOr[ProductionVariantServerlessConfig] = js.undefined
  
  /**
    * The requested weight, as specified in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  
  /**
    * The name of the variant.
    */
  var VariantName: typings.awsSdk.sagemakerMod.VariantName
  
  /**
    * The endpoint variant status which describes the current deployment stage status or operational status.
    */
  var VariantStatus: js.UndefOr[ProductionVariantStatusList] = js.undefined
}
object ProductionVariantSummary {
  
  inline def apply(VariantName: VariantName): ProductionVariantSummary = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantSummary]
  }
  
  extension [Self <: ProductionVariantSummary](x: Self) {
    
    inline def setCurrentInstanceCount(value: TaskCount): Self = StObject.set(x, "CurrentInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setCurrentInstanceCountUndefined: Self = StObject.set(x, "CurrentInstanceCount", js.undefined)
    
    inline def setCurrentServerlessConfig(value: ProductionVariantServerlessConfig): Self = StObject.set(x, "CurrentServerlessConfig", value.asInstanceOf[js.Any])
    
    inline def setCurrentServerlessConfigUndefined: Self = StObject.set(x, "CurrentServerlessConfig", js.undefined)
    
    inline def setCurrentWeight(value: VariantWeight): Self = StObject.set(x, "CurrentWeight", value.asInstanceOf[js.Any])
    
    inline def setCurrentWeightUndefined: Self = StObject.set(x, "CurrentWeight", js.undefined)
    
    inline def setDeployedImages(value: DeployedImages): Self = StObject.set(x, "DeployedImages", value.asInstanceOf[js.Any])
    
    inline def setDeployedImagesUndefined: Self = StObject.set(x, "DeployedImages", js.undefined)
    
    inline def setDeployedImagesVarargs(value: DeployedImage*): Self = StObject.set(x, "DeployedImages", js.Array(value*))
    
    inline def setDesiredInstanceCount(value: TaskCount): Self = StObject.set(x, "DesiredInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredInstanceCountUndefined: Self = StObject.set(x, "DesiredInstanceCount", js.undefined)
    
    inline def setDesiredServerlessConfig(value: ProductionVariantServerlessConfig): Self = StObject.set(x, "DesiredServerlessConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredServerlessConfigUndefined: Self = StObject.set(x, "DesiredServerlessConfig", js.undefined)
    
    inline def setDesiredWeight(value: VariantWeight): Self = StObject.set(x, "DesiredWeight", value.asInstanceOf[js.Any])
    
    inline def setDesiredWeightUndefined: Self = StObject.set(x, "DesiredWeight", js.undefined)
    
    inline def setVariantName(value: VariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
    
    inline def setVariantStatus(value: ProductionVariantStatusList): Self = StObject.set(x, "VariantStatus", value.asInstanceOf[js.Any])
    
    inline def setVariantStatusUndefined: Self = StObject.set(x, "VariantStatus", js.undefined)
    
    inline def setVariantStatusVarargs(value: ProductionVariantStatus*): Self = StObject.set(x, "VariantStatus", js.Array(value*))
  }
}
