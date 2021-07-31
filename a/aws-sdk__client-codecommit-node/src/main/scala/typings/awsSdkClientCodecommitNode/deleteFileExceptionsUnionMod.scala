package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteFileExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException
    - typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException
    - typings.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException
    - typings.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod.FileDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException
    - typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException
    - typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException
    - typings.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException
    - typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
  */
  trait DeleteFileExceptionsUnion extends StObject
  object DeleteFileExceptionsUnion {
    
    @scala.inline
    def BranchDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "BranchDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException]
    }
    
    @scala.inline
    def BranchNameIsTagNameException(): typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException = {
      val __obj = js.Dynamic.literal(name = "BranchNameIsTagNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException]
    }
    
    @scala.inline
    def BranchNameRequiredException(): typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "BranchNameRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException]
    }
    
    @scala.inline
    def CommitMessageLengthExceededException(): typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException = {
      val __obj = js.Dynamic.literal(name = "CommitMessageLengthExceededException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException]
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
    def FileDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod.FileDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "FileDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod.FileDoesNotExistException]
    }
    
    @scala.inline
    def InvalidBranchNameException(): typings.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidBranchNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException]
    }
    
    @scala.inline
    def InvalidEmailException(): typings.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException = {
      val __obj = js.Dynamic.literal(name = "InvalidEmailException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException]
    }
    
    @scala.inline
    def InvalidParentCommitIdException(): typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidParentCommitIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException]
    }
    
    @scala.inline
    def InvalidPathException(): typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException = {
      val __obj = js.Dynamic.literal(name = "InvalidPathException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException]
    }
    
    @scala.inline
    def InvalidRepositoryNameException(): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    @scala.inline
    def NameLengthExceededException(): typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException = {
      val __obj = js.Dynamic.literal(name = "NameLengthExceededException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException]
    }
    
    @scala.inline
    def ParentCommitDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "ParentCommitDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException]
    }
    
    @scala.inline
    def ParentCommitIdOutdatedException(): typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException = {
      val __obj = js.Dynamic.literal(name = "ParentCommitIdOutdatedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException]
    }
    
    @scala.inline
    def ParentCommitIdRequiredException(): typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "ParentCommitIdRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException]
    }
    
    @scala.inline
    def PathRequiredException(): typings.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException = {
      val __obj = js.Dynamic.literal(name = "PathRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException]
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
  }
}
