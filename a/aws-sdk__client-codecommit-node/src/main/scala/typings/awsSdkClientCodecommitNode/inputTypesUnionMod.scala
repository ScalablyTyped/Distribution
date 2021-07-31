package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FAST_FORWARD_MERGE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.RepositoryTrigger
import typings.awsSdkClientCodecommitNode.typesTargetMod.Target
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
    - typings.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
    - typings.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput
    - typings.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
    - typings.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
    - typings.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
    - typings.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
    - typings.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput
    - typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
    - typings.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
    - typings.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
    - typings.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput
    - typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
    - typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput
    - typings.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput
    - typings.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
    - typings.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
    - typings.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
    - typings.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
    - typings.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
    - typings.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
    - typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
    - typings.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
    - typings.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
    - typings.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
    - typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
    - typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
    - typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
    - typings.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
    - typings.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
    - typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
    - typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
    - typings.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
    - typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
    - typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
    - typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput
    - typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
    - typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
    - typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def BatchGetRepositoriesInput(repositoryNames: js.Array[String] | Iterable[String]): typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput = {
      val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput]
    }
    
    @scala.inline
    def CreateBranchInput(branchName: String, commitId: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput]
    }
    
    @scala.inline
    def CreatePullRequestInput(targets: js.Array[Target] | Iterable[Target], title: String): typings.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput = {
      val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput]
    }
    
    @scala.inline
    def CreateRepositoryInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput]
    }
    
    @scala.inline
    def DeleteBranchInput(branchName: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput]
    }
    
    @scala.inline
    def DeleteCommentContentInput(commentId: String): typings.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput]
    }
    
    @scala.inline
    def DeleteFileInput(branchName: String, filePath: String, parentCommitId: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput]
    }
    
    @scala.inline
    def DeleteRepositoryInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput]
    }
    
    @scala.inline
    def DescribePullRequestEventsInput(pullRequestId: String): typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput]
    }
    
    @scala.inline
    def GetBlobInput(blobId: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput = {
      val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput]
    }
    
    @scala.inline
    def GetBranchInput(): typings.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput]
    }
    
    @scala.inline
    def GetCommentInput(commentId: String): typings.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput]
    }
    
    @scala.inline
    def GetCommentsForComparedCommitInput(afterCommitId: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput]
    }
    
    @scala.inline
    def GetCommentsForPullRequestInput(pullRequestId: String): typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput]
    }
    
    @scala.inline
    def GetCommitInput(commitId: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput = {
      val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput]
    }
    
    @scala.inline
    def GetDifferencesInput(afterCommitSpecifier: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput = {
      val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput]
    }
    
    @scala.inline
    def GetFileInput(filePath: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput]
    }
    
    @scala.inline
    def GetFolderInput(folderPath: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput = {
      val __obj = js.Dynamic.literal(folderPath = folderPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput]
    }
    
    @scala.inline
    def GetMergeConflictsInput(
      destinationCommitSpecifier: String,
      mergeOption: FAST_FORWARD_MERGE | String,
      repositoryName: String,
      sourceCommitSpecifier: String
    ): typings.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput = {
      val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput]
    }
    
    @scala.inline
    def GetPullRequestInput(pullRequestId: String): typings.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput]
    }
    
    @scala.inline
    def GetRepositoryInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput]
    }
    
    @scala.inline
    def GetRepositoryTriggersInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput]
    }
    
    @scala.inline
    def ListBranchesInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput]
    }
    
    @scala.inline
    def ListPullRequestsInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput]
    }
    
    @scala.inline
    def ListRepositoriesInput(): typings.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput]
    }
    
    @scala.inline
    def MergePullRequestByFastForwardInput(pullRequestId: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput]
    }
    
    @scala.inline
    def PostCommentForComparedCommitInput(afterCommitId: String, content: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput]
    }
    
    @scala.inline
    def PostCommentForPullRequestInput(
      afterCommitId: String,
      beforeCommitId: String,
      content: String,
      pullRequestId: String,
      repositoryName: String
    ): typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], beforeCommitId = beforeCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput]
    }
    
    @scala.inline
    def PostCommentReplyInput(content: String, inReplyTo: String): typings.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput]
    }
    
    @scala.inline
    def PutFileInput(
      branchName: String,
      fileContent: ArrayBuffer | ArrayBufferView | String,
      filePath: String,
      repositoryName: String
    ): typings.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput]
    }
    
    @scala.inline
    def PutRepositoryTriggersInput(repositoryName: String, triggers: js.Array[RepositoryTrigger] | Iterable[RepositoryTrigger]): typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput]
    }
    
    @scala.inline
    def TestRepositoryTriggersInput(repositoryName: String, triggers: js.Array[RepositoryTrigger] | Iterable[RepositoryTrigger]): typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput]
    }
    
    @scala.inline
    def UpdateCommentInput(commentId: String, content: String): typings.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput]
    }
    
    @scala.inline
    def UpdateDefaultBranchInput(defaultBranchName: String, repositoryName: String): typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput = {
      val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput]
    }
    
    @scala.inline
    def UpdatePullRequestDescriptionInput(description: String, pullRequestId: String): typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput]
    }
    
    @scala.inline
    def UpdatePullRequestStatusInput(pullRequestId: String, pullRequestStatus: OPEN | CLOSED | String): typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], pullRequestStatus = pullRequestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput]
    }
    
    @scala.inline
    def UpdatePullRequestTitleInput(pullRequestId: String, title: String): typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput]
    }
    
    @scala.inline
    def UpdateRepositoryDescriptionInput(repositoryName: String): typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput]
    }
    
    @scala.inline
    def UpdateRepositoryNameInput(newName: String, oldName: String): typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput = {
      val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput]
    }
  }
}
