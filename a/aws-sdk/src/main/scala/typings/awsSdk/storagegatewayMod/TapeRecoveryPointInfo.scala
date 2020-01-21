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
  def apply(
    TapeARN: TapeARN = null,
    TapeRecoveryPointTime: Time = null,
    TapeSizeInBytes: Int | Double = null,
    TapeStatus: TapeRecoveryPointStatus = null
  ): TapeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    if (TapeRecoveryPointTime != null) __obj.updateDynamic("TapeRecoveryPointTime")(TapeRecoveryPointTime.asInstanceOf[js.Any])
    if (TapeSizeInBytes != null) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes.asInstanceOf[js.Any])
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapeRecoveryPointInfo]
  }
}

