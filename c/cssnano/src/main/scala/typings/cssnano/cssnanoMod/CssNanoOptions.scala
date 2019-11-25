package typings.cssnano.cssnanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssNanoOptions extends js.Object {
  var configFile: js.UndefOr[String] = js.undefined
  var preset: js.UndefOr[(js.Tuple2[String, js.Object]) | String] = js.undefined
}

object CssNanoOptions {
  @scala.inline
  def apply(configFile: String = null, preset: (js.Tuple2[String, js.Object]) | String = null): CssNanoOptions = {
    val __obj = js.Dynamic.literal()
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNanoOptions]
  }
}

