package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateDataKeyExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
    - typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException
    - typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
    - typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait GenerateDataKeyExceptionsUnion extends StObject
  object GenerateDataKeyExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def DisabledException(): typings.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException = {
      val __obj = js.Dynamic.literal(name = "DisabledException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException]
    }
    
    @scala.inline
    def InvalidGrantTokenException(): typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidGrantTokenException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException]
    }
    
    @scala.inline
    def InvalidKeyUsageException(): typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException = {
      val __obj = js.Dynamic.literal(name = "InvalidKeyUsageException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException]
    }
    
    @scala.inline
    def KMSInternalException(): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def KMSInvalidStateException(): typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    @scala.inline
    def KeyUnavailableException(): typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "KeyUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException]
    }
    
    @scala.inline
    def NotFoundException(): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
