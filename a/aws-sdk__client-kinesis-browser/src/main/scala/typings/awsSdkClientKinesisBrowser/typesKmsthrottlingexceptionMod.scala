package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsthrottlingexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSThrottlingExceptionDetails> * / any */ trait KMSThrottlingException
    extends StObject
       with GetRecordsExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion
       with StartStreamEncryptionExceptionsUnion {
    
    var name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSThrottlingException
  }
  object KMSThrottlingException {
    
    @scala.inline
    def apply(): KMSThrottlingException = {
      val __obj = js.Dynamic.literal(name = "KMSThrottlingException")
      __obj.asInstanceOf[KMSThrottlingException]
    }
    
    @scala.inline
    implicit class KMSThrottlingExceptionMutableBuilder[Self <: KMSThrottlingException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSThrottlingException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSThrottlingExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSThrottlingExceptionDetails {
    
    @scala.inline
    def apply(): KMSThrottlingExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSThrottlingExceptionDetails]
    }
    
    @scala.inline
    implicit class KMSThrottlingExceptionDetailsMutableBuilder[Self <: KMSThrottlingExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
