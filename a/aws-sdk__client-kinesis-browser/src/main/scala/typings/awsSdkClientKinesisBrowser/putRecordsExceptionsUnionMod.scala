package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putRecordsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
    - typings.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
    - typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
    - typings.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
    - typings.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
    - typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
    - typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
    - typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
  */
  trait PutRecordsExceptionsUnion extends StObject
  object PutRecordsExceptionsUnion {
    
    @scala.inline
    def InvalidArgumentException(): typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException = {
      val __obj = js.Dynamic.literal(name = "InvalidArgumentException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException]
    }
    
    @scala.inline
    def KMSAccessDeniedException(): typings.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "KMSAccessDeniedException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException]
    }
    
    @scala.inline
    def KMSDisabledException(): typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException = {
      val __obj = js.Dynamic.literal(name = "KMSDisabledException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException]
    }
    
    @scala.inline
    def KMSInvalidStateException(): typings.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    @scala.inline
    def KMSNotFoundException(): typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException = {
      val __obj = js.Dynamic.literal(name = "KMSNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException]
    }
    
    @scala.inline
    def KMSOptInRequired(): typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired = {
      val __obj = js.Dynamic.literal(name = "KMSOptInRequired")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired]
    }
    
    @scala.inline
    def KMSThrottlingException(): typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException = {
      val __obj = js.Dynamic.literal(name = "KMSThrottlingException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException]
    }
    
    @scala.inline
    def ProvisionedThroughputExceededException(): typings.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = "ProvisionedThroughputExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException]
    }
    
    @scala.inline
    def ResourceNotFoundException(): typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
