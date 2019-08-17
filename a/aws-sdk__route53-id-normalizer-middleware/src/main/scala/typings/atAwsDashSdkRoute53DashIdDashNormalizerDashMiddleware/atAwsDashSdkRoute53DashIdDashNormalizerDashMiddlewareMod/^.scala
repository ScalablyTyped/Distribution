package typings.atAwsDashSdkRoute53DashIdDashNormalizerDashMiddleware.atAwsDashSdkRoute53DashIdDashNormalizerDashMiddlewareMod

import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/route53-id-normalizer-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def changeBatchAliasTargetIdNormalizerMiddleware[Input /* <: ChangeBatchBearer */, Output /* <: js.Object */](next: Handler[Input, Output]): Handler[Input, Output] = js.native
  def idNormalizerMiddleware[Input /* <: IdentifierBearer */, Output /* <: js.Object */](next: Handler[Input, Output]): Handler[Input, Output] = js.native
}

