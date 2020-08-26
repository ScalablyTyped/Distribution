package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeHistory extends js.Object {
  /**
    * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
    */
  var StartTimestamp: js.UndefOr[typings.awsSdk.esMod.StartTimestamp] = js.native
  /**
    *  A list of  UpgradeStepItem  s representing information about each step performed as pard of a specific Upgrade or Upgrade Eligibility Check. 
    */
  var StepsList: js.UndefOr[UpgradeStepsList] = js.native
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typings.awsSdk.esMod.UpgradeName] = js.native
  /**
    *  The overall status of the update. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStatus: js.UndefOr[typings.awsSdk.esMod.UpgradeStatus] = js.native
}

object UpgradeHistory {
  @scala.inline
  def apply(): UpgradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeHistory]
  }
  @scala.inline
  implicit class UpgradeHistoryOps[Self <: UpgradeHistory] (val x: Self) extends AnyVal {
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
    def setStartTimestamp(value: StartTimestamp): Self = this.set("StartTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimestamp: Self = this.set("StartTimestamp", js.undefined)
    @scala.inline
    def setStepsListVarargs(value: UpgradeStepItem*): Self = this.set("StepsList", js.Array(value :_*))
    @scala.inline
    def setStepsList(value: UpgradeStepsList): Self = this.set("StepsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepsList: Self = this.set("StepsList", js.undefined)
    @scala.inline
    def setUpgradeName(value: UpgradeName): Self = this.set("UpgradeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeName: Self = this.set("UpgradeName", js.undefined)
    @scala.inline
    def setUpgradeStatus(value: UpgradeStatus): Self = this.set("UpgradeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeStatus: Self = this.set("UpgradeStatus", js.undefined)
  }
  
}

