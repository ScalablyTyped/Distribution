package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suite extends js.Object {
  
  /**
    * The suite's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The suite's result counters.
    */
  var counters: js.UndefOr[Counters] = js.native
  
  /**
    * When the suite was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  
  /**
    * Represents the total (metered or unmetered) minutes used by the test suite.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  
  /**
    * A message about the suite's result.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The suite's name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The suite's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  
  /**
    * The suite's start time.
    */
  var started: js.UndefOr[DateTime] = js.native
  
  /**
    * The suite's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    * The suite's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.native
  
  /**
    * The suite's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER   Only available for Android; an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.native
}
object Suite {
  
  @scala.inline
  def apply(): Suite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suite]
  }
  
  @scala.inline
  implicit class SuiteOps[Self <: Suite] (val x: Self) extends AnyVal {
    
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCounters(value: Counters): Self = this.set("counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounters: Self = this.set("counters", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = this.set("deviceMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMinutes: Self = this.set("deviceMinutes", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResult(value: ExecutionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setStarted(value: DateTime): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    
    @scala.inline
    def setStatus(value: ExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStopped(value: DateTime): Self = this.set("stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopped: Self = this.set("stopped", js.undefined)
    
    @scala.inline
    def setType(value: TestType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
