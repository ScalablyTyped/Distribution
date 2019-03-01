package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
  var tabSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_State {
  @scala.inline
  def apply(state: js.Any = null, tabSize: scala.Int | scala.Double = null): Anon_State = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_State]
  }
}

