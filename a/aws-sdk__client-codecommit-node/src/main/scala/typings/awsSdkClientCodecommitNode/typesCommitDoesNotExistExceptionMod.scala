package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreateBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommitDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommitDoesNotExistExceptionDetails> * / any */ trait CommitDoesNotExistException
    extends StObject
       with CreateBranchExceptionsUnion
       with GetCommentsForComparedCommitExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetDifferencesExceptionsUnion
       with GetFileExceptionsUnion
       with GetFolderExceptionsUnion
       with GetMergeConflictsExceptionsUnion
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitDoesNotExistException
  }
  object CommitDoesNotExistException {
    
    inline def apply(): CommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "CommitDoesNotExistException")
      __obj.asInstanceOf[CommitDoesNotExistException]
    }
    
    extension [Self <: CommitDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitDoesNotExistExceptionDetails extends StObject
}
