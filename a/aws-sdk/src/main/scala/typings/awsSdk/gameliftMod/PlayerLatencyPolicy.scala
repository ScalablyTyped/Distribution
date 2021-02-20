package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerLatencyPolicy extends StObject {
  
  /**
    * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for this property.
    */
  var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.native
  
  /**
    * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for this property means that the policy is enforced until the queue times out.
    */
  var PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.native
}
object PlayerLatencyPolicy {
  
  @scala.inline
  def apply(): PlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLatencyPolicy]
  }
  
  @scala.inline
  implicit class PlayerLatencyPolicyMutableBuilder[Self <: PlayerLatencyPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumIndividualPlayerLatencyMilliseconds(value: WholeNumber): Self = StObject.set(x, "MaximumIndividualPlayerLatencyMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumIndividualPlayerLatencyMillisecondsUndefined: Self = StObject.set(x, "MaximumIndividualPlayerLatencyMilliseconds", js.undefined)
    
    @scala.inline
    def setPolicyDurationSeconds(value: WholeNumber): Self = StObject.set(x, "PolicyDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDurationSecondsUndefined: Self = StObject.set(x, "PolicyDurationSeconds", js.undefined)
  }
}
