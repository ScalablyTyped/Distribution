package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSummary extends js.Object {
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.native
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.native
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.native
}

object StreamSummary {
  @scala.inline
  def apply(
    description: StreamDescription = null,
    streamArn: StreamArn = null,
    streamId: StreamId = null,
    streamVersion: Int | Double = null
  ): StreamSummary = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (streamArn != null) __obj.updateDynamic("streamArn")(streamArn.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamVersion != null) __obj.updateDynamic("streamVersion")(streamVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSummary]
  }
}

