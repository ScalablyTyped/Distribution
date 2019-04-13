package typings
package cssnanoLib.cssnanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssNanoOptions extends js.Object {
  var configFile: js.UndefOr[java.lang.String] = js.undefined
  var preset: js.UndefOr[(js.Tuple2[java.lang.String, js.Object]) | java.lang.String] = js.undefined
}

object CssNanoOptions {
  @scala.inline
  def apply(
    configFile: java.lang.String = null,
    preset: (js.Tuple2[java.lang.String, js.Object]) | java.lang.String = null
  ): CssNanoOptions = {
    val __obj = js.Dynamic.literal()
    if (configFile != null) __obj.updateDynamic("configFile")(configFile)
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNanoOptions]
  }
}

