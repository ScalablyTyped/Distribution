package typings.builderUtilRuntime.publishOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.OutgoingHttpHeaders
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
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): CustomPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPublishOptions]
  }
}

