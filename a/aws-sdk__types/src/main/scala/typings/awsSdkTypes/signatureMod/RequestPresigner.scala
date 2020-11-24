package typings.awsSdkTypes.signatureMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPresigner extends js.Object {
  
  /**
    * Signs a request for future use.
    *
    * The request will be valid until either the provided `expiration` time has
    * passed or the underlying credentials have expired.
    *
    * @param requestToSign The request that should be signed.
    * @param options       Additional signing options.
    */
  def presign(requestToSign: HttpRequest): js.Promise[HttpRequest] = js.native
  def presign(requestToSign: HttpRequest, options: RequestPresigningArguments): js.Promise[HttpRequest] = js.native
}
