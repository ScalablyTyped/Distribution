package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
  
  /**
    * Indicates whether the phone number is opted out:    true – The phone number is opted out, meaning you cannot publish SMS messages to it.    false – The phone number is opted in, meaning you can publish SMS messages to it.  
    */
  var isOptedOut: js.UndefOr[Boolean] = js.native
}
object CheckIfPhoneNumberIsOptedOutResponse {
  
  @scala.inline
  def apply(): CheckIfPhoneNumberIsOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
  }
  
  @scala.inline
  implicit class CheckIfPhoneNumberIsOptedOutResponseOps[Self <: CheckIfPhoneNumberIsOptedOutResponse] (val x: Self) extends AnyVal {
    
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
    def setIsOptedOut(value: Boolean): Self = this.set("isOptedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOptedOut: Self = this.set("isOptedOut", js.undefined)
  }
}
