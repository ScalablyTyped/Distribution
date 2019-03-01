package typings
package babylonDashWalkLib.babylonDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait miscVisitors[V] extends js.Object {
  var Noop: js.UndefOr[V] = js.undefined
  var ParenthesizedExpression: js.UndefOr[V] = js.undefined
}

object miscVisitors {
  @scala.inline
  def apply[V](Noop: V = null, ParenthesizedExpression: V = null): miscVisitors[V] = {
    val __obj = js.Dynamic.literal()
    if (Noop != null) __obj.updateDynamic("Noop")(Noop.asInstanceOf[js.Any])
    if (ParenthesizedExpression != null) __obj.updateDynamic("ParenthesizedExpression")(ParenthesizedExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[miscVisitors[V]]
  }
}

