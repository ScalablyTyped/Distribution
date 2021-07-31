package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomSplitActivity extends StObject {
  
  /**
    * The paths for the activity, including the percentage of participants to enter each path and the activity to perform for each path.
    */
  var Branches: js.UndefOr[ListOfRandomSplitEntry] = js.undefined
}
object RandomSplitActivity {
  
  @scala.inline
  def apply(): RandomSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomSplitActivity]
  }
  
  @scala.inline
  implicit class RandomSplitActivityMutableBuilder[Self <: RandomSplitActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranches(value: ListOfRandomSplitEntry): Self = StObject.set(x, "Branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesUndefined: Self = StObject.set(x, "Branches", js.undefined)
    
    @scala.inline
    def setBranchesVarargs(value: RandomSplitEntry*): Self = StObject.set(x, "Branches", js.Array(value :_*))
  }
}
