package typings.awsSdkSigningMiddleware

import typings.awsSdkTypes.signatureMod.RequestSigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signing-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def signingMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](signer: RequestSigner): js.Any = js.native
}
