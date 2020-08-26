package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSecurityGroupMessage extends js.Object {
  /**
    * The description for the DB security group.
    */
  var DBSecurityGroupDescription: String = js.native
  /**
    * The name for the DB security group. This value is stored as a lowercase string. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"   Example: mysecuritygroup 
    */
  var DBSecurityGroupName: String = js.native
  /**
    * Tags to assign to the DB security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBSecurityGroupMessage {
  @scala.inline
  def apply(DBSecurityGroupDescription: String, DBSecurityGroupName: String): CreateDBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupDescription = DBSecurityGroupDescription.asInstanceOf[js.Any], DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSecurityGroupMessage]
  }
  @scala.inline
  implicit class CreateDBSecurityGroupMessageOps[Self <: CreateDBSecurityGroupMessage] (val x: Self) extends AnyVal {
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
    def setDBSecurityGroupDescription(value: String): Self = this.set("DBSecurityGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBSecurityGroupName(value: String): Self = this.set("DBSecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

