package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignTapePoolOutput extends js.Object {
  /**
    * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object AssignTapePoolOutput {
  @scala.inline
  def apply(): AssignTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignTapePoolOutput]
  }
  @scala.inline
  implicit class AssignTapePoolOutputOps[Self <: AssignTapePoolOutput] (val x: Self) extends AnyVal {
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
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeARN: Self = this.set("TapeARN", js.undefined)
  }
  
}

