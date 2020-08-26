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
  def apply(DocumentLocation: DocumentLocation): StartDocumentTextDetectionRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentTextDetectionRequest]
  }
  @scala.inline
  implicit class StartDocumentTextDetectionRequestOps[Self <: StartDocumentTextDetectionRequest] (val x: Self) extends AnyVal {
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
    def setDocumentLocation(value: DocumentLocation): Self = this.set("DocumentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
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

