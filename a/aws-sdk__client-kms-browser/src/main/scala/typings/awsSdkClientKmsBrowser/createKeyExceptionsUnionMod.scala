package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createKeyExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
    - typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
    - typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
  */
  trait CreateKeyExceptionsUnion extends StObject
  object CreateKeyExceptionsUnion {
    
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
    def KMSInternalException(): typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def LimitExceededException(): typings.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def MalformedPolicyDocumentException(): typings.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = "MalformedPolicyDocumentException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException]
    }
    
    @scala.inline
    def TagException(): typings.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException = {
      val __obj = js.Dynamic.literal(name = "TagException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException]
    }
    
    @scala.inline
    def UnsupportedOperationException(): typings.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperationException")
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException]
    }
  }
}
