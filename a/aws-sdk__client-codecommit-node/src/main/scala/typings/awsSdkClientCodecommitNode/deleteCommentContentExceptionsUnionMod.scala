package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def CommentDeletedException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDeletedException): typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException]
    }
    
    @scala.inline
    def CommentDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException]
    }
    
    @scala.inline
    def CommentIdRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentIdRequiredException
    ): typings.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException]
    }
    
    @scala.inline
    def InvalidCommentIdException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
    ): typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException]
    }
  }
}
