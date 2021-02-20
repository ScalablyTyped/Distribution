package typings.awsSdkMiddlewareSerde

import typings.awsSdkTypes.middlewareMod.DeserializeMiddleware
import typings.awsSdkTypes.serdeMod.ResponseDeserializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deserializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/deserializerMiddleware", "deserializerMiddleware")
  @js.native
  def deserializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils](options: RuntimeUtils, deserializer: ResponseDeserializer[_, _, RuntimeUtils]): DeserializeMiddleware[Input, Output] = js.native
}
