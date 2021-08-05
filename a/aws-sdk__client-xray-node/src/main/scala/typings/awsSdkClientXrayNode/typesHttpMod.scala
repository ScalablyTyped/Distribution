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
    
    inline def apply(): Http = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Http]
    }
    
    extension [Self <: Http](x: Self) {
      
      inline def setClientIp(value: String): Self = StObject.set(x, "ClientIp", value.asInstanceOf[js.Any])
      
      inline def setClientIpUndefined: Self = StObject.set(x, "ClientIp", js.undefined)
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
      
      inline def setHttpStatus(value: Double): Self = StObject.set(x, "HttpStatus", value.asInstanceOf[js.Any])
      
      inline def setHttpStatusUndefined: Self = StObject.set(x, "HttpStatus", js.undefined)
      
      inline def setHttpURL(value: String): Self = StObject.set(x, "HttpURL", value.asInstanceOf[js.Any])
      
      inline def setHttpURLUndefined: Self = StObject.set(x, "HttpURL", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "UserAgent", js.undefined)
    }
  }
  
  type UnmarshalledHttp = Http
}
