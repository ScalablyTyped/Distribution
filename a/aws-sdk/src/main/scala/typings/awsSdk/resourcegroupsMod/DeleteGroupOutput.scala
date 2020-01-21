package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGroupOutput extends js.Object {
  /**
    * A full description of the deleted resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.native
}

object DeleteGroupOutput {
  @scala.inline
  def apply(Group: Group = null): DeleteGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupOutput]
  }
}

