package typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameLengthExceededException
  extends ServiceException[NameLengthExceededExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_NameLengthExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NameLengthExceededException
}

object NameLengthExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NameLengthExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NameLengthExceededException,
    stack: String = null
  ): NameLengthExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameLengthExceededException]
  }
}

