package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The state of the instance as a 16-bit unsigned integer.  The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535. These numerical values are used for internal purposes and should be ignored. The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.  The valid values for instance-state-code will all be in the range of the low byte and they are:    0 : pending     16 : running     32 : shutting-down     48 : terminated     64 : stopping     80 : stopped    You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
    */
  var Code: js.UndefOr[Integer] = js.native
  /**
    * The current state of the instance.
    */
  var Name: js.UndefOr[InstanceStateName] = js.native
}

object InstanceState {
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  @scala.inline
  implicit class InstanceStateOps[Self <: InstanceState] (val x: Self) extends AnyVal {
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
    def setCode(value: Integer): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setName(value: InstanceStateName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

