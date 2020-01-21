package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicConfiguration extends js.Object {
  /**
    * The Amazon S3 bucket event about which to send notifications. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList = js.native
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var TopicArn: typings.awsSdk.s3Mod.TopicArn = js.native
}

object TopicConfiguration {
  @scala.inline
  def apply(
    Events: EventList,
    TopicArn: TopicArn,
    Filter: NotificationConfigurationFilter = null,
    Id: NotificationId = null
  ): TopicConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicConfiguration]
  }
}

