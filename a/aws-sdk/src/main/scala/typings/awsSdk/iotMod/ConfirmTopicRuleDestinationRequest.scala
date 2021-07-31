package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmTopicRuleDestinationRequest extends StObject {
  
  /**
    * The token used to confirm ownership or access to the topic rule confirmation URL.
    */
  var confirmationToken: ConfirmationToken
}
object ConfirmTopicRuleDestinationRequest {
  
  @scala.inline
  def apply(confirmationToken: ConfirmationToken): ConfirmTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(confirmationToken = confirmationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmTopicRuleDestinationRequest]
  }
  
  @scala.inline
  implicit class ConfirmTopicRuleDestinationRequestMutableBuilder[Self <: ConfirmTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationToken(value: ConfirmationToken): Self = StObject.set(x, "confirmationToken", value.asInstanceOf[js.Any])
  }
}
