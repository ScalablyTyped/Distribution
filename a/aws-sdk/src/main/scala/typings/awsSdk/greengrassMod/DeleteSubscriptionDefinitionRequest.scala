package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubscriptionDefinitionRequest extends js.Object {
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string = js.native
}

object DeleteSubscriptionDefinitionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: string): DeleteSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSubscriptionDefinitionRequest]
  }
}

