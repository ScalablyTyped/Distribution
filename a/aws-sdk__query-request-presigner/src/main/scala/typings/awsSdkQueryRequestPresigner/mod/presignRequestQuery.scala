package typings.awsSdkQueryRequestPresigner.mod

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/query-request-presigner", "presignRequestQuery")
@js.native
object presignRequestQuery extends js.Object {
  def apply(
    request: HttpRequest[Uint8Array],
    hasCredentialsSha256SigningNameSigningRegionEndpointExpireTime: PresignOption
  ): js.Promise[HttpRequest[Uint8Array]] = js.native
}

