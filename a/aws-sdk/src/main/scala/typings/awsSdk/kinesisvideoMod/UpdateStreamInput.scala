package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStreamInput extends js.Object {
  /**
    * The version of the stream whose metadata you want to update.
    */
  var CurrentVersion: Version = js.native
  /**
    * The name of the device that is writing to the stream.    In the current implementation, Kinesis Video Streams does not use this name.  
    */
  var DeviceName: js.UndefOr[typings.awsSdk.kinesisvideoMod.DeviceName] = js.native
  /**
    * The stream's media type. Use MediaType to specify the type of content that the stream contains to the consumers of the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements. To play video on the console, you must specify the correct video type. For example, if the video in the stream is H.264, specify video/h264 as the MediaType.
    */
  var MediaType: js.UndefOr[typings.awsSdk.kinesisvideoMod.MediaType] = js.native
  /**
    * The ARN of the stream whose metadata you want to update.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream whose metadata you want to update. The stream name is an identifier for the stream, and must be unique for each account and region.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
}

object UpdateStreamInput {
  @scala.inline
  def apply(CurrentVersion: Version): UpdateStreamInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamInput]
  }
  @scala.inline
  implicit class UpdateStreamInputOps[Self <: UpdateStreamInput] (val x: Self) extends AnyVal {
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
    def setCurrentVersion(value: Version): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceName(value: DeviceName): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    @scala.inline
    def setMediaType(value: MediaType): Self = this.set("MediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("MediaType", js.undefined)
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
  
}

