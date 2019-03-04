package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

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
  val publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @private
    * win-only
    */
  var publisherName: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * @private
    * win-only
    */
  val updaterCacheDirName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object PublishConfiguration {
  @scala.inline
  def apply(
    provider: PublishProvider,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    updaterCacheDirName: java.lang.String = null
  ): PublishConfiguration = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    __obj.asInstanceOf[PublishConfiguration]
  }
}

