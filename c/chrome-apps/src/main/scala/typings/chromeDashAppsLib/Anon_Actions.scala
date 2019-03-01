package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.UndefOr[js.Array[Anon_TypeDeclarativeWebRequestActionsList]] = js.undefined
  var conditions: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  /** Event name */
  var event: js.UndefOr[chromeDashAppsLib.chromeNs.webViewRequestNs.DeclarativeWebRequestEventList] = js.undefined
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: js.Array[Anon_TypeDeclarativeWebRequestActionsList] = null,
    conditions: js.Array[Anon_Key] = null,
    event: chromeDashAppsLib.chromeNs.webViewRequestNs.DeclarativeWebRequestEventList = null
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[Anon_Actions]
  }
}

