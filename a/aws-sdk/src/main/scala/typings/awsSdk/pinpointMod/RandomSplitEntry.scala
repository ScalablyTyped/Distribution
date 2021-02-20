package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomSplitEntry extends StObject {
  
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.native
  
  /**
    * The percentage of participants to send down the activity path. To determine which participants are sent down each path, Amazon Pinpoint applies a probability-based algorithm to the percentages that you specify for the paths. Therefore, the actual percentage of participants who are sent down a path may not be equal to the percentage that you specify.
    */
  var Percentage: js.UndefOr[integer] = js.native
}
object RandomSplitEntry {
  
  @scala.inline
  def apply(): RandomSplitEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomSplitEntry]
  }
  
  @scala.inline
  implicit class RandomSplitEntryMutableBuilder[Self <: RandomSplitEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
    
    @scala.inline
    def setPercentage(value: integer): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
  }
}
