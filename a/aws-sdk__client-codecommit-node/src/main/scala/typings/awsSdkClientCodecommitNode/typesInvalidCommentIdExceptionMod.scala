package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidCommentIdExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidCommentIdExceptionDetails> * / any */ trait InvalidCommentIdException
    extends StObject
       with DeleteCommentContentExceptionsUnion
       with GetCommentExceptionsUnion
       with PostCommentReplyExceptionsUnion
       with UpdateCommentExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
  }
  object InvalidCommentIdException {
    
    inline def apply(): InvalidCommentIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidCommentIdException")
      __obj.asInstanceOf[InvalidCommentIdException]
    }
    
    extension [Self <: InvalidCommentIdException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidCommentIdExceptionDetails extends StObject
}
