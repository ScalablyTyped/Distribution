package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupOutput extends js.Object {
  /**
    * The full description of the resource group after it has been updated.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.native
}

object UpdateGroupOutput {
  @scala.inline
  def apply(Group: Group = null): UpdateGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupOutput]
  }
}

