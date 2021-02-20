package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createKeyExceptionsUnionMod {
  
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
    
    @scala.inline
    def DependencyTimeoutException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidArnException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidArnException): typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    @scala.inline
    def KMSInternalException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInternalException): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def LimitExceededException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.LimitExceededException): typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def MalformedPolicyDocumentException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException): typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException]
    }
    
    @scala.inline
    def TagException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.TagException): typings.awsSdkClientKmsNode.typesTagExceptionMod.TagException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesTagExceptionMod.TagException]
    }
    
    @scala.inline
    def UnsupportedOperationException(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException): typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException]
    }
  }
}
