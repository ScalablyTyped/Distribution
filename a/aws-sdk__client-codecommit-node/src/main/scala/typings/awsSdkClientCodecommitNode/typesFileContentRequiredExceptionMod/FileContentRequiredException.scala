package typings.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContentRequiredException
  extends ServiceException[FileContentRequiredExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileContentRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException
}

object FileContentRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileContentRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException,
    stack: String = null
  ): FileContentRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContentRequiredException]
  }
}

