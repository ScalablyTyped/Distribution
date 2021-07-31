package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestTimeoutExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RequestTimeoutExceptionDetails> * / any */ trait RequestTimeoutException
    extends StObject
       with UploadArchiveExceptionsUnion
       with UploadMultipartPartExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException
  }
  object RequestTimeoutException {
    
    @scala.inline
    def apply(): RequestTimeoutException = {
      val __obj = js.Dynamic.literal(name = "RequestTimeoutException")
      __obj.asInstanceOf[RequestTimeoutException]
    }
    
    @scala.inline
    implicit class RequestTimeoutExceptionMutableBuilder[Self <: RequestTimeoutException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestTimeoutExceptionDetails extends StObject {
    
    /**
      * <p>408 Request Timeout</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RequestTimeoutExceptionDetails {
    
    @scala.inline
    def apply(): RequestTimeoutExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestTimeoutExceptionDetails]
    }
    
    @scala.inline
    implicit class RequestTimeoutExceptionDetailsMutableBuilder[Self <: RequestTimeoutExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
