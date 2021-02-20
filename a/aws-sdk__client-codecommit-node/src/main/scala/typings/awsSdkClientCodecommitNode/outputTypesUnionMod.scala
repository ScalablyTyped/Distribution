package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typings.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typings.awsSdkClientCodecommitNode.typesPullRequestEventMod.UnmarshalledPullRequestEvent
import typings.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
    - typings.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
    - typings.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput
    - typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
    - typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
    - typings.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
    - typings.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
    - typings.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput
    - typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
    - typings.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
    - typings.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
    - typings.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput
    - typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
    - typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput
    - typings.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput
    - typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
    - typings.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
    - typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
    - typings.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
    - typings.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
    - typings.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
    - typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
    - typings.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
    - typings.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
    - typings.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
    - typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
    - typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
    - typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
    - typings.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
    - typings.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
    - typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
    - typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
    - typings.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
    - typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
    - typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
    - typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput
    - typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
    - typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
    - typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def BatchGetRepositoriesOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput]
    }
    
    @scala.inline
    def CreateBranchOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput]
    }
    
    @scala.inline
    def CreatePullRequestOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typings.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput]
    }
    
    @scala.inline
    def CreateRepositoryOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput]
    }
    
    @scala.inline
    def DeleteBranchOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput]
    }
    
    @scala.inline
    def DeleteCommentContentOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput]
    }
    
    @scala.inline
    def DeleteFileOutput($metadata: ResponseMetadata, blobId: String, commitId: String, filePath: String, treeId: String): typings.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput]
    }
    
    @scala.inline
    def DeleteRepositoryOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput]
    }
    
    @scala.inline
    def DescribePullRequestEventsOutput($metadata: ResponseMetadata, pullRequestEvents: js.Array[UnmarshalledPullRequestEvent]): typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput]
    }
    
    @scala.inline
    def GetBlobOutput($metadata: ResponseMetadata, content: Uint8Array): typings.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput]
    }
    
    @scala.inline
    def GetBranchOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput]
    }
    
    @scala.inline
    def GetCommentOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput]
    }
    
    @scala.inline
    def GetCommentsForComparedCommitOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput]
    }
    
    @scala.inline
    def GetCommentsForPullRequestOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput]
    }
    
    @scala.inline
    def GetCommitOutput($metadata: ResponseMetadata, commit: UnmarshalledCommit): typings.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput]
    }
    
    @scala.inline
    def GetDifferencesOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput]
    }
    
    @scala.inline
    def GetFileOutput(
      $metadata: ResponseMetadata,
      blobId: String,
      commitId: String,
      fileContent: Uint8Array,
      fileMode: EXECUTABLE | NORMAL | SYMLINK | String,
      filePath: String,
      fileSize: Double
    ): typings.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput]
    }
    
    @scala.inline
    def GetFolderOutput($metadata: ResponseMetadata, commitId: String, folderPath: String): typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput]
    }
    
    @scala.inline
    def GetMergeConflictsOutput(
      $metadata: ResponseMetadata,
      destinationCommitId: String,
      mergeable: Boolean,
      sourceCommitId: String
    ): typings.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput]
    }
    
    @scala.inline
    def GetPullRequestOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typings.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput]
    }
    
    @scala.inline
    def GetRepositoryOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput]
    }
    
    @scala.inline
    def GetRepositoryTriggersOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput]
    }
    
    @scala.inline
    def ListBranchesOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput]
    }
    
    @scala.inline
    def ListPullRequestsOutput($metadata: ResponseMetadata, pullRequestIds: js.Array[String]): typings.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput]
    }
    
    @scala.inline
    def ListRepositoriesOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput]
    }
    
    @scala.inline
    def MergePullRequestByFastForwardOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput]
    }
    
    @scala.inline
    def PostCommentForComparedCommitOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput]
    }
    
    @scala.inline
    def PostCommentForPullRequestOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput]
    }
    
    @scala.inline
    def PostCommentReplyOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput]
    }
    
    @scala.inline
    def PutFileOutput($metadata: ResponseMetadata, blobId: String, commitId: String, treeId: String): typings.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput]
    }
    
    @scala.inline
    def PutRepositoryTriggersOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput]
    }
    
    @scala.inline
    def TestRepositoryTriggersOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput]
    }
    
    @scala.inline
    def UpdateCommentOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput]
    }
    
    @scala.inline
    def UpdateDefaultBranchOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput]
    }
    
    @scala.inline
    def UpdatePullRequestDescriptionOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput]
    }
    
    @scala.inline
    def UpdatePullRequestStatusOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput]
    }
    
    @scala.inline
    def UpdatePullRequestTitleOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput]
    }
    
    @scala.inline
    def UpdateRepositoryDescriptionOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput]
    }
    
    @scala.inline
    def UpdateRepositoryNameOutput($metadata: ResponseMetadata): typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput]
    }
  }
}
