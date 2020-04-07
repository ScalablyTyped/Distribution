package typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPathException
  extends ServiceException[InvalidPathExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetDifferencesExceptionsUnion
     with GetFileExceptionsUnion
     with GetFolderExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidPathException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPathException
}

object InvalidPathException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidPathExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPathException,
    stack: String = null
  ): InvalidPathException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPathException]
  }
}

