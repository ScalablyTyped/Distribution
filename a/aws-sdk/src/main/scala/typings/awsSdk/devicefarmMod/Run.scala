package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Run extends js.Object {
  
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have unmetered device slots, you must set this to unmetered to use them. Otherwise, the run is counted toward metered device minutes. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  
  /**
    * The total number of completed jobs.
    */
  var completedJobs: js.UndefOr[Integer] = js.native
  
  /**
    * The run's result counters.
    */
  var counters: js.UndefOr[Counters] = js.native
  
  /**
    * When the run was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  
  /**
    * Output CustomerArtifactPaths object for the test run.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.native
  
  /**
    * Represents the total (metered or unmetered) minutes used by the test run.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  
  /**
    * The ARN of the device pool for the run.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The results of a device filter used to select the devices for a test run.
    */
  var deviceSelectionResult: js.UndefOr[DeviceSelectionResult] = js.native
  
  /**
    * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
    */
  var eventCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of minutes the job executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * A message about the run's result.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The run's name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The network profile being used for a test run.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
  
  /**
    * Read-only URL for an object in an S3 bucket where you can get the parsing results of the test package. If the test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
    */
  var parsingResultUrl: js.UndefOr[String] = js.native
  
  /**
    * The run's platform. Allowed values include:   ANDROID   IOS  
    */
  var platform: js.UndefOr[DevicePlatform] = js.native
  
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.native
  
  /**
    * The run's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  
  /**
    * Supporting field for the result field. Set only if result is SKIPPED. PARSING_FAILED if the result is skipped because of test package parsing failure.
    */
  var resultCode: js.UndefOr[ExecutionResultCode] = js.native
  
  /**
    * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical event sequences.
    */
  var seed: js.UndefOr[Integer] = js.native
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  
  /**
    * The run's start time.
    */
  var started: js.UndefOr[DateTime] = js.native
  
  /**
    * The run's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    * The run's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.native
  
  /**
    * The ARN of the YAML-formatted test specification for the run.
    */
  var testSpecArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The total number of jobs for the run.
    */
  var totalJobs: js.UndefOr[Integer] = js.native
  
  /**
    * The run's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER  For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.native
  
  /**
    * The Device Farm console URL for the recording of the run.
    */
  var webUrl: js.UndefOr[String] = js.native
}
object Run {
  
  @scala.inline
  def apply(): Run = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Run]
  }
  
  @scala.inline
  implicit class RunOps[Self <: Run] (val x: Self) extends AnyVal {
    
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
    def setAppUpload(value: AmazonResourceName): Self = this.set("appUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUpload: Self = this.set("appUpload", js.undefined)
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = this.set("billingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingMethod: Self = this.set("billingMethod", js.undefined)
    
    @scala.inline
    def setCompletedJobs(value: Integer): Self = this.set("completedJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedJobs: Self = this.set("completedJobs", js.undefined)
    
    @scala.inline
    def setCounters(value: Counters): Self = this.set("counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounters: Self = this.set("counters", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCustomerArtifactPaths(value: CustomerArtifactPaths): Self = this.set("customerArtifactPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerArtifactPaths: Self = this.set("customerArtifactPaths", js.undefined)
    
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = this.set("deviceMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMinutes: Self = this.set("deviceMinutes", js.undefined)
    
    @scala.inline
    def setDevicePoolArn(value: AmazonResourceName): Self = this.set("devicePoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePoolArn: Self = this.set("devicePoolArn", js.undefined)
    
    @scala.inline
    def setDeviceSelectionResult(value: DeviceSelectionResult): Self = this.set("deviceSelectionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSelectionResult: Self = this.set("deviceSelectionResult", js.undefined)
    
    @scala.inline
    def setEventCount(value: Integer): Self = this.set("eventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCount: Self = this.set("eventCount", js.undefined)
    
    @scala.inline
    def setJobTimeoutMinutes(value: JobTimeoutMinutes): Self = this.set("jobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTimeoutMinutes: Self = this.set("jobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkProfile(value: NetworkProfile): Self = this.set("networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfile: Self = this.set("networkProfile", js.undefined)
    
    @scala.inline
    def setParsingResultUrl(value: String): Self = this.set("parsingResultUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsingResultUrl: Self = this.set("parsingResultUrl", js.undefined)
    
    @scala.inline
    def setPlatform(value: DevicePlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRadios(value: Radios): Self = this.set("radios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadios: Self = this.set("radios", js.undefined)
    
    @scala.inline
    def setResult(value: ExecutionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setResultCode(value: ExecutionResultCode): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCode: Self = this.set("resultCode", js.undefined)
    
    @scala.inline
    def setSeed(value: Integer): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: SkipAppResign): Self = this.set("skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAppResign: Self = this.set("skipAppResign", js.undefined)
    
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
    def setTestSpecArn(value: AmazonResourceName): Self = this.set("testSpecArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSpecArn: Self = this.set("testSpecArn", js.undefined)
    
    @scala.inline
    def setTotalJobs(value: Integer): Self = this.set("totalJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalJobs: Self = this.set("totalJobs", js.undefined)
    
    @scala.inline
    def setType(value: TestType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
}
