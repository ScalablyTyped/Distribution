package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBlobExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod.BlobIdRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidBlobIdExceptionMod.InvalidBlobIdException
    - typings.awsSdkClientCodecommitNode.typesBlobIdDoesNotExistExceptionMod.BlobIdDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
    - typings.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod.FileTooLargeException
  */
  trait GetBlobExceptionsUnion extends StObject
  object GetBlobExceptionsUnion {
    
    inline def BlobIdDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesBlobIdDoesNotExistExceptionMod.BlobIdDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "BlobIdDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBlobIdDoesNotExistExceptionMod.BlobIdDoesNotExistException]
    }
    
    inline def BlobIdRequiredException(): typings.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod.BlobIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "BlobIdRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod.BlobIdRequiredException]
    }
    
    inline def EncryptionIntegrityChecksFailedException(): typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException = {
      val __obj = js.Dynamic.literal(name = "EncryptionIntegrityChecksFailedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException]
    }
    
    inline def EncryptionKeyAccessDeniedException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyAccessDeniedException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException]
    }
    
    inline def EncryptionKeyDisabledException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyDisabledException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException]
    }
    
    inline def EncryptionKeyNotFoundException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException]
    }
    
    inline def EncryptionKeyUnavailableException(): typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException]
    }
    
    inline def FileTooLargeException(): typings.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod.FileTooLargeException = {
      val __obj = js.Dynamic.literal(name = "FileTooLargeException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod.FileTooLargeException]
    }
    
    inline def InvalidBlobIdException(): typings.awsSdkClientCodecommitNode.typesInvalidBlobIdExceptionMod.InvalidBlobIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidBlobIdException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidBlobIdExceptionMod.InvalidBlobIdException]
    }
    
    inline def InvalidRepositoryNameException(): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    inline def RepositoryDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "RepositoryDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException]
    }
    
    inline def RepositoryNameRequiredException(): typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
  }
}
