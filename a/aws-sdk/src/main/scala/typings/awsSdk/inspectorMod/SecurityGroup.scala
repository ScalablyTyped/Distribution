package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroup extends js.Object {
  /**
    * The ID of the security group.
    */
  var groupId: js.UndefOr[Text] = js.native
  /**
    * The name of the security group.
    */
  var groupName: js.UndefOr[Text] = js.native
}

object SecurityGroup {
  @scala.inline
  def apply(groupId: Text = null, groupName: Text = null): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroup]
  }
}

