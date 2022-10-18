package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateKeyExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
    - typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKmsNode.typesTagExceptionMod.TagException
  */
  trait CreateKeyExceptionsUnion extends StObject
  object CreateKeyExceptionsUnion {
    
    inline def DependencyTimeoutException(): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def InvalidArnException(): typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    inline def KMSInternalException(): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def MalformedPolicyDocumentException(): typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = "MalformedPolicyDocumentException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException]
    }
    
    inline def TagException(): typings.awsSdkClientKmsNode.typesTagExceptionMod.TagException = {
      val __obj = js.Dynamic.literal(name = "TagException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesTagExceptionMod.TagException]
    }
    
    inline def UnsupportedOperationException(): typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperationException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException]
    }
  }
}
