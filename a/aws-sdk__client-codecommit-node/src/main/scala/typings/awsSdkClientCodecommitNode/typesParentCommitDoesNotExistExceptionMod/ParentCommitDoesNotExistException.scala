package typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentCommitDoesNotExistException
  extends ServiceException[ParentCommitDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_ParentCommitDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitDoesNotExistException
}

object ParentCommitDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ParentCommitDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitDoesNotExistException,
    stack: String = null
  ): ParentCommitDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentCommitDoesNotExistException]
  }
}

