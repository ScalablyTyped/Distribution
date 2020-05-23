package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    VariantName: VariantName,
    AcceleratorType: ProductionVariantAcceleratorType = null,
    InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
  ): ProductionVariant = {
    val __obj = js.Dynamic.literal(InitialInstanceCount = InitialInstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    if (AcceleratorType != null) __obj.updateDynamic("AcceleratorType")(AcceleratorType.asInstanceOf[js.Any])
    if (!js.isUndefined(InitialVariantWeight)) __obj.updateDynamic("InitialVariantWeight")(InitialVariantWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariant]
  }
}

