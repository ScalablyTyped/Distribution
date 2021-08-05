package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomSplitEntry extends StObject {
  
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The percentage of participants to send down the activity path. To determine which participants are sent down each path, Amazon Pinpoint applies a probability-based algorithm to the percentages that you specify for the paths. Therefore, the actual percentage of participants who are sent down a path may not be equal to the percentage that you specify.
    */
  var Percentage: js.UndefOr[integer] = js.undefined
}
object RandomSplitEntry {
  
  inline def apply(): RandomSplitEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomSplitEntry]
  }
  
  extension [Self <: RandomSplitEntry](x: Self) {
    
    inline def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    inline def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
    
    inline def setPercentage(value: integer): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
  }
}
