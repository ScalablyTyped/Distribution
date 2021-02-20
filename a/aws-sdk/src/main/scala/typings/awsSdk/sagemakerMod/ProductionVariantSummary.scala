package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductionVariantSummary extends StObject {
  
  /**
    * The number of instances associated with the variant.
    */
  var CurrentInstanceCount: js.UndefOr[TaskCount] = js.native
  
  /**
    * The weight associated with the variant.
    */
  var CurrentWeight: js.UndefOr[VariantWeight] = js.native
  
  /**
    * An array of DeployedImage objects that specify the Amazon EC2 Container Registry paths of the inference images deployed on instances of this ProductionVariant.
    */
  var DeployedImages: js.UndefOr[typings.awsSdk.sagemakerMod.DeployedImages] = js.native
  
  /**
    * The number of instances requested in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.native
  
  /**
    * The requested weight, as specified in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.native
  
  /**
    * The name of the variant.
    */
  var VariantName: typings.awsSdk.sagemakerMod.VariantName = js.native
}
object ProductionVariantSummary {
  
  @scala.inline
  def apply(VariantName: VariantName): ProductionVariantSummary = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantSummary]
  }
  
  @scala.inline
  implicit class ProductionVariantSummaryMutableBuilder[Self <: ProductionVariantSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentInstanceCount(value: TaskCount): Self = StObject.set(x, "CurrentInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentInstanceCountUndefined: Self = StObject.set(x, "CurrentInstanceCount", js.undefined)
    
    @scala.inline
    def setCurrentWeight(value: VariantWeight): Self = StObject.set(x, "CurrentWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWeightUndefined: Self = StObject.set(x, "CurrentWeight", js.undefined)
    
    @scala.inline
    def setDeployedImages(value: DeployedImages): Self = StObject.set(x, "DeployedImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedImagesUndefined: Self = StObject.set(x, "DeployedImages", js.undefined)
    
    @scala.inline
    def setDeployedImagesVarargs(value: DeployedImage*): Self = StObject.set(x, "DeployedImages", js.Array(value :_*))
    
    @scala.inline
    def setDesiredInstanceCount(value: TaskCount): Self = StObject.set(x, "DesiredInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredInstanceCountUndefined: Self = StObject.set(x, "DesiredInstanceCount", js.undefined)
    
    @scala.inline
    def setDesiredWeight(value: VariantWeight): Self = StObject.set(x, "DesiredWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredWeightUndefined: Self = StObject.set(x, "DesiredWeight", js.undefined)
    
    @scala.inline
    def setVariantName(value: VariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
