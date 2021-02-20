package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reEncryptExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
    - typings.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
    - typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException
    - typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
    - typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait ReEncryptExceptionsUnion extends StObject
  object ReEncryptExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def DisabledException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException): typings.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException]
    }
    
    @scala.inline
    def InvalidCiphertextException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidCiphertextException): typings.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException]
    }
    
    @scala.inline
    def InvalidGrantTokenException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantTokenException): typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException]
    }
    
    @scala.inline
    def InvalidKeyUsageException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidKeyUsageException): typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException]
    }
    
    @scala.inline
    def KMSInternalException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInternalException): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def KMSInvalidStateException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException): typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    @scala.inline
    def KeyUnavailableException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KeyUnavailableException): typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException]
    }
    
    @scala.inline
    def NotFoundException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.NotFoundException): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
