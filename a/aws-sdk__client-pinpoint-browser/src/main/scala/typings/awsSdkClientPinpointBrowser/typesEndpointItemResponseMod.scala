package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointItemResponseMod {
  
  trait EndpointItemResponse extends StObject {
    
    /**
      * A custom message associated with the registration of an endpoint when issuing a response.
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * The status code associated with the merging of an endpoint when issuing a response.
      */
    var StatusCode: js.UndefOr[Double] = js.undefined
  }
  object EndpointItemResponse {
    
    inline def apply(): EndpointItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointItemResponse]
    }
    
    extension [Self <: EndpointItemResponse](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    }
  }
  
  type UnmarshalledEndpointItemResponse = EndpointItemResponse
}
