package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductionVariant extends js.Object {
  
  /**
    * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand GPU computing for inference. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.native
  
  /**
    * Number of instances to launch initially.
    */
  var InitialInstanceCount: TaskCount = js.native
  
  /**
    * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. The traffic to a production variant is determined by the ratio of the VariantWeight to the sum of all VariantWeight values across all ProductionVariants. If unspecified, it defaults to 1.0. 
    */
  var InitialVariantWeight: js.UndefOr[VariantWeight] = js.native
  
  /**
    * The ML compute instance type.
    */
  var InstanceType: ProductionVariantInstanceType = js.native
  
  /**
    * The name of the model that you want to host. This is the name that you specified when creating the model.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName = js.native
  
  /**
    * The name of the production variant.
    */
  var VariantName: typings.awsSdk.sagemakerMod.VariantName = js.native
}
object ProductionVariant {
  
  @scala.inline
  def apply(
    InitialInstanceCount: TaskCount,
    InstanceType: ProductionVariantInstanceType,
    ModelName: ModelName,
    VariantName: VariantName
  ): ProductionVariant = {
    val __obj = js.Dynamic.literal(InitialInstanceCount = InitialInstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariant]
  }
  
  @scala.inline
  implicit class ProductionVariantOps[Self <: ProductionVariant] (val x: Self) extends AnyVal {
    
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
    def setInitialInstanceCount(value: TaskCount): Self = this.set("InitialInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: ProductionVariantInstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantName(value: VariantName): Self = this.set("VariantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorType(value: ProductionVariantAcceleratorType): Self = this.set("AcceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorType: Self = this.set("AcceleratorType", js.undefined)
    
    @scala.inline
    def setInitialVariantWeight(value: VariantWeight): Self = this.set("InitialVariantWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialVariantWeight: Self = this.set("InitialVariantWeight", js.undefined)
  }
}
