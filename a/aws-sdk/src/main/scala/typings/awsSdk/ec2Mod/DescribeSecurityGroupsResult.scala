package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityGroupsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the security groups.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupList] = js.native
}

object DescribeSecurityGroupsResult {
  @scala.inline
  def apply(NextToken: String = null, SecurityGroups: SecurityGroupList = null): DescribeSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityGroupsResult]
  }
}

