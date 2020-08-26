package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyDifference extends js.Object {
  /**
    * The actual property value of the resource property.
    */
  var ActualValue: PropertyValue = js.native
  /**
    * The type of property difference.    ADD: A value has been added to a resource property that is an array or list data type.    REMOVE: The property has been removed from the current resource configuration.    NOT_EQUAL: The current property value differs from its expected value (as defined in the stack template and any values specified as template parameters).  
    */
  var DifferenceType: typings.awsSdk.cloudformationMod.DifferenceType = js.native
  /**
    * The expected property value of the resource property, as defined in the stack template and any values specified as template parameters.
    */
  var ExpectedValue: PropertyValue = js.native
  /**
    * The fully-qualified path to the resource property.
    */
  var PropertyPath: typings.awsSdk.cloudformationMod.PropertyPath = js.native
}

object PropertyDifference {
  @scala.inline
  def apply(
    ActualValue: PropertyValue,
    DifferenceType: DifferenceType,
    ExpectedValue: PropertyValue,
    PropertyPath: PropertyPath
  ): PropertyDifference = {
    val __obj = js.Dynamic.literal(ActualValue = ActualValue.asInstanceOf[js.Any], DifferenceType = DifferenceType.asInstanceOf[js.Any], ExpectedValue = ExpectedValue.asInstanceOf[js.Any], PropertyPath = PropertyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDifference]
  }
  @scala.inline
  implicit class PropertyDifferenceOps[Self <: PropertyDifference] (val x: Self) extends AnyVal {
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
    def setActualValue(value: PropertyValue): Self = this.set("ActualValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDifferenceType(value: DifferenceType): Self = this.set("DifferenceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedValue(value: PropertyValue): Self = this.set("ExpectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyPath(value: PropertyPath): Self = this.set("PropertyPath", value.asInstanceOf[js.Any])
  }
  
}

