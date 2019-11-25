package typings.commander.commanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  var executableFile: js.UndefOr[String] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var noHelp: js.UndefOr[Boolean] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(
    executableFile: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    noHelp: js.UndefOr[Boolean] = js.undefined
  ): CommandOptions = {
    val __obj = js.Dynamic.literal()
    if (executableFile != null) __obj.updateDynamic("executableFile")(executableFile.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(noHelp)) __obj.updateDynamic("noHelp")(noHelp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
}

