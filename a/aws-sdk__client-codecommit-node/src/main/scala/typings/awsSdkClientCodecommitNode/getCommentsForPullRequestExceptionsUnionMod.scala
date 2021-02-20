package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def CommitDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException]
    }
    
    @scala.inline
    def CommitIdRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdRequiredException
    ): typings.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException]
    }
    
    @scala.inline
    def EncryptionIntegrityChecksFailedException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionIntegrityChecksFailedException
    ): typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException]
    }
    
    @scala.inline
    def EncryptionKeyAccessDeniedException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyAccessDeniedException
    ): typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException]
    }
    
    @scala.inline
    def EncryptionKeyDisabledException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyDisabledException
    ): typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException]
    }
    
    @scala.inline
    def EncryptionKeyNotFoundException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyNotFoundException
    ): typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException]
    }
    
    @scala.inline
    def EncryptionKeyUnavailableException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyUnavailableException
    ): typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException]
    }
    
    @scala.inline
    def InvalidCommitIdException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitIdException
    ): typings.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException]
    }
    
    @scala.inline
    def InvalidContinuationTokenException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException
    ): typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException]
    }
    
    @scala.inline
    def InvalidMaxResultsException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMaxResultsException
    ): typings.awsSdkClientCodecommitNode.typesInvalidMaxResultsExceptionMod.InvalidMaxResultsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidMaxResultsExceptionMod.InvalidMaxResultsException]
    }
    
    @scala.inline
    def InvalidPullRequestIdException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
    ): typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    @scala.inline
    def InvalidRepositoryNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
    ): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    @scala.inline
    def PullRequestDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException]
    }
    
    @scala.inline
    def PullRequestIdRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestIdRequiredException
    ): typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException]
    }
    
    @scala.inline
    def RepositoryDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException]
    }
    
    @scala.inline
    def RepositoryNameRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameRequiredException
    ): typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
    
    @scala.inline
    def RepositoryNotAssociatedWithPullRequestException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException
    ): typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod.RepositoryNotAssociatedWithPullRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod.RepositoryNotAssociatedWithPullRequestException]
    }
  }
}
