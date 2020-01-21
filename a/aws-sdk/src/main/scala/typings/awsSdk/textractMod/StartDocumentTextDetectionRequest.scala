package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDocumentTextDetectionRequest extends js.Object {
  /**
    * The idempotent token that's used to identify the start request. If you use the same token with multiple StartDocumentTextDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. For more information, see Calling Amazon Textract Asynchronous Operations.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.textractMod.ClientRequestToken] = js.native
  /**
    * The location of the document to be processed.
    */
  var DocumentLocation: typings.awsSdk.textractMod.DocumentLocation = js.native
  /**
    * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic. For example, you can use JobTag to identify the type of document that the completion notification corresponds to (such as a tax form or a receipt).
    */
  var JobTag: js.UndefOr[typings.awsSdk.textractMod.JobTag] = js.native
  /**
    * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.textractMod.NotificationChannel] = js.native
}

object StartDocumentTextDetectionRequest {
  @scala.inline
  def apply(
    DocumentLocation: DocumentLocation,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartDocumentTextDetectionRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag.asInstanceOf[js.Any])
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentTextDetectionRequest]
  }
}

