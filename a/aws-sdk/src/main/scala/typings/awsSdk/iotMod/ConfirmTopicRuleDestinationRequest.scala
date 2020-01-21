package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmTopicRuleDestinationRequest extends js.Object {
  /**
    * The token used to confirm ownership or access to the topic rule confirmation URL.
    */
  var confirmationToken: ConfirmationToken = js.native
}

object ConfirmTopicRuleDestinationRequest {
  @scala.inline
  def apply(confirmationToken: ConfirmationToken): ConfirmTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(confirmationToken = confirmationToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfirmTopicRuleDestinationRequest]
  }
}

