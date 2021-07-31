package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteRepositoryExceptionsUnionMod.DeleteRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
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
import typings.awsSdkClientCodecommitNode.updateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryNameExceptionDetails> * / any */ trait InvalidRepositoryNameException
    extends StObject
       with BatchGetRepositoriesExceptionsUnion
       with CreateBranchExceptionsUnion
       with CreatePullRequestExceptionsUnion
       with CreateRepositoryExceptionsUnion
       with DeleteBranchExceptionsUnion
       with DeleteFileExceptionsUnion
       with DeleteRepositoryExceptionsUnion
       with GetBlobExceptionsUnion
       with GetBranchExceptionsUnion
       with GetCommentsForComparedCommitExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetCommitExceptionsUnion
       with GetDifferencesExceptionsUnion
       with GetFileExceptionsUnion
       with GetFolderExceptionsUnion
       with GetMergeConflictsExceptionsUnion
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
       with UpdateRepositoryDescriptionExceptionsUnion
       with UpdateRepositoryNameExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
  }
  object InvalidRepositoryNameException {
    
    @scala.inline
    def apply(): InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[InvalidRepositoryNameException]
    }
    
    @scala.inline
    implicit class InvalidRepositoryNameExceptionMutableBuilder[Self <: InvalidRepositoryNameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryNameExceptionDetails extends StObject
}
