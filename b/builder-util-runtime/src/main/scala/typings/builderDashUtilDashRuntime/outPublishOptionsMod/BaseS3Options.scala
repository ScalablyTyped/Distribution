package typings.builderDashUtilDashRuntime.outPublishOptionsMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`private`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`public-read`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseS3Options extends PublishConfiguration {
  /**
    * The ACL. Set to `null` to not [add](https://github.com/electron-userland/electron-builder/issues/1822).
    *
    * @default public-read
    */
  val acl: js.UndefOr[`private` | `public-read` | Null] = js.undefined
  /**
    * The update channel.
    * @default latest
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  /**
    * The directory path.
    * @default /
    */
  val path: js.UndefOr[String | Null] = js.undefined
}

object BaseS3Options {
  @scala.inline
  def apply(
    provider: PublishProvider,
    acl: `private` | `public-read` = null,
    channel: String = null,
    path: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null
  ): BaseS3Options = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[BaseS3Options]
  }
}

