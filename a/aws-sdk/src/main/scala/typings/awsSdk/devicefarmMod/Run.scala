package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Run extends StObject {
  
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have unmetered device slots, you must set this to unmetered to use them. Otherwise, the run is counted toward metered device minutes. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  
  /**
    * The total number of completed jobs.
    */
  var completedJobs: js.UndefOr[Integer] = js.undefined
  
  /**
    * The run's result counters.
    */
  var counters: js.UndefOr[Counters] = js.undefined
  
  /**
    * When the run was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Output CustomerArtifactPaths object for the test run.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined
  
  /**
    * Represents the total (metered or unmetered) minutes used by the test run.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined
  
  /**
    * The ARN of the device pool for the run.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The results of a device filter used to select the devices for a test run.
    */
  var deviceSelectionResult: js.UndefOr[DeviceSelectionResult] = js.undefined
  
  /**
    * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
    */
  var eventCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of minutes the job executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * A message about the run's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * The run's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The network profile being used for a test run.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
  
  /**
    * Read-only URL for an object in an S3 bucket where you can get the parsing results of the test package. If the test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
    */
  var parsingResultUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The run's platform. Allowed values include:   ANDROID   IOS  
    */
  var platform: js.UndefOr[DevicePlatform] = js.undefined
  
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.undefined
  
  /**
    * The run's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  
  /**
    * Supporting field for the result field. Set only if result is SKIPPED. PARSING_FAILED if the result is skipped because of test package parsing failure.
    */
  var resultCode: js.UndefOr[ExecutionResultCode] = js.undefined
  
  /**
    * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical event sequences.
    */
  var seed: js.UndefOr[Integer] = js.undefined
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  
  /**
    * The run's start time.
    */
  var started: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The run's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
  
  /**
    * The run's stop time.
    */
  var stopped: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The ARN of the YAML-formatted test specification for the run.
    */
  var testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The total number of jobs for the run.
    */
  var totalJobs: js.UndefOr[Integer] = js.undefined
  
  /**
    * The run's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER  For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.undefined
  
  /**
    * The Device Farm console URL for the recording of the run.
    */
  var webUrl: js.UndefOr[String] = js.undefined
}
object Run {
  
  inline def apply(): Run = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Run]
  }
  
  extension [Self <: Run](x: Self) {
    
    inline def setAppUpload(value: AmazonResourceName): Self = StObject.set(x, "appUpload", value.asInstanceOf[js.Any])
    
    inline def setAppUploadUndefined: Self = StObject.set(x, "appUpload", js.undefined)
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    inline def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    inline def setCompletedJobs(value: Integer): Self = StObject.set(x, "completedJobs", value.asInstanceOf[js.Any])
    
    inline def setCompletedJobsUndefined: Self = StObject.set(x, "completedJobs", js.undefined)
    
    inline def setCounters(value: Counters): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    inline def setCreated(value: DateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCustomerArtifactPaths(value: CustomerArtifactPaths): Self = StObject.set(x, "customerArtifactPaths", value.asInstanceOf[js.Any])
    
    inline def setCustomerArtifactPathsUndefined: Self = StObject.set(x, "customerArtifactPaths", js.undefined)
    
    inline def setDeviceMinutes(value: DeviceMinutes): Self = StObject.set(x, "deviceMinutes", value.asInstanceOf[js.Any])
    
    inline def setDeviceMinutesUndefined: Self = StObject.set(x, "deviceMinutes", js.undefined)
    
    inline def setDevicePoolArn(value: AmazonResourceName): Self = StObject.set(x, "devicePoolArn", value.asInstanceOf[js.Any])
    
    inline def setDevicePoolArnUndefined: Self = StObject.set(x, "devicePoolArn", js.undefined)
    
    inline def setDeviceSelectionResult(value: DeviceSelectionResult): Self = StObject.set(x, "deviceSelectionResult", value.asInstanceOf[js.Any])
    
    inline def setDeviceSelectionResultUndefined: Self = StObject.set(x, "deviceSelectionResult", js.undefined)
    
    inline def setEventCount(value: Integer): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    inline def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
    
    inline def setJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "jobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutMinutesUndefined: Self = StObject.set(x, "jobTimeoutMinutes", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    inline def setParsingResultUrl(value: String): Self = StObject.set(x, "parsingResultUrl", value.asInstanceOf[js.Any])
    
    inline def setParsingResultUrlUndefined: Self = StObject.set(x, "parsingResultUrl", js.undefined)
    
    inline def setPlatform(value: DevicePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRadios(value: Radios): Self = StObject.set(x, "radios", value.asInstanceOf[js.Any])
    
    inline def setRadiosUndefined: Self = StObject.set(x, "radios", js.undefined)
    
    inline def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: ExecutionResultCode): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "resultCode", js.undefined)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSeed(value: Integer): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setSkipAppResign(value: SkipAppResign): Self = StObject.set(x, "skipAppResign", value.asInstanceOf[js.Any])
    
    inline def setSkipAppResignUndefined: Self = StObject.set(x, "skipAppResign", js.undefined)
    
    inline def setStarted(value: DateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopped(value: DateTime): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
    
    inline def setTestSpecArn(value: AmazonResourceName): Self = StObject.set(x, "testSpecArn", value.asInstanceOf[js.Any])
    
    inline def setTestSpecArnUndefined: Self = StObject.set(x, "testSpecArn", js.undefined)
    
    inline def setTotalJobs(value: Integer): Self = StObject.set(x, "totalJobs", value.asInstanceOf[js.Any])
    
    inline def setTotalJobsUndefined: Self = StObject.set(x, "totalJobs", js.undefined)
    
    inline def setType(value: TestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
