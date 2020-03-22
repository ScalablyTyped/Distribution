package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOption extends js.Object {
  var categoryValues: js.Array[CategoryValue]
  var defaultValue: String
  var description: String
  var displayName: String
  var groupName: String
  var isIdentity: Boolean
  var isRequired: Boolean
  var name: String
  var specialValueType: ConnectionOptionSpecialType
  var valueType: ServiceOptionType
}

object ConnectionOption {
  @scala.inline
  def apply(
    categoryValues: js.Array[CategoryValue],
    defaultValue: String,
    description: String,
    displayName: String,
    groupName: String,
    isIdentity: Boolean,
    isRequired: Boolean,
    name: String,
    specialValueType: ConnectionOptionSpecialType,
    valueType: ServiceOptionType
  ): ConnectionOption = {
    val __obj = js.Dynamic.literal(categoryValues = categoryValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], specialValueType = specialValueType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionOption]
  }
}

