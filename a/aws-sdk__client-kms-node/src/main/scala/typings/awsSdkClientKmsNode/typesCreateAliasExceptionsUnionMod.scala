package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateAliasExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException
    - typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait CreateAliasExceptionsUnion extends StObject
  object CreateAliasExceptionsUnion {
    
    inline def AlreadyExistsException(): typings.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "AlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException]
    }
    
    inline def DependencyTimeoutException(): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def InvalidAliasNameException(): typings.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidAliasNameException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException]
    }
    
    inline def KMSInternalException(): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def NotFoundException(): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
