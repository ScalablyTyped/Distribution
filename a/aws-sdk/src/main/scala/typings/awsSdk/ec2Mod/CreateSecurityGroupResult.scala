package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityGroupResult extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateSecurityGroupResult {
  @scala.inline
  def apply(GroupId: String = null, Tags: TagList = null): CreateSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityGroupResult]
  }
}

