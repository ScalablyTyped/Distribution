package typings.atAwsDashSdkTypes.buildSignatureMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPresigner extends js.Object {
  /**
    * Signs a request for future use.
    *
    * The request will be valid until either the provided `expiration` time has
    * passed or the underlying credentials have expired.
    *
    * @param requestToSign The request that should be signed.
    * @param expiration    The time at which the signed request should no
    *                      longer be honored.
    * @param options       Additional signing options.
    */
  def presignRequest[StreamType](requestToSign: HttpRequest[StreamType], expiration: DateInput): js.Promise[HttpRequest[StreamType]] = js.native
  def presignRequest[StreamType](requestToSign: HttpRequest[StreamType], expiration: DateInput, options: RequestSigningArguments): js.Promise[HttpRequest[StreamType]] = js.native
}

