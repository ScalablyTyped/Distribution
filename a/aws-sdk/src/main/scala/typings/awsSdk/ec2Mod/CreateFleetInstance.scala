package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetInstance extends js.Object {
  /**
    * The IDs of the instances.
    */
  var InstanceIds: js.UndefOr[InstanceIdsSet] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The launch templates and overrides that were used for launching the instances. The values that you specify in the Overrides replace the values in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.native
  /**
    * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.native
  /**
    * The value is Windows for Windows instances. Otherwise, the value is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
}

object CreateFleetInstance {
  @scala.inline
  def apply(): CreateFleetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetInstance]
  }
  @scala.inline
  implicit class CreateFleetInstanceOps[Self <: CreateFleetInstance] (val x: Self) extends AnyVal {
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
    def setInstanceIdsVarargs(value: InstanceId*): Self = this.set("InstanceIds", js.Array(value :_*))
    @scala.inline
    def setInstanceIds(value: InstanceIdsSet): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIds: Self = this.set("InstanceIds", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setLaunchTemplateAndOverrides(value: LaunchTemplateAndOverridesResponse): Self = this.set("LaunchTemplateAndOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateAndOverrides: Self = this.set("LaunchTemplateAndOverrides", js.undefined)
    @scala.inline
    def setLifecycle(value: InstanceLifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
    @scala.inline
    def setPlatform(value: PlatformValues): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
  }
  
}

