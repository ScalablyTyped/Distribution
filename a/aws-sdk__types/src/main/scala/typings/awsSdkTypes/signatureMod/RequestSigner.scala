package typings.awsSdkTypes.signatureMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSigner extends js.Object {
  
  /**
    * Sign the provided request for immediate dispatch.
    */
  def sign(requestToSign: HttpRequest): js.Promise[HttpRequest] = js.native
  def sign(requestToSign: HttpRequest, options: RequestSigningArguments): js.Promise[HttpRequest] = js.native
}
