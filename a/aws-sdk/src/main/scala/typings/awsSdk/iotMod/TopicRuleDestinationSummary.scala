package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDestinationSummary extends js.Object {
  /**
    * The topic rule destination ARN.
    */
  var arn: js.UndefOr[AwsArn] = js.native
  /**
    * Information about the HTTP URL.
    */
  var httpUrlSummary: js.UndefOr[HttpUrlDestinationSummary] = js.native
  /**
    * The status of the topic rule destination. Valid values are:  IN_PROGRESS  A topic rule destination was created but has not been confirmed. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  ENABLED  Confirmation was completed, and traffic to this destination is allowed. You can set status to DISABLED by calling UpdateTopicRuleDestination.  DISABLED  Confirmation was completed, and traffic to this destination is not allowed. You can set status to ENABLED by calling UpdateTopicRuleDestination.  ERROR  Confirmation could not be completed, for example if the confirmation timed out. You can call GetTopicRuleDestination for details about the error. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  
    */
  var status: js.UndefOr[TopicRuleDestinationStatus] = js.native
  /**
    * The reason the topic rule destination is in the current status.
    */
  var statusReason: js.UndefOr[String] = js.native
}

object TopicRuleDestinationSummary {
  @scala.inline
  def apply(
    arn: AwsArn = null,
    httpUrlSummary: HttpUrlDestinationSummary = null,
    status: TopicRuleDestinationStatus = null,
    statusReason: String = null
  ): TopicRuleDestinationSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (httpUrlSummary != null) __obj.updateDynamic("httpUrlSummary")(httpUrlSummary.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDestinationSummary]
  }
}

