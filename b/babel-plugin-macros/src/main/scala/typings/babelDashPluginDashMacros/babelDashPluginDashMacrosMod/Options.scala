package typings.babelDashPluginDashMacros.babelDashPluginDashMacrosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var configName: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(configName: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

