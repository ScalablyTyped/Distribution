package typings.awsSdkSignatureV4.signatureV4Mod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureV4Init extends js.Object {
  /**
    * Whether to calculate a checksum of the request body and include it as
    * either a request header (when signing) or as a query string parameter
    * (when presigning). This is required for AWS Glacier and Amazon S3 and optional for
    * every other AWS service as of late 2017.
    *
    * @default [true]
    */
  var applyChecksum: js.UndefOr[Boolean] = js.undefined
  /**
    * The credentials with which the request should be signed or a function
    * that returns a promise that will be resolved with credentials.
    */
  var credentials: Credentials | Provider[Credentials]
  /**
    * The region name or a function that returns a promise that will be
    * resolved with the region name.
    */
  var region: String | Provider[String]
  /**
    * The service signing name.
    */
  var service: String
  /**
    * A constructor function for a hash object that will calculate SHA-256 HMAC
    * checksums.
    */
  var sha256: js.UndefOr[HashConstructor] = js.undefined
  /**
    * Whether to uri-escape the request URI path as part of computing the
    * canonical request string. This is required for every AWS service, except
    * Amazon S3, as of late 2017.
    *
    * @default [true]
    */
  var uriEscapePath: js.UndefOr[Boolean] = js.undefined
}

object SignatureV4Init {
  @scala.inline
  def apply(
    credentials: Credentials | Provider[Credentials],
    region: String | Provider[String],
    service: String,
    applyChecksum: js.UndefOr[Boolean] = js.undefined,
    sha256: HashConstructor = null,
    uriEscapePath: js.UndefOr[Boolean] = js.undefined
  ): SignatureV4Init = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (!js.isUndefined(applyChecksum)) __obj.updateDynamic("applyChecksum")(applyChecksum.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (!js.isUndefined(uriEscapePath)) __obj.updateDynamic("uriEscapePath")(uriEscapePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureV4Init]
  }
}

