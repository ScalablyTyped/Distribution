package typings.configstore.mod

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
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (!js.isUndefined(globalConfigPath)) __obj.updateDynamic("globalConfigPath")(globalConfigPath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigstoreOptions]
  }
}

