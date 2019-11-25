package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorCommand extends js.Object {
  var bindKey: js.Any
  var exec: js.Function
  var name: String
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object EditorCommand {
  @scala.inline
  def apply(bindKey: js.Any, exec: js.Function, name: String, readOnly: js.UndefOr[Boolean] = js.undefined): EditorCommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorCommand]
  }
}

