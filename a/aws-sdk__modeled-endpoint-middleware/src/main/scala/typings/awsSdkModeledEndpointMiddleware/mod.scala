package typings.awsSdkModeledEndpointMiddleware

import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/modeled-endpoint-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def modeledEndpointMiddleware[InputType /* <: js.Object */](urlParser: UrlParser, inputKey: String): BuildMiddleware[InputType, _, _] = js.native
}

