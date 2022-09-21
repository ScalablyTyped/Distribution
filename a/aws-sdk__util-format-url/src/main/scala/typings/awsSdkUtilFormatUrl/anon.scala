package typings.awsSdkUtilFormatUrl

import typings.awsSdkTypes.httpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@aws-sdk/types.@aws-sdk/types.HttpRequest, 'headers' | 'method'> */
  trait OmitHttpRequestheadersmet extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var hostname: String
    
    var path: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object OmitHttpRequestheadersmet {
    
    inline def apply(hostname: String, path: String, protocol: String): OmitHttpRequestheadersmet = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitHttpRequestheadersmet]
    }
    
    extension [Self <: OmitHttpRequestheadersmet](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
