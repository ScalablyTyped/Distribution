package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSnsTopicDetails extends js.Object {
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
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
  def apply(
    KmsMasterKeyId: NonEmptyString = null,
    Owner: NonEmptyString = null,
    Subscription: AwsSnsTopicSubscriptionList = null,
    TopicName: NonEmptyString = null
  ): AwsSnsTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (KmsMasterKeyId != null) __obj.updateDynamic("KmsMasterKeyId")(KmsMasterKeyId.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Subscription != null) __obj.updateDynamic("Subscription")(Subscription.asInstanceOf[js.Any])
    if (TopicName != null) __obj.updateDynamic("TopicName")(TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSnsTopicDetails]
  }
}

