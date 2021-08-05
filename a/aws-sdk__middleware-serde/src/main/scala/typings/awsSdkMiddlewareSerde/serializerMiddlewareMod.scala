package typings.awsSdkMiddlewareSerde

import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import typings.awsSdkTypes.serdeMod.EndpointBearer
import typings.awsSdkTypes.serdeMod.RequestSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/serializerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils /* <: EndpointBearer */](options: RuntimeUtils, serializer: RequestSerializer[js.Any, RuntimeUtils]): SerializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializerMiddleware")(options.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[SerializeMiddleware[Input, Output]]
}
