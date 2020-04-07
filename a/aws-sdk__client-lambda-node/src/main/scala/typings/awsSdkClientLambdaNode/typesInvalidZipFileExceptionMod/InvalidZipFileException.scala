package typings.awsSdkClientLambdaNode.typesInvalidZipFileExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidZipFileException
  extends ServiceException[InvalidZipFileExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidZipFileException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException
}

object InvalidZipFileException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidZipFileExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException,
    stack: String = null
  ): InvalidZipFileException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidZipFileException]
  }
}

