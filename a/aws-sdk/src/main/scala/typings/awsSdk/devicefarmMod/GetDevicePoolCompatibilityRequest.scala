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
  def apply(
    devicePoolArn: AmazonResourceName,
    appArn: AmazonResourceName = null,
    configuration: ScheduleRunConfiguration = null,
    test: ScheduleRunTest = null,
    testType: TestType = null
  ): GetDevicePoolCompatibilityRequest = {
    val __obj = js.Dynamic.literal(devicePoolArn = devicePoolArn.asInstanceOf[js.Any])
    if (appArn != null) __obj.updateDynamic("appArn")(appArn.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (testType != null) __obj.updateDynamic("testType")(testType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolCompatibilityRequest]
  }
}

