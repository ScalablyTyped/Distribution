package typings.builderUtilRuntime.publishOptionsMod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishConfiguration extends js.Object {
  /**
    * The provider.
    */
  val provider: PublishProvider
  /**
    * Whether to publish auto update info files.
    *
    * Auto update relies only on the first provider in the list (you can specify several publishers).
    * Thus, probably, there`s no need to upload the metadata files for the other configured providers. But by default will be uploaded.
    *
    * @default true
    */
  val publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
  /**
    * @private
    * win-only
    */
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * Any custom request headers
    */
  val requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  /**
    * @private
    * win-only
    */
  val updaterCacheDirName: js.UndefOr[String | Null] = js.undefined
}

object PublishConfiguration {
  @scala.inline
  def apply(
    provider: PublishProvider,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): PublishConfiguration = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishConfiguration]
  }
}

