package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryStatus extends StObject {
  
  /**
    * The current state of the canary.
    */
  var State: js.UndefOr[CanaryState] = js.undefined
  
  /**
    * If the canary has insufficient permissions to run, this field provides more details.
    */
  var StateReason: js.UndefOr[String] = js.undefined
  
  /**
    * If the canary cannot run or has failed, this field displays the reason.
    */
  var StateReasonCode: js.UndefOr[CanaryStateReasonCode] = js.undefined
}
object CanaryStatus {
  
  @scala.inline
  def apply(): CanaryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryStatus]
  }
  
  @scala.inline
  implicit class CanaryStatusMutableBuilder[Self <: CanaryStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: CanaryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: String): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonCode(value: CanaryStateReasonCode): Self = StObject.set(x, "StateReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonCodeUndefined: Self = StObject.set(x, "StateReasonCode", js.undefined)
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
