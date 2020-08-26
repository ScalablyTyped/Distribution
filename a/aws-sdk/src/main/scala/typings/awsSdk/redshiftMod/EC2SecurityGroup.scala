package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2SecurityGroup extends js.Object {
  /**
    * The name of the EC2 Security Group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * The status of the EC2 security group.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The list of tags for the EC2 security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object EC2SecurityGroup {
  @scala.inline
  def apply(): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2SecurityGroup]
  }
  @scala.inline
  implicit class EC2SecurityGroupOps[Self <: EC2SecurityGroup] (val x: Self) extends AnyVal {
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
    def setEC2SecurityGroupName(value: String): Self = this.set("EC2SecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2SecurityGroupName: Self = this.set("EC2SecurityGroupName", js.undefined)
    @scala.inline
    def setEC2SecurityGroupOwnerId(value: String): Self = this.set("EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2SecurityGroupOwnerId: Self = this.set("EC2SecurityGroupOwnerId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

