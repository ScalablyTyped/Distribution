package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationRecorder extends js.Object {
  /**
    * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the configuration recorder. You cannot change the assigned name.
    */
  var name: js.UndefOr[RecorderName] = js.native
  /**
    * Specifies the types of AWS resources for which AWS Config records configuration changes.
    */
  var recordingGroup: js.UndefOr[RecordingGroup] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
    */
  var roleARN: js.UndefOr[String] = js.native
}

object ConfigurationRecorder {
  @scala.inline
  def apply(name: RecorderName = null, recordingGroup: RecordingGroup = null, roleARN: String = null): ConfigurationRecorder = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recordingGroup != null) __obj.updateDynamic("recordingGroup")(recordingGroup.asInstanceOf[js.Any])
    if (roleARN != null) __obj.updateDynamic("roleARN")(roleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRecorder]
  }
}

