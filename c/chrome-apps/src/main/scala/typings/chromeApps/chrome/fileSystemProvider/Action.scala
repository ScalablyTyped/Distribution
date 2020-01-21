package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.AnonOFFLINENOTNECESSARY
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeApps.chromeAppsStrings.SHARE
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
    AnonOFFLINENOTNECESSARY, 
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
      AnonOFFLINENOTNECESSARY, 
      String, 
      Exclude[String, SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE]
    ]) | String,
    title: String = null
  ): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

