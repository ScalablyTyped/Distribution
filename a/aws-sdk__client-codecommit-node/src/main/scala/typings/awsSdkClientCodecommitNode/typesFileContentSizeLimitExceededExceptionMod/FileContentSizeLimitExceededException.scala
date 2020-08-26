package typings.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileContentSizeLimitExceededException
  extends ServiceException[FileContentSizeLimitExceededExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileContentSizeLimitExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException = js.native
}

object FileContentSizeLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileContentSizeLimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
  ): FileContentSizeLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContentSizeLimitExceededException]
  }
  @scala.inline
  implicit class FileContentSizeLimitExceededExceptionOps[Self <: FileContentSizeLimitExceededException] (val x: Self) extends AnyVal {
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
    def setName(
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

