package typings.awsSdkSignatureV4.signatureV4Mod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureV4Init extends js.Object {
  /**
    * Whether to calculate a checksum of the request body and include it as
    * either a request header (when signing) or as a query string parameter
    * (when presigning). This is required for AWS Glacier and Amazon S3 and optional for
    * every other AWS service as of late 2017.
    *
    * @default [true]
    */
  var applyChecksum: js.UndefOr[Boolean] = js.native
  /**
    * The credentials with which the request should be signed or a function
    * that returns a promise that will be resolved with credentials.
    */
  var credentials: Credentials | Provider[Credentials] = js.native
  /**
    * The region name or a function that returns a promise that will be
    * resolved with the region name.
    */
  var region: String | Provider[String] = js.native
  /**
    * The service signing name.
    */
  var service: String = js.native
  /**
    * A constructor function for a hash object that will calculate SHA-256 HMAC
    * checksums.
    */
  var sha256: js.UndefOr[HashConstructor] = js.native
  /**
    * Whether to uri-escape the request URI path as part of computing the
    * canonical request string. This is required for every AWS service, except
    * Amazon S3, as of late 2017.
    *
    * @default [true]
    */
  var uriEscapePath: js.UndefOr[Boolean] = js.native
}

object SignatureV4Init {
  @scala.inline
  def apply(
    credentials: Credentials | Provider[Credentials],
    region: String | Provider[String],
    service: String
  ): SignatureV4Init = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureV4Init]
  }
  @scala.inline
  implicit class SignatureV4InitOps[Self <: SignatureV4Init] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = this.set("credentials", js.Any.fromFunction0(value))
    @scala.inline
    def setCredentials(value: Credentials | Provider[Credentials]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionFunction0(value: () => js.Promise[String]): Self = this.set("region", js.Any.fromFunction0(value))
    @scala.inline
    def setRegion(value: String | Provider[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplyChecksum(value: Boolean): Self = this.set("applyChecksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyChecksum: Self = this.set("applyChecksum", js.undefined)
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    @scala.inline
    def setUriEscapePath(value: Boolean): Self = this.set("uriEscapePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUriEscapePath: Self = this.set("uriEscapePath", js.undefined)
  }
  
}

