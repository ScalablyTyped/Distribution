package typings.builderDashUtilDashRuntime.outPublishOptionsMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.AES256
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.REDUCED_REDUNDANCY
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.STANDARD
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.STANDARD_IA
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`private`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`public-read`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.awsColonkms
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.s3
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
    acl: `private` | `public-read` = null,
    channel: String = null,
    encryption: AES256 | awsColonkms = null,
    endpoint: String = null,
    path: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    region: String = null,
    storageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA = null,
    updaterCacheDirName: String = null
  ): S3Options = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Options]
  }
}

