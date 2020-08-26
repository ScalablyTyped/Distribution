package typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod

import typings.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteRepositoryExceptionsUnionMod.DeleteRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkClientCodecommitNode.getPullRequestExceptionsUnionMod.GetPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getRepositoryExceptionsUnionMod.GetRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.getRepositoryTriggersExceptionsUnionMod.GetRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.listBranchesExceptionsUnionMod.ListBranchesExceptionsUnion
import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionKeyDisabledException
  extends ServiceException[EncryptionKeyDisabledExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion
     with CreateBranchExceptionsUnion
     with CreatePullRequestExceptionsUnion
     with CreateRepositoryExceptionsUnion
     with DeleteBranchExceptionsUnion
     with DeleteFileExceptionsUnion
     with DeleteRepositoryExceptionsUnion
     with DescribePullRequestEventsExceptionsUnion
     with GetBlobExceptionsUnion
     with GetBranchExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetCommitExceptionsUnion
     with GetDifferencesExceptionsUnion
     with GetFileExceptionsUnion
     with GetFolderExceptionsUnion
     with GetMergeConflictsExceptionsUnion
     with GetPullRequestExceptionsUnion
     with GetRepositoryExceptionsUnion
     with GetRepositoryTriggersExceptionsUnion
     with ListBranchesExceptionsUnion
     with ListPullRequestsExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PutFileExceptionsUnion
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion
     with UpdateRepositoryDescriptionExceptionsUnion {
  @JSName("name")
  var name_EncryptionKeyDisabledException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyDisabledException = js.native
}

object EncryptionKeyDisabledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EncryptionKeyDisabledExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyDisabledException
  ): EncryptionKeyDisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKeyDisabledException]
  }
  @scala.inline
  implicit class EncryptionKeyDisabledExceptionOps[Self <: EncryptionKeyDisabledException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyDisabledException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

