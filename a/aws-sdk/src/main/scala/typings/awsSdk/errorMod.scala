package typings.awsSdk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  trait AWSError
    extends StObject
       with Error {
    
    /**
      * CloudFront request ID associated with the response.
      */
    var cfId: js.UndefOr[String] = js.undefined
    
    /**
      * A unique short code representing the error that was emitted.
      */
    var code: String
    
    /**
      * Second request ID associated with the response from S3.
      */
    var extendedRequestId: js.UndefOr[String] = js.undefined
    
    /**
      * Set when a networking error occurs to easily identify the endpoint of the request.
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * The original error which caused this Error
      */
    var originalError: js.UndefOr[js.Error] = js.undefined
    
    /**
      * Set when a networking error occurs to easily identify the region of the request.
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * The unique request ID associated with the response.
      */
    var requestId: js.UndefOr[String] = js.undefined
    
    /**
      * Amount of time (in seconds) that the request waited before being resent.
      */
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the error message is retryable.
      */
    var retryable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In the case of a request that reached the service, this value contains the response status code.
      */
    var statusCode: js.UndefOr[Double] = js.undefined
    
    /**
      * The date time object when the error occurred.
      */
    var time: js.Date
  }
  object AWSError {
    
    inline def apply(code: String, message: String, name: String, time: js.Date): AWSError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[AWSError]
    }
    
    extension [Self <: AWSError](x: Self) {
      
      inline def setCfId(value: String): Self = StObject.set(x, "cfId", value.asInstanceOf[js.Any])
      
      inline def setCfIdUndefined: Self = StObject.set(x, "cfId", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setExtendedRequestId(value: String): Self = StObject.set(x, "extendedRequestId", value.asInstanceOf[js.Any])
      
      inline def setExtendedRequestIdUndefined: Self = StObject.set(x, "extendedRequestId", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setOriginalError(value: js.Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
      
      inline def setOriginalErrorUndefined: Self = StObject.set(x, "originalError", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryable(value: Boolean): Self = StObject.set(x, "retryable", value.asInstanceOf[js.Any])
      
      inline def setRetryableUndefined: Self = StObject.set(x, "retryable", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
