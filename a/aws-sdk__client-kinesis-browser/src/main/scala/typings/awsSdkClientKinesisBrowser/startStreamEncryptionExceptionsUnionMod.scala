package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startStreamEncryptionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
    - typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
    - typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
    - typings.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
    - typings.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
    - typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
    - typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
    - typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
  */
  trait StartStreamEncryptionExceptionsUnion extends StObject
  object StartStreamEncryptionExceptionsUnion {
    
    inline def InvalidArgumentException(): typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException = {
      val __obj = js.Dynamic.literal(name = "InvalidArgumentException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException]
    }
    
    inline def KMSAccessDeniedException(): typings.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "KMSAccessDeniedException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException]
    }
    
    inline def KMSDisabledException(): typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException = {
      val __obj = js.Dynamic.literal(name = "KMSDisabledException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException]
    }
    
    inline def KMSInvalidStateException(): typings.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def KMSNotFoundException(): typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException = {
      val __obj = js.Dynamic.literal(name = "KMSNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException]
    }
    
    inline def KMSOptInRequired(): typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired = {
      val __obj = js.Dynamic.literal(name = "KMSOptInRequired")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired]
    }
    
    inline def KMSThrottlingException(): typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException = {
      val __obj = js.Dynamic.literal(name = "KMSThrottlingException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def ResourceInUseException(): typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = "ResourceInUseException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
