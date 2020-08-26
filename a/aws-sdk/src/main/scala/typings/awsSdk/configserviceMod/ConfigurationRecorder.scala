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
  def apply(): ConfigurationRecorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorder]
  }
  @scala.inline
  implicit class ConfigurationRecorderOps[Self <: ConfigurationRecorder] (val x: Self) extends AnyVal {
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
    def setName(value: RecorderName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRecordingGroup(value: RecordingGroup): Self = this.set("recordingGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingGroup: Self = this.set("recordingGroup", js.undefined)
    @scala.inline
    def setRoleARN(value: String): Self = this.set("roleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARN: Self = this.set("roleARN", js.undefined)
  }
  
}

