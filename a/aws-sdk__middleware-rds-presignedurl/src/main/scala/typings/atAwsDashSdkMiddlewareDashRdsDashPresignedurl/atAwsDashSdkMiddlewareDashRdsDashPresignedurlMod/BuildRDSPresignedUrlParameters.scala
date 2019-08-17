package typings.atAwsDashSdkMiddlewareDashRdsDashPresignedurl.atAwsDashSdkMiddlewareDashRdsDashPresignedurlMod

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

@js.native
trait BuildRDSPresignedUrlParameters extends js.Object {
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  /**
    * Credentials provider used to sign the presigned URL
    */
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  /**
    * Endpoint provider of the original request.
    */
  @JSName("endpoint")
  var endpoint_Original: Provider[HttpEndpoint] = js.native
  /**
    * Region provider used to sign the presigned URL
    */
  @JSName("region")
  var region_Original: Provider[String] = js.native
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
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  def base64Encoder(input: Uint8Array): String = js.native
  /**
    * Credentials provider used to sign the presigned URL
    */
  def credentials(): js.Promise[Credentials] = js.native
  /**
    * Endpoint provider of the original request.
    */
  def endpoint(): js.Promise[HttpEndpoint] = js.native
  /**
    * Region provider used to sign the presigned URL
    */
  def region(): js.Promise[String] = js.native
  /**
    * Decoder to decode input string when generate presigned URL
    */
  def utf8Decoder(input: String): Uint8Array = js.native
}

