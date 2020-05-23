package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    VariantName: VariantName,
    CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined,
    CurrentWeight: js.UndefOr[VariantWeight] = js.undefined,
    DeployedImages: DeployedImages = null,
    DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
    DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  ): ProductionVariantSummary = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentInstanceCount)) __obj.updateDynamic("CurrentInstanceCount")(CurrentInstanceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentWeight)) __obj.updateDynamic("CurrentWeight")(CurrentWeight.get.asInstanceOf[js.Any])
    if (DeployedImages != null) __obj.updateDynamic("DeployedImages")(DeployedImages.asInstanceOf[js.Any])
    if (!js.isUndefined(DesiredInstanceCount)) __obj.updateDynamic("DesiredInstanceCount")(DesiredInstanceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DesiredWeight)) __obj.updateDynamic("DesiredWeight")(DesiredWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantSummary]
  }
}

