package typings.awsSdkTypes

import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.transferMod.RequestHandler
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serdeMod {
  
  trait EndpointBearer extends StObject {
    
    def endpoint(): js.Promise[Endpoint]
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint]
  }
  object EndpointBearer {
    
    inline def apply(endpoint: () => js.Promise[Endpoint]): EndpointBearer = {
      val __obj = js.Dynamic.literal(endpoint = js.Any.fromFunction0(endpoint))
      __obj.asInstanceOf[EndpointBearer]
    }
    
    extension [Self <: EndpointBearer](x: Self) {
      
      inline def setEndpoint(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
    }
  }
  
  type RequestSerializer[Request, Context /* <: EndpointBearer */] = js.Function2[/* input */ js.Any, /* context */ Context, js.Promise[Request]]
  
  type ResponseDeserializer[OutputType, ResponseType, Context] = js.Function2[/* output */ ResponseType, /* context */ Context, js.Promise[OutputType]]
  
  trait SerdeContext
    extends StObject
       with EndpointBearer {
    
    def base64Decoder(input: String): Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    def base64Encoder(input: Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    var disableHostPrefix: Boolean
    
    var requestHandler: RequestHandler[js.Any, js.Any, js.Object]
    
    def streamCollector(stream: js.Any): js.Promise[Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    def utf8Decoder(input: String): Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    def utf8Encoder(input: Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object SerdeContext {
    
    inline def apply(
      base64Decoder: /* input */ String => Uint8Array,
      base64Encoder: /* input */ Uint8Array => String,
      disableHostPrefix: Boolean,
      endpoint: () => js.Promise[Endpoint],
      requestHandler: RequestHandler[js.Any, js.Any, js.Object],
      streamCollector: /* stream */ js.Any => js.Promise[Uint8Array],
      utf8Decoder: /* input */ String => Uint8Array,
      utf8Encoder: /* input */ Uint8Array => String
    ): SerdeContext = {
      val __obj = js.Dynamic.literal(base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], endpoint = js.Any.fromFunction0(endpoint), requestHandler = requestHandler.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[SerdeContext]
    }
    
    extension [Self <: SerdeContext](x: Self) {
      
      inline def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setRequestHandler(value: RequestHandler[js.Any, js.Any, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
  
  type StreamCollector = js.Function1[/* stream */ js.Any, js.Promise[Uint8Array]]
}
