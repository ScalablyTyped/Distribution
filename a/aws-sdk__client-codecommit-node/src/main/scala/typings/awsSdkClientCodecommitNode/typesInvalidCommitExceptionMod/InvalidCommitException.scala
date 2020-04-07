package typings.awsSdkClientCodecommitNode.typesInvalidCommitExceptionMod

import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCommitException
  extends ServiceException[InvalidCommitExceptionDetails]
     with GetDifferencesExceptionsUnion
     with GetFileExceptionsUnion
     with GetFolderExceptionsUnion
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidCommitException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitException
}

object InvalidCommitException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidCommitExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitException,
    stack: String = null
  ): InvalidCommitException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCommitException]
  }
}

