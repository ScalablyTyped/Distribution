package typings.cassanknex.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParams extends js.Object {
  def end(): js.Any
  def error(err: Error): js.Any
  def readable(): js.Any
}

object StreamParams {
  @scala.inline
  def apply(end: () => js.Any, error: Error => js.Any, readable: () => js.Any): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
  
    __obj.asInstanceOf[StreamParams]
  }
}

