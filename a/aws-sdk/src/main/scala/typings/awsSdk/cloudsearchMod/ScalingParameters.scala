package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingParameters extends js.Object {
  /**
    * The instance type that you want to preconfigure for your domain. For example, search.m1.small.
    */
  var DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.native
  /**
    * The number of partitions you want to preconfigure for your domain. Only valid when you select m2.2xlarge as the desired instance type.
    */
  var DesiredPartitionCount: js.UndefOr[UIntValue] = js.native
  /**
    * The number of replicas you want to preconfigure for each index partition.
    */
  var DesiredReplicationCount: js.UndefOr[UIntValue] = js.native
}

object ScalingParameters {
  @scala.inline
  def apply(
    DesiredInstanceType: PartitionInstanceType = null,
    DesiredPartitionCount: Int | scala.Double = null,
    DesiredReplicationCount: Int | scala.Double = null
  ): ScalingParameters = {
    val __obj = js.Dynamic.literal()
    if (DesiredInstanceType != null) __obj.updateDynamic("DesiredInstanceType")(DesiredInstanceType.asInstanceOf[js.Any])
    if (DesiredPartitionCount != null) __obj.updateDynamic("DesiredPartitionCount")(DesiredPartitionCount.asInstanceOf[js.Any])
    if (DesiredReplicationCount != null) __obj.updateDynamic("DesiredReplicationCount")(DesiredReplicationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingParameters]
  }
}

