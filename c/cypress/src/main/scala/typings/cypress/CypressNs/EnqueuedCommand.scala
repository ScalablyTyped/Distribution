package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnqueuedCommand extends js.Object {
  var args: js.Array[_]
  var chainerId: String
  var name: String
  var `type`: String
  def fn(args: js.Any*): js.Any
}

object EnqueuedCommand {
  @scala.inline
  def apply(
    args: js.Array[_],
    chainerId: String,
    fn: /* repeated */ js.Any => js.Any,
    name: String,
    `type`: String
  ): EnqueuedCommand = {
    val __obj = js.Dynamic.literal(args = args, chainerId = chainerId, fn = js.Any.fromFunction1(fn), name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EnqueuedCommand]
  }
}

