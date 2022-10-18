package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRevokeGrantExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
    - typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait RevokeGrantExceptionsUnion extends StObject
  object RevokeGrantExceptionsUnion {
    
    inline def DependencyTimeoutException(): typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def InvalidArnException(): typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    inline def InvalidGrantIdException(): typings.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidGrantIdException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException]
    }
    
    inline def KMSInternalException(): typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def NotFoundException(): typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
