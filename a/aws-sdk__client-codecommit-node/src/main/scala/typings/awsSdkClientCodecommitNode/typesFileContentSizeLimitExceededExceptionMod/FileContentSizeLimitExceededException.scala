package typings.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContentSizeLimitExceededException
  extends ServiceException[FileContentSizeLimitExceededExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileContentSizeLimitExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
}

object FileContentSizeLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileContentSizeLimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException,
    stack: String = null
  ): FileContentSizeLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContentSizeLimitExceededException]
  }
}

