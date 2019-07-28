package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.Anon_OFFLINENOTNECESSARY
import typings.chromeDashApps.chromeDashAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeDashApps.chromeDashAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeDashApps.chromeDashAppsStrings.SHARE
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * The identifier of the action.
    * Any string or CommonActionId for common actions.
    * @see CommonActionId
    **/
  var id: (ToStringLiteral[
    Anon_OFFLINENOTNECESSARY, 
    String, 
    Exclude[String, SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE]
  ]) | String
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    id: (ToStringLiteral[
      Anon_OFFLINENOTNECESSARY, 
      String, 
      Exclude[String, SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE]
    ]) | String,
    title: String = null
  ): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Action]
  }
}

