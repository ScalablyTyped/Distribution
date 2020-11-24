package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeStepItem extends js.Object {
  
  /**
    * A list of strings containing detailed information about the errors encountered in a particular step.
    */
  var Issues: js.UndefOr[typings.awsSdk.esMod.Issues] = js.native
  
  /**
    * The Floating point value representing progress percentage of a particular step.
    */
  var ProgressPercent: js.UndefOr[Double] = js.native
  
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typings.awsSdk.esMod.UpgradeStep] = js.native
  
  /**
    *  The status of a particular step during an upgrade. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.native
}
object UpgradeStepItem {
  
  @scala.inline
  def apply(): UpgradeStepItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeStepItem]
  }
  
  @scala.inline
  implicit class UpgradeStepItemOps[Self <: UpgradeStepItem] (val x: Self) extends AnyVal {
    
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
    def setIssuesVarargs(value: Issue*): Self = this.set("Issues", js.Array(value :_*))
    
    @scala.inline
    def setIssues(value: Issues): Self = this.set("Issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssues: Self = this.set("Issues", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = this.set("ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressPercent: Self = this.set("ProgressPercent", js.undefined)
    
    @scala.inline
    def setUpgradeStep(value: UpgradeStep): Self = this.set("UpgradeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeStep: Self = this.set("UpgradeStep", js.undefined)
    
    @scala.inline
    def setUpgradeStepStatus(value: UpgradeStatus): Self = this.set("UpgradeStepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeStepStatus: Self = this.set("UpgradeStepStatus", js.undefined)
  }
}
