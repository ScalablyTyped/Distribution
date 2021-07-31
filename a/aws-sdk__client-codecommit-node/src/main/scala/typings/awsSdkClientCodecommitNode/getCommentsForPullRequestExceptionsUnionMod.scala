package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCommentsForPullRequestExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typings.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException
    - typings.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesInvalidMaxResultsExceptionMod.InvalidMaxResultsException
    - typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException
    - typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod.RepositoryNotAssociatedWithPullRequestException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
  */
  trait GetCommentsForPullRequestExceptionsUnion extends StObject
  object GetCommentsForPullRequestExceptionsUnion {
    
    @scala.inline
    def CommitDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "CommitDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException]
    }
    
    @scala.inline
    def CommitIdRequiredException(): typings.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "CommitIdRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException]
    }
    
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
    def InvalidCommitIdException(): typings.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidCommitIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException]
    }
    
    @scala.inline
    def InvalidContinuationTokenException(): typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidContinuationTokenException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException]
    }
    
    @scala.inline
    def InvalidMaxResultsException(): typings.awsSdkClientCodecommitNode.typesInvalidMaxResultsExceptionMod.InvalidMaxResultsException = {
      val __obj = js.Dynamic.literal(name = "InvalidMaxResultsException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidMaxResultsExceptionMod.InvalidMaxResultsException]
    }
    
    @scala.inline
    def InvalidPullRequestIdException(): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    @scala.inline
    def InvalidRepositoryNameException(): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
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
    def RepositoryDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "RepositoryDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException]
    }
    
    @scala.inline
    def RepositoryNameRequiredException(): typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
    
    @scala.inline
    def RepositoryNotAssociatedWithPullRequestException(): typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod.RepositoryNotAssociatedWithPullRequestException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNotAssociatedWithPullRequestException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod.RepositoryNotAssociatedWithPullRequestException]
    }
  }
}
