package typings.awsSdkMiddlewareSerde

import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import typings.awsSdkTypes.serdeMod.EndpointBearer
import typings.awsSdkTypes.serdeMod.RequestSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/serializerMiddleware", "serializerMiddleware")
  @js.native
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils /* <: EndpointBearer */](options: RuntimeUtils, serializer: RequestSerializer[_, RuntimeUtils]): SerializeMiddleware[Input, Output] = js.native
}
