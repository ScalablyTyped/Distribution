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

trait BuildRDSPresignedUrlParameters extends js.Object {
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  var base64Encoder: Encoder
  /**
    * Credentials provider used to sign the presigned URL
    */
  var credentials: Provider[Credentials]
  /**
    * Endpoint provider of the original request.
    */
  var endpoint: Provider[HttpEndpoint]
  /**
    * Region provider used to sign the presigned URL
    */
  var region: Provider[String]
  /**
    * Hashing class used by signer
    */
  var sha256: HashConstructor
  /**
    * A special input parameter that can either be a name or ARN.
    * The middleware will determine whether to generate presigned URL
    * according to this parameter.
    */
  var sourceIdentifierKey: String
  /**
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder
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
}

