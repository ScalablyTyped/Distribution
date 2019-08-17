package typings.atAwsDashSdkQueryDashRequestDashPresigner.atAwsDashSdkQueryDashRequestDashPresignerMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/query-request-presigner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def presignRequestQuery(
    request: HttpRequest[Uint8Array],
    hasCredentialsSha256SigningNameSigningRegionEndpointExpireTime: PresignOption
  ): js.Promise[HttpRequest[Uint8Array]] = js.native
}

