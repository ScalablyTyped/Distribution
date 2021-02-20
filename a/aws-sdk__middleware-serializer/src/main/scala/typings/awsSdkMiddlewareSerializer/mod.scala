package typings.awsSdkMiddlewareSerializer

import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import typings.awsSdkTypes.serdeMod.RequestSerializer
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-serializer", "serializerMiddleware")
  @js.native
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream, _]]): SerializeMiddleware[Input, Output] = js.native
}
