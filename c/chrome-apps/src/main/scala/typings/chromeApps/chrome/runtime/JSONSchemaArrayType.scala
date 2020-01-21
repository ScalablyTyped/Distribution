package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchemaArrayType extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType
  var `type`: array
}

object JSONSchemaArrayType {
  @scala.inline
  def apply(
    items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType,
    `type`: array,
    id: String = null
  ): JSONSchemaArrayType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaArrayType]
  }
}

