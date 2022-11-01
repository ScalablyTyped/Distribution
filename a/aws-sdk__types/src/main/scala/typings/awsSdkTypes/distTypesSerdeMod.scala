package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSerdeMod {
  
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
  
  type RequestSerializer[Request, Context /* <: EndpointBearer */] = js.Function2[/* input */ Any, /* context */ Context, js.Promise[Request]]
  
  type ResponseDeserializer[OutputType, ResponseType, Context] = js.Function2[/* output */ ResponseType, /* context */ Context, js.Promise[OutputType]]
  
  type SdkStream[BaseStream] = BaseStream & SdkStreamMixin
  
  @js.native
  trait SdkStreamMixin extends StObject {
    
    def transformToByteArray(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def transformToString(): js.Promise[String] = js.native
    def transformToString(encoding: String): js.Promise[String] = js.native
    
    def transformToWebStream(): ReadableStream[Any] = js.native
  }
  
  type SdkStreamMixinInjector = js.Function1[/* stream */ Any, SdkStreamMixin]
  
  trait SdkStreamSerdeContext extends StObject {
    
    def sdkStreamMixin(stream: Any): SdkStreamMixin
    @JSName("sdkStreamMixin")
    var sdkStreamMixin_Original: SdkStreamMixinInjector
  }
  object SdkStreamSerdeContext {
    
    inline def apply(sdkStreamMixin: /* stream */ Any => SdkStreamMixin): SdkStreamSerdeContext = {
      val __obj = js.Dynamic.literal(sdkStreamMixin = js.Any.fromFunction1(sdkStreamMixin))
      __obj.asInstanceOf[SdkStreamSerdeContext]
    }
    
    extension [Self <: SdkStreamSerdeContext](x: Self) {
      
      inline def setSdkStreamMixin(value: /* stream */ Any => SdkStreamMixin): Self = StObject.set(x, "sdkStreamMixin", js.Any.fromFunction1(value))
    }
  }
  
  trait SerdeContext
    extends StObject
       with EndpointBearer {
    
    def base64Decoder(input: String): js.typedarray.Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    def base64Encoder(input: js.typedarray.Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    var disableHostPrefix: Boolean
    
    var requestHandler: RequestHandler[Any, Any, js.Object]
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object SerdeContext {
    
    inline def apply(
      base64Decoder: /* input */ String => js.typedarray.Uint8Array,
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      disableHostPrefix: Boolean,
      endpoint: () => js.Promise[Endpoint],
      requestHandler: RequestHandler[Any, Any, js.Object],
      streamCollector: /* stream */ Any => js.Promise[js.typedarray.Uint8Array],
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array,
      utf8Encoder: /* input */ js.typedarray.Uint8Array => String
    ): SerdeContext = {
      val __obj = js.Dynamic.literal(base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], endpoint = js.Any.fromFunction0(endpoint), requestHandler = requestHandler.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[SerdeContext]
    }
    
    extension [Self <: SerdeContext](x: Self) {
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setRequestHandler(value: RequestHandler[Any, Any, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
  
  type StreamCollector = js.Function1[/* stream */ Any, js.Promise[js.typedarray.Uint8Array]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof T ]: key extends StreamKey? @aws-sdk/types.@aws-sdk/types/dist-types/serde.SdkStream<T[StreamKey]> : T[key]}
    }}}
    */
  @js.native
  trait WithSdkStreamMixin[T, StreamKey /* <: /* keyof T */ String */] extends StObject
  
  /**
    * Declare ReadableStream in case dom.d.ts is not added to the tsconfig lib causing
    * ReadableStream interface is not defined. For developers with dom.d.ts added,
    * the ReadableStream interface will be merged correctly.
    *
    * This is also required for any clients with streaming interface where ReadableStream
    * type is also referred. The type is only declared here once since this @aws-sdk/types
    * is depended by all @aws-sdk packages.
    */
  object global {
    
    trait ReadableStream extends StObject
  }
}
