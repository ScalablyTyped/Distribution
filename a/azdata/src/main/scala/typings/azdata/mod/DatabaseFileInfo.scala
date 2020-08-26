package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseFileInfo extends js.Object {
  var id: String = js.native
  var isSelected: Boolean = js.native
  var properties: js.Array[LocalizedPropertyInfo] = js.native
}

object DatabaseFileInfo {
  @scala.inline
  def apply(id: String, isSelected: Boolean, properties: js.Array[LocalizedPropertyInfo]): DatabaseFileInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseFileInfo]
  }
  @scala.inline
  implicit class DatabaseFileInfoOps[Self <: DatabaseFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: LocalizedPropertyInfo*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[LocalizedPropertyInfo]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

