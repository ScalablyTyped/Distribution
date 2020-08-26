package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFaceSearchRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceSearch requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * ID of the collection that contains the faces you want to search for.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
  /**
    * The minimum confidence in the person match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.native
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the search. 
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.native
  /**
    * The video you want to search. The video must be stored in an Amazon S3 bucket. 
    */
  var Video: typings.awsSdk.rekognitionMod.Video = js.native
}

object StartFaceSearchRequest {
  @scala.inline
  def apply(CollectionId: CollectionId, Video: Video): StartFaceSearchRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceSearchRequest]
  }
  @scala.inline
  implicit class StartFaceSearchRequestOps[Self <: StartFaceSearchRequest] (val x: Self) extends AnyVal {
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
    def setCollectionId(value: CollectionId): Self = this.set("CollectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideo(value: Video): Self = this.set("Video", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setFaceMatchThreshold(value: Percent): Self = this.set("FaceMatchThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceMatchThreshold: Self = this.set("FaceMatchThreshold", js.undefined)
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

