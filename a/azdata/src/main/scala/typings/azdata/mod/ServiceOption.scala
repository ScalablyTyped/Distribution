package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOption extends js.Object {
  var categoryValues: js.Array[CategoryValue] = js.native
  var defaultValue: String = js.native
  var description: String = js.native
  var displayName: String = js.native
  var groupName: String = js.native
  var isArray: Boolean = js.native
  var isRequired: Boolean = js.native
  var name: String = js.native
  var objectType: String = js.native
  var valueType: ServiceOptionType = js.native
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
  @scala.inline
  implicit class ServiceOptionOps[Self <: ServiceOption] (val x: Self) extends AnyVal {
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
    def setCategoryValuesVarargs(value: CategoryValue*): Self = this.set("categoryValues", js.Array(value :_*))
    @scala.inline
    def setCategoryValues(value: js.Array[CategoryValue]): Self = this.set("categoryValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueType(value: ServiceOptionType): Self = this.set("valueType", value.asInstanceOf[js.Any])
  }
  
}

