package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttributeDescription extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.elbMod.AttributeName] = js.native
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[typings.awsSdk.elbMod.AttributeValue] = js.native
}

object PolicyAttributeDescription {
  @scala.inline
  def apply(): PolicyAttributeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttributeDescription]
  }
  @scala.inline
  implicit class PolicyAttributeDescriptionOps[Self <: PolicyAttributeDescription] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: AttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    @scala.inline
    def setAttributeValue(value: AttributeValue): Self = this.set("AttributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("AttributeValue", js.undefined)
  }
  
}

