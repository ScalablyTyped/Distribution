package typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentCommitIdOutdatedException
  extends ServiceException[ParentCommitIdOutdatedExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_ParentCommitIdOutdatedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
}

object ParentCommitIdOutdatedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ParentCommitIdOutdatedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException,
    stack: String = null
  ): ParentCommitIdOutdatedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentCommitIdOutdatedException]
  }
}

