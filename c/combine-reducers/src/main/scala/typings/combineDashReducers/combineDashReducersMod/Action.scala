package typings.combineDashReducers.combineDashReducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  var `type`: T
}

object Action {
  @scala.inline
  def apply[T](`type`: T): Action[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

