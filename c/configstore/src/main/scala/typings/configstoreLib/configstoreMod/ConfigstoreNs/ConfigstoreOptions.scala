package typings
package configstoreLib.configstoreMod.ConfigstoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigstoreOptions extends js.Object {
  var configPath: js.UndefOr[java.lang.String] = js.undefined
  var globalConfigPath: js.UndefOr[scala.Boolean] = js.undefined
}

object ConfigstoreOptions {
  @scala.inline
  def apply(configPath: java.lang.String = null, globalConfigPath: js.UndefOr[scala.Boolean] = js.undefined): ConfigstoreOptions = {
    val __obj = js.Dynamic.literal()
    if (configPath != null) __obj.updateDynamic("configPath")(configPath)
    if (!js.isUndefined(globalConfigPath)) __obj.updateDynamic("globalConfigPath")(globalConfigPath)
    __obj.asInstanceOf[ConfigstoreOptions]
  }
}

