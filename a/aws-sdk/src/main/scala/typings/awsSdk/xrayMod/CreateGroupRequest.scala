package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupRequest extends js.Object {
  /**
    * The filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typings.awsSdk.xrayMod.FilterExpression] = js.native
  /**
    * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
    */
  var GroupName: typings.awsSdk.xrayMod.GroupName = js.native
}

object CreateGroupRequest {
  @scala.inline
  def apply(GroupName: GroupName, FilterExpression: FilterExpression = null): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

