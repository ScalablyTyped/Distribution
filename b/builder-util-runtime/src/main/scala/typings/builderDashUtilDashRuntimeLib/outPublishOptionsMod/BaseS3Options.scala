package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseS3Options extends PublishConfiguration {
  /**
    * The ACL. Set to `null` to not [add](https://github.com/electron-userland/electron-builder/issues/1822).
    *
    * @default public-read
    */
  val acl: js.UndefOr[
    builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`private` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`public-read` | scala.Null
  ] = js.undefined
  /**
    * The update channel.
    * @default latest
    */
  var channel: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The directory path.
    * @default /
    */
  val path: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object BaseS3Options {
  @scala.inline
  def apply(
    provider: PublishProvider,
    acl: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`private` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`public-read` = null,
    channel: java.lang.String = null,
    path: java.lang.String = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    updaterCacheDirName: java.lang.String = null
  ): BaseS3Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[BaseS3Options]
  }
}

