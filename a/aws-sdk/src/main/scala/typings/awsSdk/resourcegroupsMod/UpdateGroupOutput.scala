package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupOutput extends js.Object {
  /**
    * The update description of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.native
}

object UpdateGroupOutput {
  @scala.inline
  def apply(): UpdateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupOutput]
  }
  @scala.inline
  implicit class UpdateGroupOutputOps[Self <: UpdateGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroup(value: Group): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
  }
  
}

