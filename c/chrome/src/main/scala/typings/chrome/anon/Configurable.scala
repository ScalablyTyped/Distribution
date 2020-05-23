package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var multiple_mounts: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var watchable: js.UndefOr[Boolean] = js.undefined
}

object Configurable {
  @scala.inline
  def apply(
    configurable: js.UndefOr[Boolean] = js.undefined,
    multiple_mounts: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    watchable: js.UndefOr[Boolean] = js.undefined
  ): Configurable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple_mounts)) __obj.updateDynamic("multiple_mounts")(multiple_mounts.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(watchable)) __obj.updateDynamic("watchable")(watchable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurable]
  }
}

