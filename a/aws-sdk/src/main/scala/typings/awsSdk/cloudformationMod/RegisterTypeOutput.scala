package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTypeOutput extends js.Object {
  /**
    * The identifier for this registration request. Use this registration token when calling  DescribeTypeRegistration , which returns information about the status and IDs of the type registration. 
    */
  var RegistrationToken: js.UndefOr[typings.awsSdk.cloudformationMod.RegistrationToken] = js.native
}

object RegisterTypeOutput {
  @scala.inline
  def apply(): RegisterTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTypeOutput]
  }
  @scala.inline
  implicit class RegisterTypeOutputOps[Self <: RegisterTypeOutput] (val x: Self) extends AnyVal {
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
    def setRegistrationToken(value: RegistrationToken): Self = this.set("RegistrationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationToken: Self = this.set("RegistrationToken", js.undefined)
  }
  
}

