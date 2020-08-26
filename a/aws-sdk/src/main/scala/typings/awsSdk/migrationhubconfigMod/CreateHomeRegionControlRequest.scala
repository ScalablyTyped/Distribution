package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHomeRegionControlRequest extends js.Object {
  /**
    * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubconfigMod.DryRun] = js.native
  /**
    * The name of the home region of the calling account.
    */
  var HomeRegion: typings.awsSdk.migrationhubconfigMod.HomeRegion = js.native
  /**
    * The account for which this command sets up a home region control. The Target is always of type ACCOUNT.
    */
  var Target: typings.awsSdk.migrationhubconfigMod.Target = js.native
}

object CreateHomeRegionControlRequest {
  @scala.inline
  def apply(HomeRegion: HomeRegion, Target: Target): CreateHomeRegionControlRequest = {
    val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHomeRegionControlRequest]
  }
  @scala.inline
  implicit class CreateHomeRegionControlRequestOps[Self <: CreateHomeRegionControlRequest] (val x: Self) extends AnyVal {
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
    def setHomeRegion(value: HomeRegion): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Target): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: DryRun): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

