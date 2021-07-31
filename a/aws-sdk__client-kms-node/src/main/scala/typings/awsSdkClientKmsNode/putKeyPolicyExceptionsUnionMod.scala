package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putKeyPolicyExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
    - typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait PutKeyPolicyExceptionsUnion extends StObject
  object PutKeyPolicyExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidArnException(): typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
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
    def MalformedPolicyDocumentException(): typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = "MalformedPolicyDocumentException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException]
    }
    
    @scala.inline
    def NotFoundException(): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
    
    @scala.inline
    def UnsupportedOperationException(): typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperationException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException]
    }
  }
}
