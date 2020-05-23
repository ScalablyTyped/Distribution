package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.generic
import typings.node.httpMod.OutgoingHttpHeaders
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
    channel: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined,
    useMultipleRangeRequest: js.UndefOr[Boolean] = js.undefined
  ): GenericServerOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(useMultipleRangeRequest)) __obj.updateDynamic("useMultipleRangeRequest")(useMultipleRangeRequest.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericServerOptions]
  }
}

