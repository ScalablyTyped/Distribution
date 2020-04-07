package typings.awsSdkClientCodecommitNode.typesInvalidDestinationCommitSpecifierExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidDestinationCommitSpecifierException
  extends ServiceException[InvalidDestinationCommitSpecifierExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidDestinationCommitSpecifierException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDestinationCommitSpecifierException
}

object InvalidDestinationCommitSpecifierException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidDestinationCommitSpecifierExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDestinationCommitSpecifierException,
    stack: String = null
  ): InvalidDestinationCommitSpecifierException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDestinationCommitSpecifierException]
  }
}

