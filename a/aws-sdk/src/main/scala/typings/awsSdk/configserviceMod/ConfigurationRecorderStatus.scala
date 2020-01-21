package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationRecorderStatus extends js.Object {
  /**
    * The error code indicating that the recording failed.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  /**
    * The message indicating that the recording failed due to an error.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  /**
    * The time the recorder was last started.
    */
  var lastStartTime: js.UndefOr[Date] = js.native
  /**
    * The last (previous) status of the recorder.
    */
  var lastStatus: js.UndefOr[RecorderStatus] = js.native
  /**
    * The time when the status was last changed.
    */
  var lastStatusChangeTime: js.UndefOr[Date] = js.native
  /**
    * The time the recorder was last stopped.
    */
  var lastStopTime: js.UndefOr[Date] = js.native
  /**
    * The name of the configuration recorder.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies whether or not the recorder is currently recording.
    */
  var recording: js.UndefOr[Boolean] = js.native
}

object ConfigurationRecorderStatus {
  @scala.inline
  def apply(
    lastErrorCode: String = null,
    lastErrorMessage: String = null,
    lastStartTime: Date = null,
    lastStatus: RecorderStatus = null,
    lastStatusChangeTime: Date = null,
    lastStopTime: Date = null,
    name: String = null,
    recording: js.UndefOr[scala.Boolean] = js.undefined
  ): ConfigurationRecorderStatus = {
    val __obj = js.Dynamic.literal()
    if (lastErrorCode != null) __obj.updateDynamic("lastErrorCode")(lastErrorCode.asInstanceOf[js.Any])
    if (lastErrorMessage != null) __obj.updateDynamic("lastErrorMessage")(lastErrorMessage.asInstanceOf[js.Any])
    if (lastStartTime != null) __obj.updateDynamic("lastStartTime")(lastStartTime.asInstanceOf[js.Any])
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (lastStatusChangeTime != null) __obj.updateDynamic("lastStatusChangeTime")(lastStatusChangeTime.asInstanceOf[js.Any])
    if (lastStopTime != null) __obj.updateDynamic("lastStopTime")(lastStopTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(recording)) __obj.updateDynamic("recording")(recording.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRecorderStatus]
  }
}

