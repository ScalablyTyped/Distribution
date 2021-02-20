package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeStepItem extends StObject {
  
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
  implicit class UpgradeStepItemMutableBuilder[Self <: UpgradeStepItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssues(value: Issues): Self = StObject.set(x, "Issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesUndefined: Self = StObject.set(x, "Issues", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "Issues", js.Array(value :_*))
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    @scala.inline
    def setUpgradeStep(value: UpgradeStep): Self = StObject.set(x, "UpgradeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeStepStatus(value: UpgradeStatus): Self = StObject.set(x, "UpgradeStepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeStepStatusUndefined: Self = StObject.set(x, "UpgradeStepStatus", js.undefined)
    
    @scala.inline
    def setUpgradeStepUndefined: Self = StObject.set(x, "UpgradeStep", js.undefined)
  }
}
