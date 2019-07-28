package typings.builderDashUtilDashRuntime.outPublishOptionsMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`private`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`public-read`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.spaces
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
    acl: `private` | `public-read` = null,
    channel: String = null,
    path: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null
  ): SpacesOptions = {
    val __obj = js.Dynamic.literal(name = name, provider = provider, region = region)
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[SpacesOptions]
  }
}

