package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchemaArrayType extends js.Object {
  var id: js.UndefOr[String] = js.native
  var items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType = js.native
  var `type`: array = js.native
}

object JSONSchemaArrayType {
  @scala.inline
  def apply(items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType, `type`: array): JSONSchemaArrayType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaArrayType]
  }
  @scala.inline
  implicit class JSONSchemaArrayTypeOps[Self <: JSONSchemaArrayType] (val x: Self) extends AnyVal {
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
    def setItems(value: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

