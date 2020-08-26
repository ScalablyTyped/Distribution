package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterSecurityGroupMessage extends js.Object {
  /**
    * The name for the security group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all security groups that are created by your AWS account.   Example: examplesecuritygroup 
    */
  var ClusterSecurityGroupName: String = js.native
  /**
    * A description for the security group.
    */
  var Description: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateClusterSecurityGroupMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String, Description: String): CreateClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSecurityGroupMessage]
  }
  @scala.inline
  implicit class CreateClusterSecurityGroupMessageOps[Self <: CreateClusterSecurityGroupMessage] (val x: Self) extends AnyVal {
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
    def setClusterSecurityGroupName(value: String): Self = this.set("ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

