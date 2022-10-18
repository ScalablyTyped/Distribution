package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientRequestTokenRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ClientRequestTokenRequiredExceptionDetails> * / any */ trait ClientRequestTokenRequiredException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion
       with PostCommentReplyExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ClientRequestTokenRequiredException
  }
  object ClientRequestTokenRequiredException {
    
    inline def apply(): ClientRequestTokenRequiredException = {
      val __obj = js.Dynamic.literal(name = "ClientRequestTokenRequiredException")
      __obj.asInstanceOf[ClientRequestTokenRequiredException]
    }
    
    extension [Self <: ClientRequestTokenRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ClientRequestTokenRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientRequestTokenRequiredExceptionDetails extends StObject
}
