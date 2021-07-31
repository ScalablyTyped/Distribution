package typings.awsSdkMiddlewareSerde

import typings.awsSdkTypes.middlewareMod.DeserializeMiddleware
import typings.awsSdkTypes.serdeMod.ResponseDeserializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deserializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/deserializerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils](options: RuntimeUtils, deserializer: ResponseDeserializer[js.Any, js.Any, RuntimeUtils]): DeserializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializerMiddleware")(options.asInstanceOf[js.Any], deserializer.asInstanceOf[js.Any])).asInstanceOf[DeserializeMiddleware[Input, Output]]
}
