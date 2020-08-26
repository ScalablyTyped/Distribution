package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveTapeArchiveOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the retrieved virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object RetrieveTapeArchiveOutput {
  @scala.inline
  def apply(): RetrieveTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveTapeArchiveOutput]
  }
  @scala.inline
  implicit class RetrieveTapeArchiveOutputOps[Self <: RetrieveTapeArchiveOutput] (val x: Self) extends AnyVal {
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

