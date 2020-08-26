package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptInPhoneNumberInput extends js.Object {
  /**
    * The phone number to opt in.
    */
  var phoneNumber: PhoneNumber = js.native
}

object OptInPhoneNumberInput {
  @scala.inline
  def apply(phoneNumber: PhoneNumber): OptInPhoneNumberInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptInPhoneNumberInput]
  }
  @scala.inline
  implicit class OptInPhoneNumberInputOps[Self <: OptInPhoneNumberInput] (val x: Self) extends AnyVal {
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
    def setPhoneNumber(value: PhoneNumber): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
  }
  
}

