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
  def apply(): DescribeSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupsResult]
  }
  @scala.inline
  implicit class DescribeSecurityGroupsResultOps[Self <: DescribeSecurityGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroupList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
  }
  
}

