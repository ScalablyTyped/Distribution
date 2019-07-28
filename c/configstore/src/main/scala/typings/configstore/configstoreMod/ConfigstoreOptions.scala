package typings.configstore.configstoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigstoreOptions extends js.Object {
  var configPath: js.UndefOr[String] = js.undefined
  var globalConfigPath: js.UndefOr[Boolean] = js.undefined
}

object ConfigstoreOptions {
  @scala.inline
  def apply(configPath: String = null, globalConfigPath: js.UndefOr[Boolean] = js.undefined): ConfigstoreOptions = {
    val __obj = js.Dynamic.literal()
    if (configPath != null) __obj.updateDynamic("configPath")(configPath)
    if (!js.isUndefined(globalConfigPath)) __obj.updateDynamic("globalConfigPath")(globalConfigPath)
    __obj.asInstanceOf[ConfigstoreOptions]
  }
}

