package typings.awsSdkClientS3Browser.typesNoSuchUploadMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchUpload extends ServiceException[NoSuchUploadDetails] {
  @JSName("name")
  var name_NoSuchUpload: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload
}

object NoSuchUpload {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchUploadDetails,
    message: String,
    name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload,
    stack: String = null
  ): NoSuchUpload = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchUpload]
  }
}

