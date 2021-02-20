package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleRunTest extends StObject {
  
  /**
    * The test's filter.
    */
  var filter: js.UndefOr[Filter] = js.native
  
  /**
    * The test's parameters, such as test framework parameters and fixture settings. Parameters are represented by name-value pairs of strings. For all tests:    app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to false to disable it.   For Calabash tests:   profile: A cucumber profile (for example, my_profile_name).   tags: You can limit execution to features or scenarios that have (or don't have) certain tags (for example, @smoke or @smoke,~@wip).   For Appium tests (all types):   appium_version: The Appium version. Currently supported values are 1.6.5 (and later), latest, and default.   latest runs the latest Appium version supported by Device Farm (1.9.1).   For default, Device Farm selects a compatible version of Appium for the device. The current behavior is to run 1.7.2 on Android devices and iOS 9 and earlier and 1.7.2 for iOS 10 and later.   This behavior is subject to change.     For fuzz tests (Android only):   event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.   throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.   seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical event sequences.   For Explorer tests:   username: A user name to use if the Explorer encounters a login form. If not supplied, no user name is inserted.   password: A password to use if the Explorer encounters a login form. If not supplied, no password is inserted.   For Instrumentation:   filter: A test filter string. Examples:   Running a single test case: com.android.abc.Test1    Running a single test: com.android.abc.Test1#smoke    Running multiple tests: com.android.abc.Test1,com.android.abc.Test2      For XCTest and XCTestUI:   filter: A test filter string. Examples:   Running a single test class: LoginTests    Running a multiple test classes: LoginTests,SmokeTests    Running a single test: LoginTests/testValid    Running multiple tests: LoginTests/testValid,LoginTests/testInvalid      For UIAutomator:   filter: A test filter string. Examples:   Running a single test case: com.android.abc.Test1    Running a single test: com.android.abc.Test1#smoke    Running multiple tests: com.android.abc.Test1,com.android.abc.Test2     
    */
  var parameters: js.UndefOr[TestParameters] = js.native
  
  /**
    * The ARN of the uploaded test to be run.
    */
  var testPackageArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The ARN of the YAML-formatted test specification.
    */
  var testSpecArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The test's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER. For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: TestType = js.native
}
object ScheduleRunTest {
  
  @scala.inline
  def apply(`type`: TestType): ScheduleRunTest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunTest]
  }
  
  @scala.inline
  implicit class ScheduleRunTestMutableBuilder[Self <: ScheduleRunTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setParameters(value: TestParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setTestPackageArn(value: AmazonResourceName): Self = StObject.set(x, "testPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPackageArnUndefined: Self = StObject.set(x, "testPackageArn", js.undefined)
    
    @scala.inline
    def setTestSpecArn(value: AmazonResourceName): Self = StObject.set(x, "testSpecArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSpecArnUndefined: Self = StObject.set(x, "testSpecArn", js.undefined)
    
    @scala.inline
    def setType(value: TestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
