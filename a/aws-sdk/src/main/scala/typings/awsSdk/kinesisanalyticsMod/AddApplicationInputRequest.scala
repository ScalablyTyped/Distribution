package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationInputRequest extends js.Object {
  /**
    * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Current version of your Amazon Kinesis Analytics application. You can use the DescribeApplication operation to find the current application version.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * The Input to add.
    */
  var Input: typings.awsSdk.kinesisanalyticsMod.Input = js.native
}

object AddApplicationInputRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, Input: Input): AddApplicationInputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationInputRequest]
  }
  @scala.inline
  implicit class AddApplicationInputRequestOps[Self <: AddApplicationInputRequest] (val x: Self) extends AnyVal {
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
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = this.set("CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Input): Self = this.set("Input", value.asInstanceOf[js.Any])
  }
  
}

