package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubnetsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more subnets.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
}

object DescribeSubnetsResult {
  @scala.inline
  def apply(NextToken: String = null, Subnets: SubnetList = null): DescribeSubnetsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubnetsResult]
  }
}

