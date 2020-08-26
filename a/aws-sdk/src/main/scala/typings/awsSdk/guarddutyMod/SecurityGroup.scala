package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroup extends js.Object {
  /**
    * The security group ID of the EC2 instance.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The security group name of the EC2 instance.
    */
  var GroupName: js.UndefOr[String] = js.native
}

object SecurityGroup {
  @scala.inline
  def apply(): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroup]
  }
  @scala.inline
  implicit class SecurityGroupOps[Self <: SecurityGroup] (val x: Self) extends AnyVal {
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
    def setGroupId(value: String): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
  
}

