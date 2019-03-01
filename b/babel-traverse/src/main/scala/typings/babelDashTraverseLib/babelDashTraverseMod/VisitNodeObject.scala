package typings
package babelDashTraverseLib.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitNodeObject[T] extends js.Object {
  var enter: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, scala.Unit]] = js.undefined
  var exit: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, scala.Unit]] = js.undefined
}

object VisitNodeObject {
  @scala.inline
  def apply[T](
    enter: js.Function2[/* path */ NodePath[T], /* state */ js.Any, scala.Unit] = null,
    exit: js.Function2[/* path */ NodePath[T], /* state */ js.Any, scala.Unit] = null
  ): VisitNodeObject[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[VisitNodeObject[T]]
  }
}

