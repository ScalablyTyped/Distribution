package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.AES256
import typings.builderUtilRuntime.builderUtilRuntimeStrings.REDUCED_REDUNDANCY
import typings.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD
import typings.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD_IA
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`private`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`public-read`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.awsColonkms
import typings.builderUtilRuntime.builderUtilRuntimeStrings.s3
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Options
  extends BaseS3Options
     with _AllPublishOptions {
  /**
    * The bucket name.
    */
  val bucket: String
  /**
    * Server-side encryption algorithm to use for the object.
    */
  val encryption: js.UndefOr[AES256 | awsColonkms | Null] = js.undefined
  /**
    * The endpoint URI to send requests to. The default endpoint is built from the configured region.
    * The endpoint should be a string like `https://{service}.{region}.amazonaws.com`.
    */
  val endpoint: js.UndefOr[String | Null] = js.undefined
  /**
    * The provider. Must be `s3`.
    */
  @JSName("provider")
  val provider_S3Options: s3
  /**
    * The region. Is determined and set automatically when publishing.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  /**
    * The type of storage to use for the object.
    * @default STANDARD
    */
  val storageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | Null] = js.undefined
}

object S3Options {
  @scala.inline
  def apply(
    bucket: String,
    provider: s3,
    acl: js.UndefOr[Null | `private` | `public-read`] = js.undefined,
    channel: js.UndefOr[Null | String] = js.undefined,
    encryption: js.UndefOr[Null | AES256 | awsColonkms] = js.undefined,
    endpoint: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    region: js.UndefOr[Null | String] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    storageClass: js.UndefOr[Null | STANDARD | REDUCED_REDUNDANCY | STANDARD_IA] = js.undefined,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): S3Options = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(acl)) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(encryption)) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(endpoint)) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (!js.isUndefined(region)) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(storageClass)) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Options]
  }
}

