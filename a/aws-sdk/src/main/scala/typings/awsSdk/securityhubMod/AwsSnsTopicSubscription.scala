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
  def apply(): AwsSnsTopicSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicSubscription]
  }
  @scala.inline
  implicit class AwsSnsTopicSubscriptionOps[Self <: AwsSnsTopicSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoint(value: NonEmptyString): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
  }
  
}

