package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecryptExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
    - typings.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
    - typings.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException
    - typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
    - typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait DecryptExceptionsUnion extends StObject
  object DecryptExceptionsUnion {
    
    inline def DependencyTimeoutException(): typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def DisabledException(): typings.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException = {
      val __obj = js.Dynamic.literal(name = "DisabledException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException]
    }
    
    inline def InvalidCiphertextException(): typings.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException = {
      val __obj = js.Dynamic.literal(name = "InvalidCiphertextException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException]
    }
    
    inline def InvalidGrantTokenException(): typings.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidGrantTokenException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException]
    }
    
    inline def KMSInternalException(): typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def KeyUnavailableException(): typings.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "KeyUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException]
    }
    
    inline def NotFoundException(): typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
