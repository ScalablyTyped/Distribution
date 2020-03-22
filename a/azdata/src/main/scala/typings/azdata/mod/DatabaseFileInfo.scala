package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseFileInfo extends js.Object {
  var id: String
  var isSelected: Boolean
  var properties: js.Array[LocalizedPropertyInfo]
}

object DatabaseFileInfo {
  @scala.inline
  def apply(id: String, isSelected: Boolean, properties: js.Array[LocalizedPropertyInfo]): DatabaseFileInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseFileInfo]
  }
}

