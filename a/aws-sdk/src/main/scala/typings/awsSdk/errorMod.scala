package typings.awsSdk

import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  /* Inlined std.Error & {  code :string,   message :string,   retryable :boolean | undefined,   statusCode :number | undefined,   time :std.Date,   hostname :string | undefined,   region :string | undefined,   retryDelay :number | undefined,   requestId :string | undefined,   extendedRequestId :string | undefined,   cfId :string | undefined,   originalError :std.Error | undefined} */
  @js.native
  trait AWSError extends StObject {
    
    /**
      * CloudFront request ID associated with the response.
      */
    var cfId: js.UndefOr[String] = js.native
    
    /**
      * A unique short code representing the error that was emitted.
      */
    var code: String = js.native
    
    /**
      * Second request ID associated with the response from S3.
      */
    var extendedRequestId: js.UndefOr[String] = js.native
    
    /**
      * Set when a networking error occurs to easily identify the endpoint of the request.
      */
    var hostname: js.UndefOr[String] = js.native
    
    /**
      * A longer human readable error message.
      */
    var message: String = js.native
    
    var name: String = js.native
    
    /**
      * The original error which caused this Error
      */
    var originalError: js.UndefOr[Error] = js.native
    
    /**
      * Set when a networking error occurs to easily identify the region of the request.
      */
    var region: js.UndefOr[String] = js.native
    
    /**
      * The unique request ID associated with the response.
      */
    var requestId: js.UndefOr[String] = js.native
    
    /**
      * Amount of time (in seconds) that the request waited before being resent.
      */
    var retryDelay: js.UndefOr[Double] = js.native
    
    /**
      * Whether the error message is retryable.
      */
    var retryable: js.UndefOr[Boolean] = js.native
    
    var stack: js.UndefOr[String] = js.native
    
    /**
      * In the case of a request that reached the service, this value contains the response status code.
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * The date time object when the error occurred.
      */
    var time: Date = js.native
  }
  object AWSError {
    
    @scala.inline
    def apply(code: String, message: String, name: String, time: Date): AWSError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[AWSError]
    }
    
    @scala.inline
    implicit class AWSErrorMutableBuilder[Self <: AWSError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCfId(value: String): Self = StObject.set(x, "cfId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCfIdUndefined: Self = StObject.set(x, "cfId", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedRequestId(value: String): Self = StObject.set(x, "extendedRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedRequestIdUndefined: Self = StObject.set(x, "extendedRequestId", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalError(value: Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalErrorUndefined: Self = StObject.set(x, "originalError", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryable(value: Boolean): Self = StObject.set(x, "retryable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryableUndefined: Self = StObject.set(x, "retryable", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
