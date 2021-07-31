package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentNotCreatedByCallerExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommentNotCreatedByCallerExceptionDetails> * / any */ trait CommentNotCreatedByCallerException
    extends StObject
       with UpdateCommentExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException
  }
  object CommentNotCreatedByCallerException {
    
    @scala.inline
    def apply(): CommentNotCreatedByCallerException = {
      val __obj = js.Dynamic.literal(name = "CommentNotCreatedByCallerException")
      __obj.asInstanceOf[CommentNotCreatedByCallerException]
    }
    
    @scala.inline
    implicit class CommentNotCreatedByCallerExceptionMutableBuilder[Self <: CommentNotCreatedByCallerException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommentNotCreatedByCallerExceptionDetails extends StObject
}
