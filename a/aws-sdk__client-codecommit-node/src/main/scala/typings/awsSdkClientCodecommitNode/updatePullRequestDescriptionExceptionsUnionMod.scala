package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestDescriptionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException
    - typings.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException
  */
  trait UpdatePullRequestDescriptionExceptionsUnion extends StObject
  object UpdatePullRequestDescriptionExceptionsUnion {
    
    inline def InvalidDescriptionException(): typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException = {
      val __obj = js.Dynamic.literal(name = "InvalidDescriptionException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException]
    }
    
    inline def InvalidPullRequestIdException(): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    inline def PullRequestAlreadyClosedException(): typings.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException = {
      val __obj = js.Dynamic.literal(name = "PullRequestAlreadyClosedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException]
    }
    
    inline def PullRequestDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "PullRequestDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException]
    }
    
    inline def PullRequestIdRequiredException(): typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "PullRequestIdRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException]
    }
  }
}
