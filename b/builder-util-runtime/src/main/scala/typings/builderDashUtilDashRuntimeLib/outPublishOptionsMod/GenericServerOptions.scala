package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericServerOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The channel.
    * @default latest
    */
  val channel: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The provider. Must be `generic`.
    */
  @JSName("provider")
  val provider_GenericServerOptions: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.generic
  /**
    * The base url. e.g. `https://bucket_name.s3.amazonaws.com`.
    */
  val url: java.lang.String
  /**
    * Whether to use multiple range requests for differential update. Defaults to `true` if `url` doesn't contain `s3.amazonaws.com`.
    */
  val useMultipleRangeRequest: js.UndefOr[scala.Boolean] = js.undefined
}

object GenericServerOptions {
  @scala.inline
  def apply(
    provider: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.generic,
    url: java.lang.String,
    channel: java.lang.String = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    updaterCacheDirName: java.lang.String = null,
    useMultipleRangeRequest: js.UndefOr[scala.Boolean] = js.undefined
  ): GenericServerOptions = {
    val __obj = js.Dynamic.literal(provider = provider, url = url)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    if (!js.isUndefined(useMultipleRangeRequest)) __obj.updateDynamic("useMultipleRangeRequest")(useMultipleRangeRequest)
    __obj.asInstanceOf[GenericServerOptions]
  }
}

