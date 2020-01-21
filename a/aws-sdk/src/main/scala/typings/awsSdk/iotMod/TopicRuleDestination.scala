package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDestination extends js.Object {
  /**
    * The topic rule destination URL.
    */
  var arn: js.UndefOr[AwsArn] = js.native
  /**
    * Properties of the HTTP URL.
    */
  var httpUrlProperties: js.UndefOr[HttpUrlDestinationProperties] = js.native
  /**
    * The status of the topic rule destination. Valid values are:  IN_PROGRESS  A topic rule destination was created but has not been confirmed. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  ENABLED  Confirmation was completed, and traffic to this destination is allowed. You can set status to DISABLED by calling UpdateTopicRuleDestination.  DISABLED  Confirmation was completed, and traffic to this destination is not allowed. You can set status to ENABLED by calling UpdateTopicRuleDestination.  ERROR  Confirmation could not be completed, for example if the confirmation timed out. You can call GetTopicRuleDestination for details about the error. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  
    */
  var status: js.UndefOr[TopicRuleDestinationStatus] = js.native
  /**
    * Additional details or reason why the topic rule destination is in the current status.
    */
  var statusReason: js.UndefOr[String] = js.native
}

object TopicRuleDestination {
  @scala.inline
  def apply(
    arn: AwsArn = null,
    httpUrlProperties: HttpUrlDestinationProperties = null,
    status: TopicRuleDestinationStatus = null,
    statusReason: String = null
  ): TopicRuleDestination = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (httpUrlProperties != null) __obj.updateDynamic("httpUrlProperties")(httpUrlProperties.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDestination]
  }
}

