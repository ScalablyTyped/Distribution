package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestTitleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException
    - typings.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException
  */
  trait UpdatePullRequestTitleExceptionsUnion extends StObject
  object UpdatePullRequestTitleExceptionsUnion {
    
    inline def InvalidPullRequestIdException(): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    inline def InvalidTitleException(): typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException = {
      val __obj = js.Dynamic.literal(name = "InvalidTitleException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException]
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
    
    inline def TitleRequiredException(): typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException = {
      val __obj = js.Dynamic.literal(name = "TitleRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException]
    }
  }
}
