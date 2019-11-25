package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidPathExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPathException
  extends ServiceException[_InvalidPathExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetDifferencesExceptionsUnion
     with GetFileExceptionsUnion
     with GetFolderExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidPathException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPathException
}

object InvalidPathException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidPathExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPathException,
    stack: String = null
  ): InvalidPathException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPathException]
  }
}

