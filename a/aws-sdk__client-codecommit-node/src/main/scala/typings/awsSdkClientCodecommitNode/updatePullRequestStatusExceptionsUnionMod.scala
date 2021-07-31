package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestStatusExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusUpdateExceptionMod.InvalidPullRequestStatusUpdateException
    - typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusExceptionMod.InvalidPullRequestStatusException
    - typings.awsSdkClientCodecommitNode.typesPullRequestStatusRequiredExceptionMod.PullRequestStatusRequiredException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
  */
  trait UpdatePullRequestStatusExceptionsUnion extends StObject
  object UpdatePullRequestStatusExceptionsUnion {
    
    @scala.inline
    def EncryptionIntegrityChecksFailedException(): typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException = {
      val __obj = js.Dynamic.literal(name = "EncryptionIntegrityChecksFailedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException]
    }
    
    @scala.inline
    def EncryptionKeyAccessDeniedException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyAccessDeniedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException]
    }
    
    @scala.inline
    def EncryptionKeyDisabledException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyDisabledException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException]
    }
    
    @scala.inline
    def EncryptionKeyNotFoundException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException]
    }
    
    @scala.inline
    def EncryptionKeyUnavailableException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException]
    }
    
    @scala.inline
    def InvalidPullRequestIdException(): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    @scala.inline
    def InvalidPullRequestStatusException(): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusExceptionMod.InvalidPullRequestStatusException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestStatusException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusExceptionMod.InvalidPullRequestStatusException]
    }
    
    @scala.inline
    def InvalidPullRequestStatusUpdateException(): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusUpdateExceptionMod.InvalidPullRequestStatusUpdateException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestStatusUpdateException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusUpdateExceptionMod.InvalidPullRequestStatusUpdateException]
    }
    
    @scala.inline
    def PullRequestDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "PullRequestDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException]
    }
    
    @scala.inline
    def PullRequestIdRequiredException(): typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "PullRequestIdRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException]
    }
    
    @scala.inline
    def PullRequestStatusRequiredException(): typings.awsSdkClientCodecommitNode.typesPullRequestStatusRequiredExceptionMod.PullRequestStatusRequiredException = {
      val __obj = js.Dynamic.literal(name = "PullRequestStatusRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestStatusRequiredExceptionMod.PullRequestStatusRequiredException]
    }
  }
}
