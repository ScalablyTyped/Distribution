package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleRunRequest extends js.Object {
  /**
    * The ARN of an application package to run tests against, created with CreateUpload. See ListUploads.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the settings for the run to be scheduled.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.native
  /**
    * The ARN of the device pool for the run to be scheduled.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The filter criteria used to dynamically select a set of devices for a test run and the maximum number of devices to be included in the run. Either  devicePoolArn  or  deviceSelectionConfiguration  is required in a request.
    */
  var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.native
  /**
    * Specifies configuration information about a test run, such as the execution timeout (in minutes).
    */
  var executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.native
  /**
    * The name for the run to be scheduled.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The ARN of the project for the run to be scheduled.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * Information about the test for the run to be scheduled.
    */
  var test: ScheduleRunTest = js.native
}

object ScheduleRunRequest {
  @scala.inline
  def apply(projectArn: AmazonResourceName, test: ScheduleRunTest): ScheduleRunRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunRequest]
  }
  @scala.inline
  implicit class ScheduleRunRequestOps[Self <: ScheduleRunRequest] (val x: Self) extends AnyVal {
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
    def setProjectArn(value: AmazonResourceName): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: ScheduleRunTest): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppArn(value: AmazonResourceName): Self = this.set("appArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppArn: Self = this.set("appArn", js.undefined)
    @scala.inline
    def setConfiguration(value: ScheduleRunConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setDevicePoolArn(value: AmazonResourceName): Self = this.set("devicePoolArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePoolArn: Self = this.set("devicePoolArn", js.undefined)
    @scala.inline
    def setDeviceSelectionConfiguration(value: DeviceSelectionConfiguration): Self = this.set("deviceSelectionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceSelectionConfiguration: Self = this.set("deviceSelectionConfiguration", js.undefined)
    @scala.inline
    def setExecutionConfiguration(value: ExecutionConfiguration): Self = this.set("executionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionConfiguration: Self = this.set("executionConfiguration", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

