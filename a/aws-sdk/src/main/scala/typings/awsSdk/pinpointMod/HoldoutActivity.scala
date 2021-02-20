package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoldoutActivity extends StObject {
  
  /**
    * The unique identifier for the next activity to perform, after performing the holdout activity.
    */
  var NextActivity: js.UndefOr[string] = js.native
  
  /**
    * The percentage of participants who shouldn't continue the journey. To determine which participants are held out, Amazon Pinpoint applies a probability-based algorithm to the percentage that you specify. Therefore, the actual percentage of participants who are held out may not be equal to the percentage that you specify.
    */
  var Percentage: integer = js.native
}
object HoldoutActivity {
  
  @scala.inline
  def apply(Percentage: integer): HoldoutActivity = {
    val __obj = js.Dynamic.literal(Percentage = Percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldoutActivity]
  }
  
  @scala.inline
  implicit class HoldoutActivityMutableBuilder[Self <: HoldoutActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
    
    @scala.inline
    def setPercentage(value: integer): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
  }
}
