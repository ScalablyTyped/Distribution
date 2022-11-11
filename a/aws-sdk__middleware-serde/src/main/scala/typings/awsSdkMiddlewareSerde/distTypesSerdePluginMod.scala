package typings.awsSdkMiddlewareSerde

import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesMiddlewareMod.DeserializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.SerializeHandlerOptions
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesSerdeMod.EndpointBearer
import typings.awsSdkTypes.distTypesSerdeMod.RequestSerializer
import typings.awsSdkTypes.distTypesSerdeMod.ResponseDeserializer
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSerdePluginMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serdePlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serdePlugin", "deserializerMiddlewareOption")
  @js.native
  val deserializerMiddlewareOption: DeserializeHandlerOptions = js.native
  
  inline def getSerdePlugin[InputType /* <: js.Object */, SerDeContext, OutputType /* <: MetadataBearer */](
    config: V1OrV2Endpoint,
    serializer: RequestSerializer[Any, SerDeContext & EndpointBearer],
    deserializer: ResponseDeserializer[OutputType, Any, SerDeContext]
  ): Pluggable[InputType, OutputType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSerdePlugin")(config.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], deserializer.asInstanceOf[js.Any])).asInstanceOf[Pluggable[InputType, OutputType]]
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serdePlugin", "serializerMiddlewareOption")
  @js.native
  val serializerMiddlewareOption: SerializeHandlerOptions = js.native
  
  trait V1OrV2Endpoint extends StObject {
    
    var endpoint: js.UndefOr[Provider[Endpoint]] = js.undefined
    
    var urlParser: js.UndefOr[UrlParser] = js.undefined
  }
  object V1OrV2Endpoint {
    
    inline def apply(): V1OrV2Endpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1OrV2Endpoint]
    }
    
    extension [Self <: V1OrV2Endpoint](x: Self) {
      
      inline def setEndpoint(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
    }
  }
}
