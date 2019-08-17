package typings.atAwsDashSdkMiddlewareDashSerializer

import typings.atAwsDashSdkTypes.buildMarshallerMod.RequestSerializer
import typings.atAwsDashSdkTypes.buildMiddlewareMod.SerializeMiddleware
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-serializer", JSImport.Namespace)
@js.native
object atAwsDashSdkMiddlewareDashSerializerMod extends js.Object {
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream]]): SerializeMiddleware[Input, Output, Stream] = js.native
}

