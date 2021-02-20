package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPullRequestExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
    - typings.awsSdkClientCodecommitNode.typesClientRequestTokenRequiredExceptionMod.ClientRequestTokenRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidClientRequestTokenExceptionMod.InvalidClientRequestTokenException
    - typings.awsSdkClientCodecommitNode.typesIdempotencyParameterMismatchExceptionMod.IdempotencyParameterMismatchException
    - typings.awsSdkClientCodecommitNode.typesReferenceNameRequiredExceptionMod.ReferenceNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidReferenceNameExceptionMod.InvalidReferenceNameException
    - typings.awsSdkClientCodecommitNode.typesReferenceDoesNotExistExceptionMod.ReferenceDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesReferenceTypeNotSupportedExceptionMod.ReferenceTypeNotSupportedException
    - typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException
    - typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException
    - typings.awsSdkClientCodecommitNode.typesTargetsRequiredExceptionMod.TargetsRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidTargetsExceptionMod.InvalidTargetsException
    - typings.awsSdkClientCodecommitNode.typesTargetRequiredExceptionMod.TargetRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidTargetExceptionMod.InvalidTargetException
    - typings.awsSdkClientCodecommitNode.typesMultipleRepositoriesInPullRequestExceptionMod.MultipleRepositoriesInPullRequestException
    - typings.awsSdkClientCodecommitNode.typesMaximumOpenPullRequestsExceededExceptionMod.MaximumOpenPullRequestsExceededException
    - typings.awsSdkClientCodecommitNode.typesSourceAndDestinationAreSameExceptionMod.SourceAndDestinationAreSameException
  */
  trait CreatePullRequestExceptionsUnion extends StObject
  object CreatePullRequestExceptionsUnion {
    
    @scala.inline
    def ClientRequestTokenRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ClientRequestTokenRequiredException
    ): typings.awsSdkClientCodecommitNode.typesClientRequestTokenRequiredExceptionMod.ClientRequestTokenRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesClientRequestTokenRequiredExceptionMod.ClientRequestTokenRequiredException]
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
    def IdempotencyParameterMismatchException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException
    ): typings.awsSdkClientCodecommitNode.typesIdempotencyParameterMismatchExceptionMod.IdempotencyParameterMismatchException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesIdempotencyParameterMismatchExceptionMod.IdempotencyParameterMismatchException]
    }
    
    @scala.inline
    def InvalidClientRequestTokenException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidClientRequestTokenException
    ): typings.awsSdkClientCodecommitNode.typesInvalidClientRequestTokenExceptionMod.InvalidClientRequestTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidClientRequestTokenExceptionMod.InvalidClientRequestTokenException]
    }
    
    @scala.inline
    def InvalidDescriptionException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
    ): typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException]
    }
    
    @scala.inline
    def InvalidReferenceNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidReferenceNameException
    ): typings.awsSdkClientCodecommitNode.typesInvalidReferenceNameExceptionMod.InvalidReferenceNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidReferenceNameExceptionMod.InvalidReferenceNameException]
    }
    
    @scala.inline
    def InvalidRepositoryNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
    ): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    @scala.inline
    def InvalidTargetException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetException): typings.awsSdkClientCodecommitNode.typesInvalidTargetExceptionMod.InvalidTargetException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidTargetExceptionMod.InvalidTargetException]
    }
    
    @scala.inline
    def InvalidTargetsException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetsException): typings.awsSdkClientCodecommitNode.typesInvalidTargetsExceptionMod.InvalidTargetsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidTargetsExceptionMod.InvalidTargetsException]
    }
    
    @scala.inline
    def InvalidTitleException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTitleException): typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException]
    }
    
    @scala.inline
    def MaximumOpenPullRequestsExceededException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
    ): typings.awsSdkClientCodecommitNode.typesMaximumOpenPullRequestsExceededExceptionMod.MaximumOpenPullRequestsExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesMaximumOpenPullRequestsExceededExceptionMod.MaximumOpenPullRequestsExceededException]
    }
    
    @scala.inline
    def MultipleRepositoriesInPullRequestException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException
    ): typings.awsSdkClientCodecommitNode.typesMultipleRepositoriesInPullRequestExceptionMod.MultipleRepositoriesInPullRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesMultipleRepositoriesInPullRequestExceptionMod.MultipleRepositoriesInPullRequestException]
    }
    
    @scala.inline
    def ReferenceDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesReferenceDoesNotExistExceptionMod.ReferenceDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesReferenceDoesNotExistExceptionMod.ReferenceDoesNotExistException]
    }
    
    @scala.inline
    def ReferenceNameRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException
    ): typings.awsSdkClientCodecommitNode.typesReferenceNameRequiredExceptionMod.ReferenceNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesReferenceNameRequiredExceptionMod.ReferenceNameRequiredException]
    }
    
    @scala.inline
    def ReferenceTypeNotSupportedException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException
    ): typings.awsSdkClientCodecommitNode.typesReferenceTypeNotSupportedExceptionMod.ReferenceTypeNotSupportedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesReferenceTypeNotSupportedExceptionMod.ReferenceTypeNotSupportedException]
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
    def SourceAndDestinationAreSameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
    ): typings.awsSdkClientCodecommitNode.typesSourceAndDestinationAreSameExceptionMod.SourceAndDestinationAreSameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesSourceAndDestinationAreSameExceptionMod.SourceAndDestinationAreSameException]
    }
    
    @scala.inline
    def TargetRequiredException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetRequiredException): typings.awsSdkClientCodecommitNode.typesTargetRequiredExceptionMod.TargetRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesTargetRequiredExceptionMod.TargetRequiredException]
    }
    
    @scala.inline
    def TargetsRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetsRequiredException
    ): typings.awsSdkClientCodecommitNode.typesTargetsRequiredExceptionMod.TargetsRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesTargetsRequiredExceptionMod.TargetsRequiredException]
    }
    
    @scala.inline
    def TitleRequiredException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException): typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException]
    }
  }
}
