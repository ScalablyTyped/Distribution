package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductionVariantSummary extends js.Object {
  
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
  implicit class ProductionVariantSummaryOps[Self <: ProductionVariantSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVariantName(value: VariantName): Self = this.set("VariantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentInstanceCount(value: TaskCount): Self = this.set("CurrentInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentInstanceCount: Self = this.set("CurrentInstanceCount", js.undefined)
    
    @scala.inline
    def setCurrentWeight(value: VariantWeight): Self = this.set("CurrentWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentWeight: Self = this.set("CurrentWeight", js.undefined)
    
    @scala.inline
    def setDeployedImagesVarargs(value: DeployedImage*): Self = this.set("DeployedImages", js.Array(value :_*))
    
    @scala.inline
    def setDeployedImages(value: DeployedImages): Self = this.set("DeployedImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedImages: Self = this.set("DeployedImages", js.undefined)
    
    @scala.inline
    def setDesiredInstanceCount(value: TaskCount): Self = this.set("DesiredInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredInstanceCount: Self = this.set("DesiredInstanceCount", js.undefined)
    
    @scala.inline
    def setDesiredWeight(value: VariantWeight): Self = this.set("DesiredWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredWeight: Self = this.set("DesiredWeight", js.undefined)
  }
}
