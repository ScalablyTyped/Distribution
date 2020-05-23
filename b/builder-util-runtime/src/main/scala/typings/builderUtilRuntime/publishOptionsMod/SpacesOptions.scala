package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.`private`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`public-read`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpacesOptions
  extends BaseS3Options
     with _AllPublishOptions {
  /**
    * The space name.
    */
  val name: String
  /**
    * The provider. Must be `spaces`.
    */
  @JSName("provider")
  val provider_SpacesOptions: spaces
  /**
    * The region (e.g. `nyc3`).
    */
  val region: String
}

object SpacesOptions {
  @scala.inline
  def apply(
    name: String,
    provider: spaces,
    region: String,
    acl: js.UndefOr[Null | `private` | `public-read`] = js.undefined,
    channel: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): SpacesOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (!js.isUndefined(acl)) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacesOptions]
  }
}

