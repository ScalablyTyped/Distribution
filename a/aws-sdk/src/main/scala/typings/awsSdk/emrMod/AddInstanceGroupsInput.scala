package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceGroupsInput extends js.Object {
  /**
    * Instance groups to add.
    */
  var InstanceGroups: InstanceGroupConfigList = js.native
  /**
    * Job flow in which to add the instance groups.
    */
  var JobFlowId: XmlStringMaxLen256 = js.native
}

object AddInstanceGroupsInput {
  @scala.inline
  def apply(InstanceGroups: InstanceGroupConfigList, JobFlowId: XmlStringMaxLen256): AddInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(InstanceGroups = InstanceGroups.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInstanceGroupsInput]
  }
  @scala.inline
  implicit class AddInstanceGroupsInputOps[Self <: AddInstanceGroupsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroupConfig*): Self = this.set("InstanceGroups", js.Array(value :_*))
    @scala.inline
    def setInstanceGroups(value: InstanceGroupConfigList): Self = this.set("InstanceGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = this.set("JobFlowId", value.asInstanceOf[js.Any])
  }
  
}

