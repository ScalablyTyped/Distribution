package typings.awsSdkClientCodecommitNode.typesCommitRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequiredException
  extends ServiceException[CommitRequiredExceptionDetails]
     with GetDifferencesExceptionsUnion
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_CommitRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitRequiredException
}

object CommitRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommitRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitRequiredException,
    stack: String = null
  ): CommitRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitRequiredException]
  }
}

