package typings.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTooLargeException
  extends ServiceException[FileTooLargeExceptionDetails]
     with GetBlobExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileTooLargeException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException = js.native
}

object FileTooLargeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileTooLargeExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException
  ): FileTooLargeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTooLargeException]
  }
  @scala.inline
  implicit class FileTooLargeExceptionOps[Self <: FileTooLargeException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

