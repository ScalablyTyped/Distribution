package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupModifyConfig extends js.Object {
  /**
    * A list of new or modified configurations to apply for an instance group.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
    */
  var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.native
  /**
    * Target size for the instance group.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * Unique ID of the instance group to expand or shrink.
    */
  var InstanceGroupId: XmlStringMaxLen256 = js.native
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.emrMod.ShrinkPolicy] = js.native
}

object InstanceGroupModifyConfig {
  @scala.inline
  def apply(InstanceGroupId: XmlStringMaxLen256): InstanceGroupModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupModifyConfig]
  }
  @scala.inline
  implicit class InstanceGroupModifyConfigOps[Self <: InstanceGroupModifyConfig] (val x: Self) extends AnyVal {
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
    def setInstanceGroupId(value: XmlStringMaxLen256): Self = this.set("InstanceGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("Configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    @scala.inline
    def setEC2InstanceIdsToTerminateVarargs(value: InstanceId*): Self = this.set("EC2InstanceIdsToTerminate", js.Array(value :_*))
    @scala.inline
    def setEC2InstanceIdsToTerminate(value: EC2InstanceIdsToTerminateList): Self = this.set("EC2InstanceIdsToTerminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2InstanceIdsToTerminate: Self = this.set("EC2InstanceIdsToTerminate", js.undefined)
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    @scala.inline
    def setShrinkPolicy(value: ShrinkPolicy): Self = this.set("ShrinkPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkPolicy: Self = this.set("ShrinkPolicy", js.undefined)
  }
  
}

