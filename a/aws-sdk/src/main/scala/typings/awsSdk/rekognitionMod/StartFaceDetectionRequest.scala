package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFaceDetectionRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * The face attributes you want returned.  DEFAULT - The following subset of facial attributes are returned: BoundingBox, Confidence, Pose, Quality and Landmarks.   ALL - All facial attributes are returned.
    */
  var FaceAttributes: js.UndefOr[typings.awsSdk.rekognitionMod.FaceAttributes] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.native
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the face detection operation.
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.native
  /**
    * The video in which you want to detect faces. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typings.awsSdk.rekognitionMod.Video = js.native
}

object StartFaceDetectionRequest {
  @scala.inline
  def apply(Video: Video): StartFaceDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceDetectionRequest]
  }
  @scala.inline
  implicit class StartFaceDetectionRequestOps[Self <: StartFaceDetectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVideo(value: Video): Self = this.set("Video", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setFaceAttributes(value: FaceAttributes): Self = this.set("FaceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceAttributes: Self = this.set("FaceAttributes", js.undefined)
    @scala.inline
    def setJobTag(value: JobTag): Self = this.set("JobTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTag: Self = this.set("JobTag", js.undefined)
    @scala.inline
    def setNotificationChannel(value: NotificationChannel): Self = this.set("NotificationChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationChannel: Self = this.set("NotificationChannel", js.undefined)
  }
  
}

