package typings.babelPluginTransformRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var absoluteRuntime: js.UndefOr[Boolean | String] = js.undefined
  var corejs: js.UndefOr[CorejsOption] = js.undefined
  var helpers: js.UndefOr[Boolean] = js.undefined
  var regenerator: js.UndefOr[Boolean] = js.undefined
  var useESModules: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absoluteRuntime: Boolean | String = null,
    corejs: CorejsOption = null,
    helpers: js.UndefOr[Boolean] = js.undefined,
    regenerator: js.UndefOr[Boolean] = js.undefined,
    useESModules: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (absoluteRuntime != null) __obj.updateDynamic("absoluteRuntime")(absoluteRuntime.asInstanceOf[js.Any])
    if (corejs != null) __obj.updateDynamic("corejs")(corejs.asInstanceOf[js.Any])
    if (!js.isUndefined(helpers)) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (!js.isUndefined(regenerator)) __obj.updateDynamic("regenerator")(regenerator.asInstanceOf[js.Any])
    if (!js.isUndefined(useESModules)) __obj.updateDynamic("useESModules")(useESModules.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

