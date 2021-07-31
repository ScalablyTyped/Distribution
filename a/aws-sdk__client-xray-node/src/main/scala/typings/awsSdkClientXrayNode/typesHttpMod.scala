package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHttpMod {
  
  trait Http extends StObject {
    
    /**
      * <p>The IP address of the requestor.</p>
      */
    var ClientIp: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The request method.</p>
      */
    var HttpMethod: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The response status.</p>
      */
    var HttpStatus: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The request URL.</p>
      */
    var HttpURL: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The request's user agent string.</p>
      */
    var UserAgent: js.UndefOr[String] = js.undefined
  }
  object Http {
    
    @scala.inline
    def apply(): Http = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Http]
    }
    
    @scala.inline
    implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientIp(value: String): Self = StObject.set(x, "ClientIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIpUndefined: Self = StObject.set(x, "ClientIp", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
      
      @scala.inline
      def setHttpStatus(value: Double): Self = StObject.set(x, "HttpStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpStatusUndefined: Self = StObject.set(x, "HttpStatus", js.undefined)
      
      @scala.inline
      def setHttpURL(value: String): Self = StObject.set(x, "HttpURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpURLUndefined: Self = StObject.set(x, "HttpURL", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "UserAgent", js.undefined)
    }
  }
  
  type UnmarshalledHttp = Http
}
