package typings.awsSdkMiddlewareSdkS3

import typings.awsSdkTypes.distTypesMiddlewareMod.DeserializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThrow200ExceptionsMod {
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/throw-200-exceptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getThrow200ExceptionsPlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThrow200ExceptionsPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def throw200ExceptionsMiddleware(config: PreviouslyResolved): DeserializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw200ExceptionsMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[DeserializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/throw-200-exceptions", "throw200ExceptionsMiddlewareOptions")
  @js.native
  val throw200ExceptionsMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  trait PreviouslyResolved extends StObject {
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object PreviouslyResolved {
    
    inline def apply(
      streamCollector: /* stream */ Any => js.Promise[js.typedarray.Uint8Array],
      utf8Encoder: /* input */ js.typedarray.Uint8Array => String
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(streamCollector = js.Any.fromFunction1(streamCollector), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
}
