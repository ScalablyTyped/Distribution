package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// $CommandQueue from `command_queue.coffee` - a lot to type. Might be more useful if it was written in TS
trait CommandQueue extends ObjectLike {
  def add(obj: js.Any): js.Any
  def create(): CommandQueue
  def get(): js.Any
  def logs(filters: js.Any): js.Any
  def toJSON(): js.Array[String]
}

object CommandQueue {
  @scala.inline
  def apply(
    add: js.Any => js.Any,
    create: () => CommandQueue,
    get: () => js.Any,
    logs: js.Any => js.Any,
    toJSON: () => js.Array[String],
    StringDictionary: StringDictionary[js.Any] = null
  ): CommandQueue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), create = js.Any.fromFunction0(create), get = js.Any.fromFunction0(get), logs = js.Any.fromFunction1(logs), toJSON = js.Any.fromFunction0(toJSON))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CommandQueue]
  }
}

