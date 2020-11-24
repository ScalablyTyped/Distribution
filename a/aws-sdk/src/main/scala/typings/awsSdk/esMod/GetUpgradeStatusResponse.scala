package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUpgradeStatusResponse extends js.Object {
  
  /**
    *  One of 4 statuses that a step can go through returned as part of the  GetUpgradeStatusResponse  object. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var StepStatus: js.UndefOr[UpgradeStatus] = js.native
  
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typings.awsSdk.esMod.UpgradeName] = js.native
  
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typings.awsSdk.esMod.UpgradeStep] = js.native
}
object GetUpgradeStatusResponse {
  
  @scala.inline
  def apply(): GetUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeStatusResponse]
  }
  
  @scala.inline
  implicit class GetUpgradeStatusResponseOps[Self <: GetUpgradeStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setStepStatus(value: UpgradeStatus): Self = this.set("StepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepStatus: Self = this.set("StepStatus", js.undefined)
    
    @scala.inline
    def setUpgradeName(value: UpgradeName): Self = this.set("UpgradeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeName: Self = this.set("UpgradeName", js.undefined)
    
    @scala.inline
    def setUpgradeStep(value: UpgradeStep): Self = this.set("UpgradeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeStep: Self = this.set("UpgradeStep", js.undefined)
  }
}
