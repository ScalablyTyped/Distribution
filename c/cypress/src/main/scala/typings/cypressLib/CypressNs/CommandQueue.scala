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

