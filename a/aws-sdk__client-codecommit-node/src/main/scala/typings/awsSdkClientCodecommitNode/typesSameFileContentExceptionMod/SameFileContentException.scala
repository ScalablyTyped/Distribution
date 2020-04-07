package typings.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SameFileContentException
  extends ServiceException[SameFileContentExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_SameFileContentException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
}

object SameFileContentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: SameFileContentExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException,
    stack: String = null
  ): SameFileContentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameFileContentException]
  }
}

