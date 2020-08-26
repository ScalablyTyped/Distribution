package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupConfigurationInput extends js.Object {
  /**
    * The name or the ARN of the resource group.
    */
  var Group: js.UndefOr[GroupString] = js.native
}

object GetGroupConfigurationInput {
  @scala.inline
  def apply(): GetGroupConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationInput]
  }
  @scala.inline
  implicit class GetGroupConfigurationInputOps[Self <: GetGroupConfigurationInput] (val x: Self) extends AnyVal {
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
    def setGroup(value: GroupString): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
  }
  
}

