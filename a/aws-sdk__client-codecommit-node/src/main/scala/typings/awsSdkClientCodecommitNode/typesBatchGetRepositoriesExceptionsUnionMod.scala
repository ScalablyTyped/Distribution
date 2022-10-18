package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetRepositoriesExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod.RepositoryNamesRequiredException
    - typings.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod.MaximumRepositoryNamesExceededException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typings.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typings.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
  */
  trait BatchGetRepositoriesExceptionsUnion extends StObject
  object BatchGetRepositoriesExceptionsUnion {
    
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
    
    inline def InvalidRepositoryNameException(): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    inline def MaximumRepositoryNamesExceededException(): typings.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod.MaximumRepositoryNamesExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumRepositoryNamesExceededException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod.MaximumRepositoryNamesExceededException]
    }
    
    inline def RepositoryNamesRequiredException(): typings.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod.RepositoryNamesRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNamesRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod.RepositoryNamesRequiredException]
    }
  }
}
