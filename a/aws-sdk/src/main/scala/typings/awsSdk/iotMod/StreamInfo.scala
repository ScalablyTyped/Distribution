package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamInfo extends js.Object {
  /**
    * The date when the stream was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The files to stream.
    */
  var files: js.UndefOr[StreamFiles] = js.native
  /**
    * The date when the stream was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * An IAM role AWS IoT assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
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

object StreamInfo {
  @scala.inline
  def apply(
    createdAt: DateType = null,
    description: StreamDescription = null,
    files: StreamFiles = null,
    lastUpdatedAt: DateType = null,
    roleArn: RoleArn = null,
    streamArn: StreamArn = null,
    streamId: StreamId = null,
    streamVersion: Int | Double = null
  ): StreamInfo = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (streamArn != null) __obj.updateDynamic("streamArn")(streamArn.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamVersion != null) __obj.updateDynamic("streamVersion")(streamVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
}

