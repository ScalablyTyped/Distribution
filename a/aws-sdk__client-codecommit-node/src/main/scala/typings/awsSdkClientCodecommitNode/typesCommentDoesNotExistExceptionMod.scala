package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommentDoesNotExistExceptionDetails> * / any */ trait CommentDoesNotExistException
    extends StObject
       with DeleteCommentContentExceptionsUnion
       with GetCommentExceptionsUnion
       with PostCommentReplyExceptionsUnion
       with UpdateCommentExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
  }
  object CommentDoesNotExistException {
    
    inline def apply(): CommentDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "CommentDoesNotExistException")
      __obj.asInstanceOf[CommentDoesNotExistException]
    }
    
    extension [Self <: CommentDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommentDoesNotExistExceptionDetails extends StObject
}
