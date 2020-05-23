package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredWeightAndCapacity extends js.Object {
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.native
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.native
  /**
    * The name of the variant to update.
    */
  var VariantName: typings.awsSdk.sagemakerMod.VariantName = js.native
}

object DesiredWeightAndCapacity {
  @scala.inline
  def apply(
    VariantName: VariantName,
    DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
    DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  ): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    if (!js.isUndefined(DesiredInstanceCount)) __obj.updateDynamic("DesiredInstanceCount")(DesiredInstanceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DesiredWeight)) __obj.updateDynamic("DesiredWeight")(DesiredWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
}

