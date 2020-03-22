package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOption extends js.Object {
  var categoryValues: js.Array[CategoryValue]
  var defaultValue: String
  var description: String
  var displayName: String
  var groupName: String
  var isArray: Boolean
  var isRequired: Boolean
  var name: String
  var objectType: String
  var valueType: ServiceOptionType
}

object ServiceOption {
  @scala.inline
  def apply(
    categoryValues: js.Array[CategoryValue],
    defaultValue: String,
    description: String,
    displayName: String,
    groupName: String,
    isArray: Boolean,
    isRequired: Boolean,
    name: String,
    objectType: String,
    valueType: ServiceOptionType
  ): ServiceOption = {
    val __obj = js.Dynamic.literal(categoryValues = categoryValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceOption]
  }
}

