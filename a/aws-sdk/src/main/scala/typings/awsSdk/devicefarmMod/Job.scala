package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
  /**
    * The job's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The job's result counters.
    */
  var counters: js.UndefOr[Counters] = js.native
  
  /**
    * When the job was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  
  /**
    * The device (phone or tablet).
    */
  var device: js.UndefOr[Device] = js.native
  
  /**
    * Represents the total (metered or unmetered) minutes used by the job.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  
  /**
    * The ARN of the instance.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * A message about the job's result.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The job's name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The job's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  
  /**
    * The job's start time.
    */
  var started: js.UndefOr[DateTime] = js.native
  
  /**
    * The job's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    * The job's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.native
  
  /**
    * The job's type. Allowed values include the following:   BUILTIN_FUZZ   BUILTIN_EXPLORER. For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.   APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.native
  
  /**
    * This value is set to true if video capture is enabled. Otherwise, it is set to false.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.native
  
  /**
    * The endpoint for streaming device video.
    */
  var videoEndpoint: js.UndefOr[String] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = StObject.set(x, "deviceMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMinutesUndefined: Self = StObject.set(x, "deviceMinutes", js.undefined)
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: AmazonResourceName): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
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
    
    @scala.inline
    def setVideoCapture(value: VideoCapture): Self = StObject.set(x, "videoCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCaptureUndefined: Self = StObject.set(x, "videoCapture", js.undefined)
    
    @scala.inline
    def setVideoEndpoint(value: String): Self = StObject.set(x, "videoEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEndpointUndefined: Self = StObject.set(x, "videoEndpoint", js.undefined)
  }
}
