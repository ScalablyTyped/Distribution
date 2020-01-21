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
}

