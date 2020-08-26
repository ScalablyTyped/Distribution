package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSecurityGroupsOutput extends js.Object {
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroups] = js.native
}

object SetSecurityGroupsOutput {
  @scala.inline
  def apply(): SetSecurityGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSecurityGroupsOutput]
  }
  @scala.inline
  implicit class SetSecurityGroupsOutputOps[Self <: SetSecurityGroupsOutput] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroups): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
  }
  
}

