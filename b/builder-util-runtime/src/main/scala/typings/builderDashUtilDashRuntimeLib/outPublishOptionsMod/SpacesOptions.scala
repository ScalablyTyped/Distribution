package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpacesOptions
  extends BaseS3Options
     with _AllPublishOptions {
  /**
    * The space name.
    */
  val name: java.lang.String
  /**
    * The provider. Must be `spaces`.
    */
  @JSName("provider")
  val provider_SpacesOptions: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.spaces
  /**
    * The region (e.g. `nyc3`).
    */
  val region: java.lang.String
}

object SpacesOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    provider: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.spaces,
    region: java.lang.String,
    acl: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`private` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`public-read` = null,
    channel: java.lang.String = null,
    path: java.lang.String = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    updaterCacheDirName: java.lang.String = null
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

