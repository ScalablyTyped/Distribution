package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchemaArrayType extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.array
}

object JSONSchemaArrayType {
  @scala.inline
  def apply(
    items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType,
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.array,
    id: java.lang.String = null
  ): JSONSchemaArrayType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[JSONSchemaArrayType]
  }
}

