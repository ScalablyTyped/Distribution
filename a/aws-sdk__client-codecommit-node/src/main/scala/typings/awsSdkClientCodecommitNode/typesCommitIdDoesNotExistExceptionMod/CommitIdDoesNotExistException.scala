package typings.awsSdkClientCodecommitNode.typesCommitIdDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitIdDoesNotExistException
  extends ServiceException[CommitIdDoesNotExistExceptionDetails]
     with GetCommitExceptionsUnion {
  @JSName("name")
  var name_CommitIdDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdDoesNotExistException
}

object CommitIdDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommitIdDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdDoesNotExistException,
    stack: String = null
  ): CommitIdDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitIdDoesNotExistException]
  }
}

