package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingPolicyStateChangeReason extends StObject {
  
  /**
    * The code indicating the reason for the change in status.USER_REQUEST indicates that the scaling policy status was changed by a user. PROVISION_FAILURE indicates that the status change was because the policy failed to provision. CLEANUP_FAILURE indicates an error.
    */
  var Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode] = js.undefined
  
  /**
    * A friendly, more verbose message that accompanies an automatic scaling policy state change.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object AutoScalingPolicyStateChangeReason {
  
  @scala.inline
  def apply(): AutoScalingPolicyStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyStateChangeReason]
  }
  
  @scala.inline
  implicit class AutoScalingPolicyStateChangeReasonMutableBuilder[Self <: AutoScalingPolicyStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: AutoScalingPolicyStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
