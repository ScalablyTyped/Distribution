package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateCommentExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesCommentContentRequiredExceptionMod.CommentContentRequiredException
    - typings.awsSdkClientCodecommitNode.typesCommentContentSizeLimitExceededExceptionMod.CommentContentSizeLimitExceededException
    - typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException
    - typings.awsSdkClientCodecommitNode.typesCommentNotCreatedByCallerExceptionMod.CommentNotCreatedByCallerException
    - typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException
  */
  trait UpdateCommentExceptionsUnion extends StObject
  object UpdateCommentExceptionsUnion {
    
    inline def CommentContentRequiredException(): typings.awsSdkClientCodecommitNode.typesCommentContentRequiredExceptionMod.CommentContentRequiredException = {
      val __obj = js.Dynamic.literal(name = "CommentContentRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentContentRequiredExceptionMod.CommentContentRequiredException]
    }
    
    inline def CommentContentSizeLimitExceededException(): typings.awsSdkClientCodecommitNode.typesCommentContentSizeLimitExceededExceptionMod.CommentContentSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "CommentContentSizeLimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentContentSizeLimitExceededExceptionMod.CommentContentSizeLimitExceededException]
    }
    
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
    
    inline def CommentNotCreatedByCallerException(): typings.awsSdkClientCodecommitNode.typesCommentNotCreatedByCallerExceptionMod.CommentNotCreatedByCallerException = {
      val __obj = js.Dynamic.literal(name = "CommentNotCreatedByCallerException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommentNotCreatedByCallerExceptionMod.CommentNotCreatedByCallerException]
    }
    
    inline def InvalidCommentIdException(): typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidCommentIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException]
    }
  }
}
