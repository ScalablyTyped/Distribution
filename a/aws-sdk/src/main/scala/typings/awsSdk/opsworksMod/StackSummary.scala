package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSummary extends js.Object {
  /**
    * The number of apps.
    */
  var AppsCount: js.UndefOr[Integer] = js.native
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * An InstancesCount object with the number of instances in each status.
    */
  var InstancesCount: js.UndefOr[typings.awsSdk.opsworksMod.InstancesCount] = js.native
  /**
    * The number of layers.
    */
  var LayersCount: js.UndefOr[Integer] = js.native
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object StackSummary {
  @scala.inline
  def apply(
    AppsCount: js.UndefOr[Integer] = js.undefined,
    Arn: String = null,
    InstancesCount: InstancesCount = null,
    LayersCount: js.UndefOr[Integer] = js.undefined,
    Name: String = null,
    StackId: String = null
  ): StackSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AppsCount)) __obj.updateDynamic("AppsCount")(AppsCount.get.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (InstancesCount != null) __obj.updateDynamic("InstancesCount")(InstancesCount.asInstanceOf[js.Any])
    if (!js.isUndefined(LayersCount)) __obj.updateDynamic("LayersCount")(LayersCount.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
}

