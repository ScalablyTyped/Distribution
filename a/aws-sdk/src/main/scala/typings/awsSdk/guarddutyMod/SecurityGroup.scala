package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroup extends js.Object {
  /**
    * EC2 instance's security group ID.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * EC2 instance's security group name.
    */
  var GroupName: js.UndefOr[String] = js.native
}

object SecurityGroup {
  @scala.inline
  def apply(GroupId: String = null, GroupName: String = null): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroup]
  }
}

