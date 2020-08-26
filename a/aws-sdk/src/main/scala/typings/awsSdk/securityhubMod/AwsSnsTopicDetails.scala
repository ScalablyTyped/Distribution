package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSnsTopicDetails extends js.Object {
  /**
    * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
    */
  var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.native
  /**
    * The name of the topic.
    */
  var TopicName: js.UndefOr[NonEmptyString] = js.native
}

object AwsSnsTopicDetails {
  @scala.inline
  def apply(): AwsSnsTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicDetails]
  }
  @scala.inline
  implicit class AwsSnsTopicDetailsOps[Self <: AwsSnsTopicDetails] (val x: Self) extends AnyVal {
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
    def setKmsMasterKeyId(value: NonEmptyString): Self = this.set("KmsMasterKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsMasterKeyId: Self = this.set("KmsMasterKeyId", js.undefined)
    @scala.inline
    def setOwner(value: NonEmptyString): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setSubscriptionVarargs(value: AwsSnsTopicSubscription*): Self = this.set("Subscription", js.Array(value :_*))
    @scala.inline
    def setSubscription(value: AwsSnsTopicSubscriptionList): Self = this.set("Subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("Subscription", js.undefined)
    @scala.inline
    def setTopicName(value: NonEmptyString): Self = this.set("TopicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicName: Self = this.set("TopicName", js.undefined)
  }
  
}

