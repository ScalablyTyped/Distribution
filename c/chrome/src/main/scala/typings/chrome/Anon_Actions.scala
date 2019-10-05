package typings.chrome

import typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.UndefOr[js.Array[Anon_Type]] = js.undefined
  var conditions: js.UndefOr[js.Array[PageStateMatcherProperties]] = js.undefined
  var event: js.UndefOr[String] = js.undefined
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: js.Array[Anon_Type] = null,
    conditions: js.Array[PageStateMatcherProperties] = null,
    event: String = null
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[Anon_Actions]
  }
}

