package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiConditionalSplitActivity extends StObject {
  
  /**
    * The paths for the activity, including the conditions for entering each path and the activity to perform for each path.
    */
  var Branches: js.UndefOr[ListOfMultiConditionalBranch] = js.undefined
  
  /**
    * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified for other paths in the activity.
    */
  var DefaultActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.undefined
}
object MultiConditionalSplitActivity {
  
  @scala.inline
  def apply(): MultiConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiConditionalSplitActivity]
  }
  
  @scala.inline
  implicit class MultiConditionalSplitActivityMutableBuilder[Self <: MultiConditionalSplitActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranches(value: ListOfMultiConditionalBranch): Self = StObject.set(x, "Branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesUndefined: Self = StObject.set(x, "Branches", js.undefined)
    
    @scala.inline
    def setBranchesVarargs(value: MultiConditionalBranch*): Self = StObject.set(x, "Branches", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActivity(value: string): Self = StObject.set(x, "DefaultActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActivityUndefined: Self = StObject.set(x, "DefaultActivity", js.undefined)
    
    @scala.inline
    def setEvaluationWaitTime(value: WaitTime): Self = StObject.set(x, "EvaluationWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationWaitTimeUndefined: Self = StObject.set(x, "EvaluationWaitTime", js.undefined)
  }
}
