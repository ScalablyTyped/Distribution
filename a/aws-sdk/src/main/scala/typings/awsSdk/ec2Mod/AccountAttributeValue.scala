package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttributeValue extends js.Object {
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.native
}

object AccountAttributeValue {
  @scala.inline
  def apply(): AccountAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributeValue]
  }
  @scala.inline
  implicit class AccountAttributeValueOps[Self <: AccountAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeValue(value: String): Self = this.set("AttributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("AttributeValue", js.undefined)
  }
  
}

