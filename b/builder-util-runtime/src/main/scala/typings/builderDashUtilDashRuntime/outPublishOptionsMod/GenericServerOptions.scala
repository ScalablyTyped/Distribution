package typings.builderDashUtilDashRuntime.outPublishOptionsMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.generic
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
  val channel: js.UndefOr[String | Null] = js.undefined
  /**
    * The provider. Must be `generic`.
    */
  @JSName("provider")
  val provider_GenericServerOptions: generic
  /**
    * The base url. e.g. `https://bucket_name.s3.amazonaws.com`.
    */
  val url: String
  /**
    * Whether to use multiple range requests for differential update. Defaults to `true` if `url` doesn't contain `s3.amazonaws.com`.
    */
  val useMultipleRangeRequest: js.UndefOr[Boolean] = js.undefined
}

object GenericServerOptions {
  @scala.inline
  def apply(
    provider: generic,
    url: String,
    channel: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null,
    useMultipleRangeRequest: js.UndefOr[Boolean] = js.undefined
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

