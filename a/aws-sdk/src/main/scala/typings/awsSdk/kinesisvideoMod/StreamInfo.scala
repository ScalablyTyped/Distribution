package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamInfo extends js.Object {
  /**
    * A time stamp that indicates when the stream was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * How long the stream retains data, in hours.
    */
  var DataRetentionInHours: js.UndefOr[typings.awsSdk.kinesisvideoMod.DataRetentionInHours] = js.native
  /**
    * The name of the device that is associated with the stream.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.kinesisvideoMod.DeviceName] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the stream.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.kinesisvideoMod.KmsKeyId] = js.native
  /**
    * The MediaType of the stream. 
    */
  var MediaType: js.UndefOr[typings.awsSdk.kinesisvideoMod.MediaType] = js.native
  /**
    * The status of the stream.
    */
  var Status: js.UndefOr[typings.awsSdk.kinesisvideoMod.Status] = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
  /**
    * The version of the stream.
    */
  var Version: js.UndefOr[typings.awsSdk.kinesisvideoMod.Version] = js.native
}

object StreamInfo {
  @scala.inline
  def apply(): StreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamInfo]
  }
  @scala.inline
  implicit class StreamInfoOps[Self <: StreamInfo] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDataRetentionInHours(value: DataRetentionInHours): Self = this.set("DataRetentionInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRetentionInHours: Self = this.set("DataRetentionInHours", js.undefined)
    @scala.inline
    def setDeviceName(value: DeviceName): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMediaType(value: MediaType): Self = this.set("MediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("MediaType", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

