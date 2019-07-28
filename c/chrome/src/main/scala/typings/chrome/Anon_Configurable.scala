package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var multiple_mounts: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var watchable: js.UndefOr[Boolean] = js.undefined
}

object Anon_Configurable {
  @scala.inline
  def apply(
    configurable: js.UndefOr[Boolean] = js.undefined,
    multiple_mounts: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
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

