package typings.atBabelTraverse.atBabelTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitNodeObject[S, P] extends js.Object {
  var enter: js.UndefOr[VisitNodeFunction[S, P]] = js.undefined
  var exit: js.UndefOr[VisitNodeFunction[S, P]] = js.undefined
}

object VisitNodeObject {
  @scala.inline
  def apply[S, P](enter: VisitNodeFunction[S, P] = null, exit: VisitNodeFunction[S, P] = null): VisitNodeObject[S, P] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNodeObject[S, P]]
  }
}

