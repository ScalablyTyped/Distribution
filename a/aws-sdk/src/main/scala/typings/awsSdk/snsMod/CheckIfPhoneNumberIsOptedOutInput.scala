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
}

