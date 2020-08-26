package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartApplicationRequest extends js.Object {
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts reading the streaming source associated with the input. You can also specify where in the streaming source you want Amazon Kinesis Analytics to start reading.
    */
  var InputConfigurations: typings.awsSdk.kinesisanalyticsMod.InputConfigurations = js.native
}

object StartApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, InputConfigurations: InputConfigurations): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], InputConfigurations = InputConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  @scala.inline
  implicit class StartApplicationRequestOps[Self <: StartApplicationRequest] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputConfigurationsVarargs(value: InputConfiguration*): Self = this.set("InputConfigurations", js.Array(value :_*))
    @scala.inline
    def setInputConfigurations(value: InputConfigurations): Self = this.set("InputConfigurations", value.asInstanceOf[js.Any])
  }
  
}

