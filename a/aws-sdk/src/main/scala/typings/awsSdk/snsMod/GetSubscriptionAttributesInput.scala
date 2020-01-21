package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionAttributesInput extends js.Object {
  /**
    * The ARN of the subscription whose properties you want to get.
    */
  var SubscriptionArn: subscriptionARN = js.native
}

object GetSubscriptionAttributesInput {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): GetSubscriptionAttributesInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSubscriptionAttributesInput]
  }
}

