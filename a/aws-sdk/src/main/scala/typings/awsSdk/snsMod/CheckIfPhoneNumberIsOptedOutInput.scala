package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
  /**
    * The phone number for which you want to check the opt out status.
    */
  var phoneNumber: PhoneNumber = js.native
}

object CheckIfPhoneNumberIsOptedOutInput {
  @scala.inline
  def apply(phoneNumber: PhoneNumber): CheckIfPhoneNumberIsOptedOutInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
  }
  @scala.inline
  implicit class CheckIfPhoneNumberIsOptedOutInputOps[Self <: CheckIfPhoneNumberIsOptedOutInput] (val x: Self) extends AnyVal {
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

