package typings.awsSdkQueryRequestPresigner.mod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/query-request-presigner", "presignRequestQuery")
@js.native
object presignRequestQuery extends js.Object {
  
  def apply(
    request: HttpRequest,
    hasCredentialsSha256SigningNameSigningRegionEndpointExpireTime: PresignOption
  ): js.Promise[HttpRequest] = js.native
}
