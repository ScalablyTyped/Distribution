package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSnsTopicSubscription extends js.Object {
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.native
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
}

object AwsSnsTopicSubscription {
  @scala.inline
  def apply(Endpoint: NonEmptyString = null, Protocol: NonEmptyString = null): AwsSnsTopicSubscription = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSnsTopicSubscription]
  }
}

