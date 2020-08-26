package typings.awsSdkMiddlewareRdsPresignedurl.mod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildRDSPresignedUrlParameters extends js.Object {
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  var base64Encoder: Encoder = js.native
  /**
    * Credentials provider used to sign the presigned URL
    */
  var credentials: Provider[Credentials] = js.native
  /**
    * Endpoint provider of the original request.
    */
  var endpoint: Provider[HttpEndpoint] = js.native
  /**
    * Region provider used to sign the presigned URL
    */
  var region: Provider[String] = js.native
  /**
    * Hashing class used by signer
    */
  var sha256: HashConstructor = js.native
  /**
    * A special input parameter that can either be a name or ARN.
    * The middleware will determine whether to generate presigned URL
    * according to this parameter.
    */
  var sourceIdentifierKey: String = js.native
  /**
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder = js.native
}

object BuildRDSPresignedUrlParameters {
  @scala.inline
  def apply(
    base64Encoder: /* input */ Uint8Array => String,
    credentials: () => js.Promise[Credentials],
    endpoint: () => js.Promise[HttpEndpoint],
    region: () => js.Promise[String],
    sha256: HashConstructor,
    sourceIdentifierKey: String,
    utf8Decoder: /* input */ String => Uint8Array
  ): BuildRDSPresignedUrlParameters = {
    val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], sourceIdentifierKey = sourceIdentifierKey.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
    __obj.asInstanceOf[BuildRDSPresignedUrlParameters]
  }
  @scala.inline
  implicit class BuildRDSPresignedUrlParametersOps[Self <: BuildRDSPresignedUrlParameters] (val x: Self) extends AnyVal {
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
    def setBase64Encoder(value: /* input */ Uint8Array => String): Self = this.set("base64Encoder", js.Any.fromFunction1(value))
    @scala.inline
    def setCredentials(value: () => js.Promise[Credentials]): Self = this.set("credentials", js.Any.fromFunction0(value))
    @scala.inline
    def setEndpoint(value: () => js.Promise[HttpEndpoint]): Self = this.set("endpoint", js.Any.fromFunction0(value))
    @scala.inline
    def setRegion(value: () => js.Promise[String]): Self = this.set("region", js.Any.fromFunction0(value))
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceIdentifierKey(value: String): Self = this.set("sourceIdentifierKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = this.set("utf8Decoder", js.Any.fromFunction1(value))
  }
  
}

