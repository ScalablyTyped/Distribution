package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRdsDbInstancesResult extends js.Object {
  /**
    * An a array of RdsDbInstance objects that describe the instances.
    */
  var RdsDbInstances: js.UndefOr[typings.awsSdk.opsworksMod.RdsDbInstances] = js.native
}

object DescribeRdsDbInstancesResult {
  @scala.inline
  def apply(RdsDbInstances: RdsDbInstances = null): DescribeRdsDbInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (RdsDbInstances != null) __obj.updateDynamic("RdsDbInstances")(RdsDbInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRdsDbInstancesResult]
  }
}

