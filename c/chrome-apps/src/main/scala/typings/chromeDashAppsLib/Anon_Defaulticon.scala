package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaulticon extends js.Object {
  /** Icon */
  var default_icon: java.lang.String
  /** What the button will display */
  var default_title: java.lang.String
  /** ['read'] = read only mode */
  var file_access: js.UndefOr[js.Array[chromeDashAppsLib.chromeDashAppsLibStrings.read | java.lang.String]] = js.undefined
  /**
    * To match all files, use 'filesystem:*.*'
    */
  var file_filters: js.Array[java.lang.String]
  /** Handler id */
  var id: java.lang.String
}

object Anon_Defaulticon {
  @scala.inline
  def apply(
    default_icon: java.lang.String,
    default_title: java.lang.String,
    file_filters: js.Array[java.lang.String],
    id: java.lang.String,
    file_access: js.Array[chromeDashAppsLib.chromeDashAppsLibStrings.read | java.lang.String] = null
  ): Anon_Defaulticon = {
    val __obj = js.Dynamic.literal(default_icon = default_icon, default_title = default_title, file_filters = file_filters, id = id)
    if (file_access != null) __obj.updateDynamic("file_access")(file_access)
    __obj.asInstanceOf[Anon_Defaulticon]
  }
}

