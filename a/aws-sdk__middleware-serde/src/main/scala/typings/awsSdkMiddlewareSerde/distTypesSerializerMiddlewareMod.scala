package typings.awsSdkMiddlewareSerde

import typings.awsSdkMiddlewareSerde.distTypesSerdePluginMod.V1OrV2Endpoint
import typings.awsSdkTypes.distTypesMiddlewareMod.SerializeMiddleware
import typings.awsSdkTypes.distTypesSerdeMod.EndpointBearer
import typings.awsSdkTypes.distTypesSerdeMod.RequestSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSerializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serializerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils /* <: EndpointBearer */](options: V1OrV2Endpoint, serializer: RequestSerializer[Any, RuntimeUtils]): SerializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializerMiddleware")(options.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[SerializeMiddleware[Input, Output]]
}
