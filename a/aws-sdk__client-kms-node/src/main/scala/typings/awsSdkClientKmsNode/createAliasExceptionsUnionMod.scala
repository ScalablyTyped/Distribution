package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAliasExceptionsUnionMod {
  
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
    
    @scala.inline
    def AlreadyExistsException(): typings.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "AlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException]
    }
    
    @scala.inline
    def DependencyTimeoutException(): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidAliasNameException(): typings.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidAliasNameException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException]
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
    def LimitExceededException(): typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def NotFoundException(): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
