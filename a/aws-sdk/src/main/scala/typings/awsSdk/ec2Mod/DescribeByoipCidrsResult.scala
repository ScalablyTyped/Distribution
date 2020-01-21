package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeByoipCidrsResult extends js.Object {
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[ByoipCidrSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeByoipCidrsResult {
  @scala.inline
  def apply(ByoipCidrs: ByoipCidrSet = null, NextToken: String = null): DescribeByoipCidrsResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidrs != null) __obj.updateDynamic("ByoipCidrs")(ByoipCidrs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeByoipCidrsResult]
  }
}

