package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartContentModerationRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartContentModeration requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.native
  /**
    * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content labels with a confidence level lower than this specified value. If you don't specify MinConfidence, GetContentModeration returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
  /**
    * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the unsafe content analysis to.
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.native
  /**
    * The video in which you want to detect unsafe content. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typings.awsSdk.rekognitionMod.Video = js.native
}

object StartContentModerationRequest {
  @scala.inline
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    MinConfidence: js.UndefOr[Percent] = js.undefined,
    NotificationChannel: NotificationChannel = null
  ): StartContentModerationRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag.asInstanceOf[js.Any])
    if (!js.isUndefined(MinConfidence)) __obj.updateDynamic("MinConfidence")(MinConfidence.get.asInstanceOf[js.Any])
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContentModerationRequest]
  }
}

