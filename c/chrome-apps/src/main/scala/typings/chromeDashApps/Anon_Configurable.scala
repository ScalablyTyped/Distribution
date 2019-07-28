package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  /**
    * For example, if *configurable* is set to **true**,
    * then a menu item for configuring volumes will be rendered.
    */
  var configurable: js.UndefOr[Boolean] = js.undefined
  /**
    * If *multiple_mounts* is set to **true**, then *Files app*
    * will allow to add more than one mount points from the UI.
    */
  var multiple_mounts: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[network] = js.undefined
  /**
    * If *watchable* is **false**, then a refresh button will be rendered.
    * Note, that if possible you should add support for watchers, so changes
    * on the file system can be reflected immediately and automatically.
    */
  var watchable: js.UndefOr[Boolean] = js.undefined
}

object Anon_Configurable {
  @scala.inline
  def apply(
    configurable: js.UndefOr[Boolean] = js.undefined,
    multiple_mounts: js.UndefOr[Boolean] = js.undefined,
    source: network = null,
    watchable: js.UndefOr[Boolean] = js.undefined
  ): Anon_Configurable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable)
    if (!js.isUndefined(multiple_mounts)) __obj.updateDynamic("multiple_mounts")(multiple_mounts)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(watchable)) __obj.updateDynamic("watchable")(watchable)
    __obj.asInstanceOf[Anon_Configurable]
  }
}

