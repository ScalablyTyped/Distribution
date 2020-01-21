package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStreamRequest extends js.Object {
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The files associated with the stream.
    */
  var files: js.UndefOr[StreamFiles] = js.native
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}

object UpdateStreamRequest {
  @scala.inline
  def apply(
    streamId: StreamId,
    description: StreamDescription = null,
    files: StreamFiles = null,
    roleArn: RoleArn = null
  ): UpdateStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamRequest]
  }
}

