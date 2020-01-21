package typings.awsSdkQueryRequestPresigner.mod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresignOption extends js.Object {
  /**
    * credentials used to sign the request.
    */
  var credentials: Credentials
  /**
    * Use endpoint other than that in request
    * @default request the same endpoint as in the request
    */
  var endpoint: js.UndefOr[HttpEndpoint] = js.undefined
  /**
    * The time span in second that the presigned url lives
    * @default 3600
    */
  var expireTime: js.UndefOr[Double] = js.undefined
  var sha256: HashConstructor
  /**
    * The service name used to sign the request
    */
  var signingName: String
  /**
    * The region that signer used to sign. Usally the same as
    * that in request hostname
    */
  var signingRegion: String
}

object PresignOption {
  @scala.inline
  def apply(
    credentials: Credentials,
    sha256: HashConstructor,
    signingName: String,
    signingRegion: String,
    endpoint: HttpEndpoint = null,
    expireTime: Int | Double = null
  ): PresignOption = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresignOption]
  }
}

