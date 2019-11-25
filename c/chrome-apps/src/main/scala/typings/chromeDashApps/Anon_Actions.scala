package typings.chromeDashApps

import typings.chromeDashApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.UndefOr[js.Array[Anon_TypeDeclarativeWebRequestActionsList]] = js.undefined
  var conditions: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  /** Event name */
  var event: js.UndefOr[DeclarativeWebRequestEventList] = js.undefined
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: js.Array[Anon_TypeDeclarativeWebRequestActionsList] = null,
    conditions: js.Array[Anon_Key] = null,
    event: DeclarativeWebRequestEventList = null
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Actions]
  }
}

