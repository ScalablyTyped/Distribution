package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    appUpload: AmazonResourceName = null,
    arn: AmazonResourceName = null,
    billingMethod: BillingMethod = null,
    completedJobs: js.UndefOr[Integer] = js.undefined,
    counters: Counters = null,
    created: DateTime = null,
    customerArtifactPaths: CustomerArtifactPaths = null,
    deviceMinutes: DeviceMinutes = null,
    devicePoolArn: AmazonResourceName = null,
    deviceSelectionResult: DeviceSelectionResult = null,
    eventCount: js.UndefOr[Integer] = js.undefined,
    jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
    locale: String = null,
    location: Location = null,
    message: Message = null,
    name: Name = null,
    networkProfile: NetworkProfile = null,
    parsingResultUrl: String = null,
    platform: DevicePlatform = null,
    radios: Radios = null,
    result: ExecutionResult = null,
    resultCode: ExecutionResultCode = null,
    seed: js.UndefOr[Integer] = js.undefined,
    skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
    started: DateTime = null,
    status: ExecutionStatus = null,
    stopped: DateTime = null,
    testSpecArn: AmazonResourceName = null,
    totalJobs: js.UndefOr[Integer] = js.undefined,
    `type`: TestType = null,
    webUrl: String = null
  ): Run = {
    val __obj = js.Dynamic.literal()
    if (appUpload != null) __obj.updateDynamic("appUpload")(appUpload.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(completedJobs)) __obj.updateDynamic("completedJobs")(completedJobs.get.asInstanceOf[js.Any])
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customerArtifactPaths != null) __obj.updateDynamic("customerArtifactPaths")(customerArtifactPaths.asInstanceOf[js.Any])
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes.asInstanceOf[js.Any])
    if (devicePoolArn != null) __obj.updateDynamic("devicePoolArn")(devicePoolArn.asInstanceOf[js.Any])
    if (deviceSelectionResult != null) __obj.updateDynamic("deviceSelectionResult")(deviceSelectionResult.asInstanceOf[js.Any])
    if (!js.isUndefined(eventCount)) __obj.updateDynamic("eventCount")(eventCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jobTimeoutMinutes)) __obj.updateDynamic("jobTimeoutMinutes")(jobTimeoutMinutes.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    if (parsingResultUrl != null) __obj.updateDynamic("parsingResultUrl")(parsingResultUrl.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (radios != null) __obj.updateDynamic("radios")(radios.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (resultCode != null) __obj.updateDynamic("resultCode")(resultCode.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign.get.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped.asInstanceOf[js.Any])
    if (testSpecArn != null) __obj.updateDynamic("testSpecArn")(testSpecArn.asInstanceOf[js.Any])
    if (!js.isUndefined(totalJobs)) __obj.updateDynamic("totalJobs")(totalJobs.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Run]
  }
}

