package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidFilePositionExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidFilePositionExceptionDetails> * / any */ trait InvalidFilePositionException
    extends StObject
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFilePositionException
  }
  object InvalidFilePositionException {
    
    inline def apply(): InvalidFilePositionException = {
      val __obj = js.Dynamic.literal(name = "InvalidFilePositionException")
      __obj.asInstanceOf[InvalidFilePositionException]
    }
    
    extension [Self <: InvalidFilePositionException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFilePositionException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidFilePositionExceptionDetails extends StObject
}
