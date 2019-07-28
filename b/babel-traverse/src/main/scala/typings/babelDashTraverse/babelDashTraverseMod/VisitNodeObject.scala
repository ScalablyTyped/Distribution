package typings.babelDashTraverse.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitNodeObject[T] extends js.Object {
  var enter: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.undefined
  var exit: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.undefined
}

object VisitNodeObject {
  @scala.inline
  def apply[T](
    enter: (/* path */ NodePath[T], /* state */ js.Any) => Unit = null,
    exit: (/* path */ NodePath[T], /* state */ js.Any) => Unit = null
  ): VisitNodeObject[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction2(exit))
    __obj.asInstanceOf[VisitNodeObject[T]]
  }
}

