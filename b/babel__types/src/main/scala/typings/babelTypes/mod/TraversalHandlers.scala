package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalHandlers[T] extends js.Object {
  var enter: js.UndefOr[TraversalHandler[T]] = js.undefined
  var exit: js.UndefOr[TraversalHandler[T]] = js.undefined
}

object TraversalHandlers {
  @scala.inline
  def apply[T](enter: TraversalHandler[T] = null, exit: TraversalHandler[T] = null): TraversalHandlers[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalHandlers[T]]
  }
}

