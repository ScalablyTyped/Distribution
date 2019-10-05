package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalHandlers[T] extends js.Object {
  var enter: js.UndefOr[TraversalHandler[T]] = js.undefined
  var exit: js.UndefOr[TraversalHandler[T]] = js.undefined
}

object TraversalHandlers {
  @scala.inline
  def apply[T](
    enter: (/* node */ Node, /* parent */ TraversalAncestors, T) => Unit = null,
    exit: (/* node */ Node, /* parent */ TraversalAncestors, T) => Unit = null
  ): TraversalHandlers[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction3(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction3(exit))
    __obj.asInstanceOf[TraversalHandlers[T]]
  }
}

