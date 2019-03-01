package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /** The identifier of the action. Any string or CommonActionId for common actions. */
  var id: java.lang.String
  /** Optional. The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Action {
  @scala.inline
  def apply(id: java.lang.String, title: java.lang.String = null): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Action]
  }
}

