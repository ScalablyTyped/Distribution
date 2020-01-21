package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupQueryOutput extends js.Object {
  /**
    * The resource query associated with the resource group after the update.
    */
  var GroupQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupQuery] = js.native
}

object UpdateGroupQueryOutput {
  @scala.inline
  def apply(GroupQuery: GroupQuery = null): UpdateGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (GroupQuery != null) __obj.updateDynamic("GroupQuery")(GroupQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupQueryOutput]
  }
}

