package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolCompatibilityRequest extends js.Object {
  /**
    * The ARN of the app that is associated with the specified device pool.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * An object that contains information about the settings for a run.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.native
  /**
    * The device pool's ARN.
    */
  var devicePoolArn: AmazonResourceName = js.native
  /**
    * Information about the uploaded test to be run against the device pool.
    */
  var test: js.UndefOr[ScheduleRunTest] = js.native
  /**
    * The test type for the specified device pool. Allowed values include the following:   BUILTIN_FUZZ.   BUILTIN_EXPLORER. For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT.   APPIUM_JAVA_TESTNG.   APPIUM_PYTHON.   APPIUM_NODE.   APPIUM_RUBY.   APPIUM_WEB_JAVA_JUNIT.   APPIUM_WEB_JAVA_TESTNG.   APPIUM_WEB_PYTHON.   APPIUM_WEB_NODE.   APPIUM_WEB_RUBY.   CALABASH.   INSTRUMENTATION.   UIAUTOMATION.   UIAUTOMATOR.   XCTEST.   XCTEST_UI.  
    */
  var testType: js.UndefOr[TestType] = js.native
}

object GetDevicePoolCompatibilityRequest {
  @scala.inline
  def apply(devicePoolArn: AmazonResourceName): GetDevicePoolCompatibilityRequest = {
    val __obj = js.Dynamic.literal(devicePoolArn = devicePoolArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolCompatibilityRequest]
  }
  @scala.inline
  implicit class GetDevicePoolCompatibilityRequestOps[Self <: GetDevicePoolCompatibilityRequest] (val x: Self) extends AnyVal {
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
    def setDevicePoolArn(value: AmazonResourceName): Self = this.set("devicePoolArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppArn(value: AmazonResourceName): Self = this.set("appArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppArn: Self = this.set("appArn", js.undefined)
    @scala.inline
    def setConfiguration(value: ScheduleRunConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setTest(value: ScheduleRunTest): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setTestType(value: TestType): Self = this.set("testType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestType: Self = this.set("testType", js.undefined)
  }
  
}

