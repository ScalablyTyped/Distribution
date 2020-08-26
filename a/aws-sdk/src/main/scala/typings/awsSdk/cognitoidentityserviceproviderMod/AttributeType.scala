package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeType extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: AttributeNameType = js.native
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValueType] = js.native
}

object AttributeType {
  @scala.inline
  def apply(Name: AttributeNameType): AttributeType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeType]
  }
  @scala.inline
  implicit class AttributeTypeOps[Self <: AttributeType] (val x: Self) extends AnyVal {
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
    def setName(value: AttributeNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: AttributeValueType): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

