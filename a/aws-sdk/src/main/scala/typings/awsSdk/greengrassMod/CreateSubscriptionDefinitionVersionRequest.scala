package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string = js.native
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[listOfSubscription] = js.native
}

object CreateSubscriptionDefinitionVersionRequest {
  @scala.inline
  def apply(
    SubscriptionDefinitionId: string,
    AmznClientToken: string = null,
    Subscriptions: listOfSubscription = null
  ): CreateSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionDefinitionVersionRequest]
  }
}

