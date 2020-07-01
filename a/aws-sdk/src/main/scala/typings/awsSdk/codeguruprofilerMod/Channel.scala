package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  /**
    * List of publishers for different type of events that may be detected in an application from the profile. Anomaly detection is the only event publisher in Profiler.
    */
  var eventPublishers: EventPublishers = js.native
  /**
    * Unique identifier for each Channel in the notification configuration of a Profiling Group. A random UUID for channelId is used when adding a channel to the notification configuration if not specified in the request.
    */
  var id: js.UndefOr[ChannelId] = js.native
  /**
    * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
    */
  var uri: ChannelUri = js.native
}

object Channel {
  @scala.inline
  def apply(eventPublishers: EventPublishers, uri: ChannelUri, id: ChannelId = null): Channel = {
    val __obj = js.Dynamic.literal(eventPublishers = eventPublishers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

