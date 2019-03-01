package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnqueuedCommand extends js.Object {
  var args: js.Array[_]
  var chainerId: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
  def fn(args: js.Any*): js.Any
}

object EnqueuedCommand {
  @scala.inline
  def apply(
    args: js.Array[_],
    chainerId: java.lang.String,
    fn: js.Function1[/* repeated */ js.Any, js.Any],
    name: java.lang.String,
    `type`: java.lang.String
  ): EnqueuedCommand = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("chainerId")(chainerId)
    __obj.updateDynamic("fn")(fn)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EnqueuedCommand]
  }
}

