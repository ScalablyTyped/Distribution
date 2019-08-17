package typings.atAwsDashSdkSigningDashMiddleware

import typings.atAwsDashSdkTypes.buildMiddlewareMod.FinalizeMiddleware
import typings.atAwsDashSdkTypes.buildSignatureMod.RequestSigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signing-middleware", JSImport.Namespace)
@js.native
object atAwsDashSdkSigningDashMiddlewareMod extends js.Object {
  def signingMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](signer: RequestSigner): FinalizeMiddleware[Input, Output, Stream] = js.native
}

