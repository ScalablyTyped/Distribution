package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaulticon extends js.Object {
  /** Icon */
  var default_icon: String
  /** What the button will display */
  var default_title: String
  /** ['read'] = read only mode */
  var file_access: js.UndefOr[js.Array[read | String]] = js.undefined
  /**
    * To match all files, use 'filesystem:*.*'
    */
  var file_filters: js.Array[String]
  /** Handler id */
  var id: String
}

object Anon_Defaulticon {
  @scala.inline
  def apply(
    default_icon: String,
    default_title: String,
    file_filters: js.Array[String],
    id: String,
    file_access: js.Array[read | String] = null
  ): Anon_Defaulticon = {
    val __obj = js.Dynamic.literal(default_icon = default_icon, default_title = default_title, file_filters = file_filters, id = id)
    if (file_access != null) __obj.updateDynamic("file_access")(file_access)
    __obj.asInstanceOf[Anon_Defaulticon]
  }
}

