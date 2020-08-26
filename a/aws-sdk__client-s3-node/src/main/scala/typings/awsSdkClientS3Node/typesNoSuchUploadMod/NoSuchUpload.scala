package typings.awsSdkClientS3Node.typesNoSuchUploadMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSuchUpload extends ServiceException[NoSuchUploadDetails] {
  @JSName("name")
  var name_NoSuchUpload: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload = js.native
}

object NoSuchUpload {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchUploadDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload
  ): NoSuchUpload = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchUpload]
  }
  @scala.inline
  implicit class NoSuchUploadOps[Self <: NoSuchUpload] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

