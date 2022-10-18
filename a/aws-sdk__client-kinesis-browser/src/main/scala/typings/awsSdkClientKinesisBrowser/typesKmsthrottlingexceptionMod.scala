package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
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
    
    inline def apply(): KMSThrottlingException = {
      val __obj = js.Dynamic.literal(name = "KMSThrottlingException")
      __obj.asInstanceOf[KMSThrottlingException]
    }
    
    extension [Self <: KMSThrottlingException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSThrottlingException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSThrottlingExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSThrottlingExceptionDetails {
    
    inline def apply(): KMSThrottlingExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSThrottlingExceptionDetails]
    }
    
    extension [Self <: KMSThrottlingExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
