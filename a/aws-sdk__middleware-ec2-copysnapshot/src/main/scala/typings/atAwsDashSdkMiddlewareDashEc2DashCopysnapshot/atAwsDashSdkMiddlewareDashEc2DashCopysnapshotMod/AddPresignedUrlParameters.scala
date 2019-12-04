package typings.atAwsDashSdkMiddlewareDashEc2DashCopysnapshot.atAwsDashSdkMiddlewareDashEc2DashCopysnapshotMod

import typings.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPresignedUrlParameters extends js.Object {
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
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder
}

object AddPresignedUrlParameters {
  @scala.inline
  def apply(
    base64Encoder: /* input */ Uint8Array => String,
    credentials: () => js.Promise[Credentials],
    endpoint: () => js.Promise[HttpEndpoint],
    region: () => js.Promise[String],
    sha256: HashConstructor,
    utf8Decoder: /* input */ String => Uint8Array
  ): AddPresignedUrlParameters = {
    val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
  
    __obj.asInstanceOf[AddPresignedUrlParameters]
  }
}

