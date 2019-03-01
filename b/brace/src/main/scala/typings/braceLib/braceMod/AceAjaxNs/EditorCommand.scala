package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorCommand extends js.Object {
  var bindKey: js.Any
  var exec: js.Function
  var name: java.lang.String
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object EditorCommand {
  @scala.inline
  def apply(
    bindKey: js.Any,
    exec: js.Function,
    name: java.lang.String,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): EditorCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindKey")(bindKey)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[EditorCommand]
  }
}

