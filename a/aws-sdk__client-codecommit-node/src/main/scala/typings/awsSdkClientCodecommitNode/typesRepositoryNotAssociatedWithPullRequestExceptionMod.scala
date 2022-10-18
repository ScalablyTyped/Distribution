package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryNotAssociatedWithPullRequestExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryNotAssociatedWithPullRequestExceptionDetails> * / any */ trait RepositoryNotAssociatedWithPullRequestException
    extends StObject
       with GetCommentsForPullRequestExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException
  }
  object RepositoryNotAssociatedWithPullRequestException {
    
    inline def apply(): RepositoryNotAssociatedWithPullRequestException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNotAssociatedWithPullRequestException")
      __obj.asInstanceOf[RepositoryNotAssociatedWithPullRequestException]
    }
    
    extension [Self <: RepositoryNotAssociatedWithPullRequestException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryNotAssociatedWithPullRequestExceptionDetails extends StObject
}
