package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listRetirableGrantsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
    - typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  */
  trait ListRetirableGrantsExceptionsUnion extends StObject
  object ListRetirableGrantsExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(): typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidArnException(): typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    @scala.inline
    def InvalidMarkerException(): typings.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = "InvalidMarkerException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException]
    }
    
    @scala.inline
    def KMSInternalException(): typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def NotFoundException(): typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
