package typings.awsSdkClientCodecommitNode.typesFolderDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderDoesNotExistException
  extends ServiceException[FolderDoesNotExistExceptionDetails]
     with GetFolderExceptionsUnion {
  @JSName("name")
  var name_FolderDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException = js.native
}

object FolderDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FolderDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException
  ): FolderDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderDoesNotExistException]
  }
  @scala.inline
  implicit class FolderDoesNotExistExceptionOps[Self <: FolderDoesNotExistException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

