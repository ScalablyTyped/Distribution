package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupConfigurationOutput extends js.Object {
  /**
    * The configuration associated with the specified group.
    */
  var GroupConfiguration: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupConfiguration] = js.native
}

object GetGroupConfigurationOutput {
  @scala.inline
  def apply(): GetGroupConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationOutput]
  }
  @scala.inline
  implicit class GetGroupConfigurationOutputOps[Self <: GetGroupConfigurationOutput] (val x: Self) extends AnyVal {
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
    def setGroupConfiguration(value: GroupConfiguration): Self = this.set("GroupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupConfiguration: Self = this.set("GroupConfiguration", js.undefined)
  }
  
}

