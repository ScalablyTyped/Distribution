package typings.atAwsDashSdkModeledDashEndpointDashMiddleware

import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildMiddleware
import typings.atAwsDashSdkTypes.buildUtilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/modeled-endpoint-middleware", JSImport.Namespace)
@js.native
object atAwsDashSdkModeledDashEndpointDashMiddlewareMod extends js.Object {
  def modeledEndpointMiddleware[InputType /* <: js.Object */](urlParser: UrlParser, inputKey: String): BuildMiddleware[InputType, _, _] = js.native
}

