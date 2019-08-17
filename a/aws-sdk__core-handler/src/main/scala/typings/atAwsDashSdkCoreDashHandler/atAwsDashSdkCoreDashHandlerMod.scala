package typings.atAwsDashSdkCoreDashHandler

import typings.atAwsDashSdkTypes.buildHttpMod.HttpHandler
import typings.atAwsDashSdkTypes.buildHttpMod.HttpOptions
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Terminalware
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/core-handler", JSImport.Namespace)
@js.native
object atAwsDashSdkCoreDashHandlerMod extends js.Object {
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](httpHandler: HttpHandler[Stream, HttpOptions], responseParser: ResponseParser[Stream]): Terminalware[OutputConstraint, Stream] = js.native
}

