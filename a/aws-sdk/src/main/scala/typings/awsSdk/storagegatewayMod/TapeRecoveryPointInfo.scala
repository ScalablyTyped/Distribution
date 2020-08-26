package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeRecoveryPointInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The time when the point-in-time view of the virtual tape was replicated for later recovery. The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var TapeRecoveryPointTime: js.UndefOr[Time] = js.native
  /**
    * The size, in bytes, of the virtual tapes to recover.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The status of the virtual tapes.
    */
  var TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.native
}

object TapeRecoveryPointInfo {
  @scala.inline
  def apply(): TapeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeRecoveryPointInfo]
  }
  @scala.inline
  implicit class TapeRecoveryPointInfoOps[Self <: TapeRecoveryPointInfo] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTapeRecoveryPointTime(value: Time): Self = this.set("TapeRecoveryPointTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeRecoveryPointTime: Self = this.set("TapeRecoveryPointTime", js.undefined)
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = this.set("TapeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeSizeInBytes: Self = this.set("TapeSizeInBytes", js.undefined)
    @scala.inline
    def setTapeStatus(value: TapeRecoveryPointStatus): Self = this.set("TapeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeStatus: Self = this.set("TapeStatus", js.undefined)
  }
  
}

