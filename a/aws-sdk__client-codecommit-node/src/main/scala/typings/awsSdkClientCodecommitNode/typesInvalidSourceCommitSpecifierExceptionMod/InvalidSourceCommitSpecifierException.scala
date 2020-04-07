package typings.awsSdkClientCodecommitNode.typesInvalidSourceCommitSpecifierExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSourceCommitSpecifierException
  extends ServiceException[InvalidSourceCommitSpecifierExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidSourceCommitSpecifierException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
}

object InvalidSourceCommitSpecifierException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSourceCommitSpecifierExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException,
    stack: String = null
  ): InvalidSourceCommitSpecifierException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSourceCommitSpecifierException]
  }
}

