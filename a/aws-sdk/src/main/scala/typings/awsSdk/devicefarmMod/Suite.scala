package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suite extends StObject {
  
  /**
    * The suite's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The suite's result counters.
    */
  var counters: js.UndefOr[Counters] = js.undefined
  
  /**
    * When the suite was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Represents the total (metered or unmetered) minutes used by the test suite.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined
  
  /**
    * A message about the suite's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * The suite's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The suite's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  
  /**
    * The suite's start time.
    */
  var started: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The suite's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
  
  /**
    * The suite's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The suite's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER   Only available for Android; an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.undefined
}
object Suite {
  
  @scala.inline
  def apply(): Suite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suite]
  }
  
  @scala.inline
  implicit class SuiteMutableBuilder[Self <: Suite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCounters(value: Counters): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = StObject.set(x, "deviceMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMinutesUndefined: Self = StObject.set(x, "deviceMinutes", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setStarted(value: DateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStopped(value: DateTime): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
    
    @scala.inline
    def setType(value: TestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
