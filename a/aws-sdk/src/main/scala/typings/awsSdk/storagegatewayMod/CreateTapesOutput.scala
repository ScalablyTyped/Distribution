package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTapesOutput extends js.Object {
  /**
    * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
    */
  var TapeARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARNs] = js.native
}

object CreateTapesOutput {
  @scala.inline
  def apply(): CreateTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapesOutput]
  }
  @scala.inline
  implicit class CreateTapesOutputOps[Self <: CreateTapesOutput] (val x: Self) extends AnyVal {
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
    def setTapeARNsVarargs(value: TapeARN*): Self = this.set("TapeARNs", js.Array(value :_*))
    @scala.inline
    def setTapeARNs(value: TapeARNs): Self = this.set("TapeARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeARNs: Self = this.set("TapeARNs", js.undefined)
  }
  
}

