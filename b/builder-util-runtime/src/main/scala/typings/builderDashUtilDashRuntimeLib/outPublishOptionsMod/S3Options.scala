package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Options extends BaseS3Options {
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

