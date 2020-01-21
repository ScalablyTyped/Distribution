package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceStatusResult extends js.Object {
  /**
    * Information about the status of the instances.
    */
  var InstanceStatuses: js.UndefOr[InstanceStatusList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeInstanceStatusResult {
  @scala.inline
  def apply(InstanceStatuses: InstanceStatusList = null, NextToken: String = null): DescribeInstanceStatusResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceStatuses != null) __obj.updateDynamic("InstanceStatuses")(InstanceStatuses.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceStatusResult]
  }
}

