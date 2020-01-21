package typings.awsSdkTypes.signatureMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSigner extends js.Object {
  /**
    * Sign the provided request for immediate dispatch.
    */
  def sign[StreamType](requestToSign: HttpRequest[StreamType]): js.Promise[HttpRequest[StreamType]] = js.native
  def sign[StreamType](requestToSign: HttpRequest[StreamType], options: RequestSigningArguments): js.Promise[HttpRequest[StreamType]] = js.native
}

