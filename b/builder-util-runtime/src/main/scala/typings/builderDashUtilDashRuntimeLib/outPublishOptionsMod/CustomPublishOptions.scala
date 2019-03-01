package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPublishOptions
  extends PublishConfiguration
     with _AllPublishOptions
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any]

object CustomPublishOptions {
  @scala.inline
  def apply(
    provider: PublishProvider,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    updaterCacheDirName: java.lang.String = null
  ): CustomPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[CustomPublishOptions]
  }
}

