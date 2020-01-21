package typings.configsOverload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigsOverloadOptions extends js.Object {
  var defaultEnv: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
}

object ConfigsOverloadOptions {
  @scala.inline
  def apply(defaultEnv: String = null, env: String = null): ConfigsOverloadOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultEnv != null) __obj.updateDynamic("defaultEnv")(defaultEnv.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigsOverloadOptions]
  }
}

