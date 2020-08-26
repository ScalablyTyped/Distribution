package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaImageState extends js.Object {
  /**
    * The state. The following are the possible values:    pending - AFI bitstream generation is in progress.    available - The AFI is available for use.    failed - AFI bitstream generation failed.    unavailable - The AFI is no longer available for use.  
    */
  var Code: js.UndefOr[FpgaImageStateCode] = js.native
  /**
    * If the state is failed, this is the error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object FpgaImageState {
  @scala.inline
  def apply(): FpgaImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImageState]
  }
  @scala.inline
  implicit class FpgaImageStateOps[Self <: FpgaImageState] (val x: Self) extends AnyVal {
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
    def setCode(value: FpgaImageStateCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

