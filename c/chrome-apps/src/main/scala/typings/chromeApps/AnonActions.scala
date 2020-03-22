package typings.chromeApps

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: js.UndefOr[js.Array[AnonTypeDeclarativeWebRequestActionsList]] = js.undefined
  var conditions: js.UndefOr[js.Array[AnonDictkey]] = js.undefined
  /** Event name */
  var event: js.UndefOr[DeclarativeWebRequestEventList] = js.undefined
}

object AnonActions {
  @scala.inline
  def apply(
    actions: js.Array[AnonTypeDeclarativeWebRequestActionsList] = null,
    conditions: js.Array[AnonDictkey] = null,
    event: DeclarativeWebRequestEventList = null
  ): AnonActions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
}

