package typings.awsSdkCoreHandler

import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.HttpOptions
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/core-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](httpHandler: HttpHandler[Stream, HttpOptions], responseParser: ResponseParser[Stream]): Terminalware[OutputConstraint, Stream] = js.native
}

