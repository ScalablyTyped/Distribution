package typings.awsSdkMiddlewareSerializer

import typings.awsSdkTypes.marshallerMod.RequestSerializer
import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-serializer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream]]): SerializeMiddleware[Input, Output, Stream] = js.native
}

