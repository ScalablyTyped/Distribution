package typings.awsSdkSigningMiddleware

import typings.awsSdkTypes.middlewareMod.FinalizeMiddleware
import typings.awsSdkTypes.signatureMod.RequestSigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signing-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def signingMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](signer: RequestSigner): FinalizeMiddleware[Input, Output, Stream] = js.native
}

