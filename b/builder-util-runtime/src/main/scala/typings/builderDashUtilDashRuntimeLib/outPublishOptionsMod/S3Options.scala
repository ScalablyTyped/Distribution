package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Options
  extends BaseS3Options
     with _AllPublishOptions {
  /**
    * The bucket name.
    */
  val bucket: java.lang.String
  /**
    * Server-side encryption algorithm to use for the object.
    */
  val encryption: js.UndefOr[
    builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.AES256 | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`aws:kms` | scala.Null
  ] = js.undefined
  /**
    * The endpoint URI to send requests to. The default endpoint is built from the configured region.
    * The endpoint should be a string like `https://{service}.{region}.amazonaws.com`.
    */
  val endpoint: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The provider. Must be `s3`.
    */
  @JSName("provider")
  val provider_S3Options: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.s3
  /**
    * The region. Is determined and set automatically when publishing.
    */
  var region: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The type of storage to use for the object.
    * @default STANDARD
    */
  val storageClass: js.UndefOr[
    builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.STANDARD | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.REDUCED_REDUNDANCY | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.STANDARD_IA | scala.Null
  ] = js.undefined
}

object S3Options {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    provider: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.s3,
    acl: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`private` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`public-read` = null,
    channel: java.lang.String = null,
    encryption: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.AES256 | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`aws:kms` = null,
    endpoint: java.lang.String = null,
    path: java.lang.String = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    region: java.lang.String = null,
    storageClass: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.STANDARD | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.REDUCED_REDUNDANCY | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.STANDARD_IA = null,
    updaterCacheDirName: java.lang.String = null
  ): S3Options = {
    val __obj = js.Dynamic.literal(bucket = bucket, provider = provider)
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (region != null) __obj.updateDynamic("region")(region)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[S3Options]
  }
}

