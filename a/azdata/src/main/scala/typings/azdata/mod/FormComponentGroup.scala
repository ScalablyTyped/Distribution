package typings.azdata.mod

import typings.azdata.FormComponentlayoutFormIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormComponentGroup extends js.Object {
  /**
  		 * The form components to display in the group along with optional layouts for each item
  		 */
  var components: js.Array[FormComponentlayoutFormIt]
  /**
  		 * The title of the group, displayed above its components
  		 */
  var title: String
}

object FormComponentGroup {
  @scala.inline
  def apply(components: js.Array[FormComponentlayoutFormIt], title: String): FormComponentGroup = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentGroup]
  }
}

