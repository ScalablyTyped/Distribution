package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeStepItem extends StObject {
  
  /**
    * A list of strings containing detailed information about the errors encountered in a particular step.
    */
  var Issues: js.UndefOr[typings.awsSdk.esMod.Issues] = js.undefined
  
  /**
    * The Floating point value representing progress percentage of a particular step.
    */
  var ProgressPercent: js.UndefOr[Double] = js.undefined
  
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typings.awsSdk.esMod.UpgradeStep] = js.undefined
  
  /**
    *  The status of a particular step during an upgrade. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined
}
object UpgradeStepItem {
  
  inline def apply(): UpgradeStepItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeStepItem]
  }
  
  extension [Self <: UpgradeStepItem](x: Self) {
    
    inline def setIssues(value: Issues): Self = StObject.set(x, "Issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "Issues", js.undefined)
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "Issues", js.Array(value*))
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    inline def setUpgradeStep(value: UpgradeStep): Self = StObject.set(x, "UpgradeStep", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStepStatus(value: UpgradeStatus): Self = StObject.set(x, "UpgradeStepStatus", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStepStatusUndefined: Self = StObject.set(x, "UpgradeStepStatus", js.undefined)
    
    inline def setUpgradeStepUndefined: Self = StObject.set(x, "UpgradeStep", js.undefined)
  }
}
