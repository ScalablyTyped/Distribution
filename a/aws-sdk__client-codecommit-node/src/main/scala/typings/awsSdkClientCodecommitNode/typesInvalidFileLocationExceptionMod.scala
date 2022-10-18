package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidFileLocationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidFileLocationExceptionDetails> * / any */ trait InvalidFileLocationException
    extends StObject
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileLocationException
  }
  object InvalidFileLocationException {
    
    inline def apply(): InvalidFileLocationException = {
      val __obj = js.Dynamic.literal(name = "InvalidFileLocationException")
      __obj.asInstanceOf[InvalidFileLocationException]
    }
    
    extension [Self <: InvalidFileLocationException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileLocationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidFileLocationExceptionDetails extends StObject
}
