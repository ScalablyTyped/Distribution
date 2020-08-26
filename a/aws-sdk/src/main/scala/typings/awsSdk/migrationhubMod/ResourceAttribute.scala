package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAttribute extends js.Object {
  /**
    * Type of resource.
    */
  var Type: ResourceAttributeType = js.native
  /**
    * Value of the resource type.
    */
  var Value: ResourceAttributeValue = js.native
}

object ResourceAttribute {
  @scala.inline
  def apply(Type: ResourceAttributeType, Value: ResourceAttributeValue): ResourceAttribute = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttribute]
  }
  @scala.inline
  implicit class ResourceAttributeOps[Self <: ResourceAttribute] (val x: Self) extends AnyVal {
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
    def setType(value: ResourceAttributeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ResourceAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

