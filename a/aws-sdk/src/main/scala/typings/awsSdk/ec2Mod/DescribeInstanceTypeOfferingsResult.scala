package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceTypeOfferingsResult extends js.Object {
  /**
    * The instance types offered.
    */
  var InstanceTypeOfferings: js.UndefOr[InstanceTypeOfferingsList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeInstanceTypeOfferingsResult {
  @scala.inline
  def apply(InstanceTypeOfferings: InstanceTypeOfferingsList = null, NextToken: NextToken = null): DescribeInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceTypeOfferings != null) __obj.updateDynamic("InstanceTypeOfferings")(InstanceTypeOfferings.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceTypeOfferingsResult]
  }
}

