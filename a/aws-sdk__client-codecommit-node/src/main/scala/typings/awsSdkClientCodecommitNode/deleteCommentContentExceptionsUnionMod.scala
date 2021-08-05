package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteCommentContentExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException
    - typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException
  */
  trait DeleteCommentContentExceptionsUnion extends StObject
  object DeleteCommentContentExceptionsUnion {
    
    inline def CommentDeletedException(): typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException = {
      val __obj = js.Dynamic.literal(name = "CommentDeletedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException]
    }
    
    inline def CommentDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "CommentDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException]
    }
    
    inline def CommentIdRequiredException(): typings.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "CommentIdRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException]
    }
    
    inline def InvalidCommentIdException(): typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidCommentIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException]
    }
  }
}
