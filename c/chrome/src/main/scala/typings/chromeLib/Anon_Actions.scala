package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.UndefOr[js.Array[Anon_Type]] = js.undefined
  var conditions: js.UndefOr[js.Array[chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties]] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: js.Array[Anon_Type] = null,
    conditions: js.Array[chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties] = null,
    event: java.lang.String = null
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[Anon_Actions]
  }
}

