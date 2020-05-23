package typings.blockingProxy.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var fork: js.UndefOr[Boolean] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var highlightDelay: js.UndefOr[String] = js.undefined
  var logDir: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var seleniumAddress: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    fork: js.UndefOr[Boolean] = js.undefined,
    help: js.UndefOr[Boolean] = js.undefined,
    highlightDelay: String = null,
    logDir: String = null,
    port: js.UndefOr[Double] = js.undefined,
    seleniumAddress: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fork)) __obj.updateDynamic("fork")(fork.get.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.get.asInstanceOf[js.Any])
    if (highlightDelay != null) __obj.updateDynamic("highlightDelay")(highlightDelay.asInstanceOf[js.Any])
    if (logDir != null) __obj.updateDynamic("logDir")(logDir.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (seleniumAddress != null) __obj.updateDynamic("seleniumAddress")(seleniumAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

