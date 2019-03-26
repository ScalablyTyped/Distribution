package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * The identifier of the action.
    * Any string or CommonActionId for common actions.
    * @see CommonActionId
    **/
  var id: (chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_OFFLINENOTNECESSARY, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.SAVE_FOR_OFFLINE | chromeDashAppsLib.chromeDashAppsLibStrings.OFFLINE_NOT_NECESSARY | chromeDashAppsLib.chromeDashAppsLibStrings.SHARE
    ]
  ]) | java.lang.String
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    id: (chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_OFFLINENOTNECESSARY, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.SAVE_FOR_OFFLINE | chromeDashAppsLib.chromeDashAppsLibStrings.OFFLINE_NOT_NECESSARY | chromeDashAppsLib.chromeDashAppsLibStrings.SHARE
      ]
    ]) | java.lang.String,
    title: java.lang.String = null
  ): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Action]
  }
}

