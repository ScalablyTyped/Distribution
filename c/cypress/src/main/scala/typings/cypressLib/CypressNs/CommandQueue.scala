package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// $CommandQueue from `command_queue.coffee` - a lot to type. Might be more useful if it was written in TS
trait CommandQueue extends ObjectLike {
  def add(obj: js.Any): js.Any
  def create(): CommandQueue
  def get(): js.Any
  def logs(filters: js.Any): js.Any
  def toJSON(): js.Array[java.lang.String]
}

object CommandQueue {
  @scala.inline
  def apply(
    add: js.Function1[js.Any, js.Any],
    create: js.Function0[CommandQueue],
    get: js.Function0[js.Any],
    logs: js.Function1[js.Any, js.Any],
    toJSON: js.Function0[js.Array[java.lang.String]]
  ): CommandQueue = {
    val __obj = js.Dynamic.literal(add = add, create = create, get = get, logs = logs, toJSON = toJSON)
  
    __obj.asInstanceOf[CommandQueue]
  }
}

