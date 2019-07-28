package typings.builderDashUtilDashRuntime.outPublishOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPublishOptions
  extends PublishConfiguration
     with /* index */ StringDictionary[js.Any]
     with _AllPublishOptions

object CustomPublishOptions {
  @scala.inline
  def apply(
    provider: PublishProvider,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null
  ): CustomPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[CustomPublishOptions]
  }
}

