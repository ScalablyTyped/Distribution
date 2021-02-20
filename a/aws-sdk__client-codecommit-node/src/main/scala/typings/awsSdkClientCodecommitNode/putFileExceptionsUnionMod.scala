package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putFileExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException
    - typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException
    - typings.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod.FileContentRequiredException
    - typings.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod.FileContentSizeLimitExceededException
    - typings.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException
    - typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException
    - typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException
    - typings.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod.InvalidFileModeException
    - typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException
    - typings.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException
    - typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException
    - typings.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod.InvalidDeletionParameterException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
    - typings.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod.SameFileContentException
    - typings.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod.FileNameConflictsWithDirectoryNameException
    - typings.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod.DirectoryNameConflictsWithFileNameException
  */
  trait PutFileExceptionsUnion extends StObject
  object PutFileExceptionsUnion {
    
    @scala.inline
    def BranchDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException]
    }
    
    @scala.inline
    def BranchNameIsTagNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
    ): typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException]
    }
    
    @scala.inline
    def BranchNameRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
    ): typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException]
    }
    
    @scala.inline
    def CommitMessageLengthExceededException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
    ): typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException]
    }
    
    @scala.inline
    def DirectoryNameConflictsWithFileNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
    ): typings.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod.DirectoryNameConflictsWithFileNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod.DirectoryNameConflictsWithFileNameException]
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
    def FileContentRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException
    ): typings.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod.FileContentRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod.FileContentRequiredException]
    }
    
    @scala.inline
    def FileContentSizeLimitExceededException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
    ): typings.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod.FileContentSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod.FileContentSizeLimitExceededException]
    }
    
    @scala.inline
    def FileNameConflictsWithDirectoryNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
    ): typings.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod.FileNameConflictsWithDirectoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod.FileNameConflictsWithDirectoryNameException]
    }
    
    @scala.inline
    def InvalidBranchNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
    ): typings.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException]
    }
    
    @scala.inline
    def InvalidDeletionParameterException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException
    ): typings.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod.InvalidDeletionParameterException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod.InvalidDeletionParameterException]
    }
    
    @scala.inline
    def InvalidEmailException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidEmailException): typings.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException]
    }
    
    @scala.inline
    def InvalidFileModeException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException
    ): typings.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod.InvalidFileModeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod.InvalidFileModeException]
    }
    
    @scala.inline
    def InvalidParentCommitIdException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidParentCommitIdException
    ): typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException]
    }
    
    @scala.inline
    def InvalidPathException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPathException): typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException]
    }
    
    @scala.inline
    def InvalidRepositoryNameException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
    ): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    @scala.inline
    def NameLengthExceededException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NameLengthExceededException
    ): typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException]
    }
    
    @scala.inline
    def ParentCommitDoesNotExistException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitDoesNotExistException
    ): typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException]
    }
    
    @scala.inline
    def ParentCommitIdOutdatedException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
    ): typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException]
    }
    
    @scala.inline
    def ParentCommitIdRequiredException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdRequiredException
    ): typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException]
    }
    
    @scala.inline
    def PathRequiredException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PathRequiredException): typings.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException]
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
    def SameFileContentException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
    ): typings.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod.SameFileContentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod.SameFileContentException]
    }
  }
}
