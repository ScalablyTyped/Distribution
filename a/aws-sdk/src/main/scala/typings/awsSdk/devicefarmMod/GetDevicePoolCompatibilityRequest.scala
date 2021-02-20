package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevicePoolCompatibilityRequest extends StObject {
  
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
  implicit class GetDevicePoolCompatibilityRequestMutableBuilder[Self <: GetDevicePoolCompatibilityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppArn(value: AmazonResourceName): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ScheduleRunConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setDevicePoolArn(value: AmazonResourceName): Self = StObject.set(x, "devicePoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: ScheduleRunTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestType(value: TestType): Self = StObject.set(x, "testType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTypeUndefined: Self = StObject.set(x, "testType", js.undefined)
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
