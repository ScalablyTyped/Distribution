package typings.awsSyntheticsPuppeteer

import org.scalablytyped.runtime.Shortcut
import typings.awsSyntheticsPuppeteer.anon.Args
import typings.awsSyntheticsPuppeteer.requestResponseLogHelperMod.RequestResponseLogHelper
import typings.awsSyntheticsPuppeteer.syntheticsConfigurationMod.SyntheticsConfiguration
import typings.awsSyntheticsPuppeteer.syntheticsMetricEmitterMod.SyntheticsMetricEmitter
import typings.awsSyntheticsPuppeteer.syntheticsReportMod.RequestsResult
import typings.awsSyntheticsPuppeteer.syntheticsReportMod.ScreenshotResult
import typings.awsSyntheticsPuppeteer.syntheticsReportMod.SyntheticsReport
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsMod extends Shortcut {
  
  @JSImport("Synthetics", JSImport.Namespace)
  @js.native
  val ^ : Synthetics = js.native
  
  /**
    * The Synthetics library for Synthetics UI canaries.
    *
    * This API serves as a contract between the Synthetics UI canary service and external canary writers.
    *
    * This API must remain backwards compatible forever.
    *
    * The primary behavior of this library is to act like a JUnit or TestNG test running framework combined with a
    * Puppeteer browser launcher to facilitate monitoring UIs using custom health checks run from AWS Lambdas
    * on a continuous and scheduled basis. (Managed UI Canaries)
    */
  @js.native
  trait Synthetics extends StObject {
    
    var ARN_SERVICE_NAME: String = js.native
    
    var USER_AGENT_SERVICE_NAME_PREFIX: String = js.native
    
    var _artifactLocation: String = js.native
    
    var _artifactUploadError: Any = js.native
    
    var _browser: Browser = js.native
    
    var _canaryArn: String = js.native
    
    var _canaryId: String = js.native
    
    var _canaryName: String = js.native
    
    var _canaryRunId: Any = js.native
    
    var _canaryUserAgentString: String = js.native
    
    var _executionError: Any = js.native
    
    var _executionStatus: String = js.native
    
    var _har: Any = js.native
    
    var _harContent: Any = js.native
    
    var _harRegion: String = js.native
    
    var _invocationTime: js.Date = js.native
    
    var _metricEmitter: SyntheticsMetricEmitter = js.native
    
    var _page: Page = js.native
    
    var _requestResponseLogHelper: RequestResponseLogHelper = js.native
    
    var _requestsResult: RequestsResult = js.native
    
    var _s3BaseFilePath: Any = js.native
    
    var _stepCount: Double = js.native
    
    var _stepErrors: js.Array[Any] = js.native
    
    var _stoppedAtStepFailure: Boolean = js.native
    
    var _syntheticsConfiguration: SyntheticsConfiguration = js.native
    
    var _syntheticsReport: SyntheticsReport = js.native
    
    var _uiCanary: Boolean = js.native
    
    var _verboseLogging: Boolean = js.native
    
    def addExecutionError(errorMessage: Any, ex: Any): Unit = js.native
    
    def addReport(report: Any): Unit = js.native
    
    def addUserAgent(page: Page, userAgentString: String): js.Promise[Unit] = js.native
    
    def afterCanary(canaryStatus: Any, canaryError: Any): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: js.Date): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: js.Date, endTime: js.Date): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: js.Date, endTime: js.Date, resetTime: Double): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: js.Date, endTime: Unit, resetTime: Double): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: Unit, endTime: js.Date): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: Unit, endTime: js.Date, resetTime: Double): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(canaryStatus: Any, canaryError: Any, startTime: Unit, endTime: Unit, resetTime: Double): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[String] = js.native
    def afterCanary(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[String] = js.native
    
    def beforeCanary(): js.Promise[Unit] = js.native
    
    def beforeScript(): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def completeHttpStep(
      stepName: String,
      stepId: String,
      stepStatus: Any,
      failureReason: Any,
      stepStartTime: Any,
      stepEndTime: Any,
      canaryStepResult: Any,
      stepConfiguration: Any
    ): js.Promise[Unit] = js.native
    
    def createCanaryArn(awsPartition: String, region: String, awsAccountId: String, canaryName: String): String = js.native
    def createCanaryArn(awsPartition: String, region: String, awsAccountId: String, canaryName: String, canaryId: String): String = js.native
    
    def createExecutionReport(canaryStatus: Any, canaryError: Any, metricsPublished: Any): js.Promise[Unit] = js.native
    def createExecutionReport(canaryStatus: Any, canaryError: Any, metricsPublished: Any, startTime: js.Date): js.Promise[Unit] = js.native
    def createExecutionReport(canaryStatus: Any, canaryError: Any, metricsPublished: Any, startTime: js.Date, endTime: js.Date): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(canaryStatus: Any, canaryError: Any, metricsPublished: Any, startTime: Unit, endTime: js.Date): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    def createExecutionReport(
      canaryStatus: Any,
      canaryError: Any,
      metricsPublished: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): js.Promise[Unit] = js.native
    
    /**
      * Execute HTTP step using provided request configuration with start/succeed/fail logging and metrics
      *
      * Logs start timer,
      * Invoke http or https module request function based on protocol
      * End timer when response/error is received
      * Invokes passed callback funtion if provided, else invokes default callback.
      * Log pass/fail, add reporting configuration,
      * Emits pass/fail metrics, events, and step duration metrics,
      *
      * @param stepName Name of the step. If null, step name will be constructed based on the request
      * @param requestOptions, {String | URL | Object} Can be url string, URL object or Node http/https module request options,
      *        See https://nodejs.org/api/http.html#http_http_request_url_options_callback.
      *        Pass request data using aditional 'body' parameter in options
      * @param callback Function is invoked with response <http.IncomingMessage> received from http call.
      * @param stepConfig Optional Step config key-value pairs
      */
    def executeHttpStep(): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Any, callback: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Any, callback: Any, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Any, callback: Unit, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Unit, callback: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Unit, callback: Any, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: String, requestOptions: Unit, callback: Unit, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Any, callback: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Any, callback: Any, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Any, callback: Unit, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Unit, callback: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Unit, callback: Any, stepConfig: Any): js.Promise[Unit] = js.native
    def executeHttpStep(stepName: Null, requestOptions: Unit, callback: Unit, stepConfig: Any): js.Promise[Unit] = js.native
    
    /**
      * Execute the provided step, wrapping it with start/succeed/fail logging, screen shots, metrics
      * and eventually events
      *
      * Log start, screen shot,
      * start timer,
      * execute function,
      * then end timer (pass or fail),
      * log pass/fail, screen shot pass/fail,
      * emit pass/fail metrics, events, and step duration metrics,
      * then return returnValue on success and throw exception on fail
      * @param stepConfig Optional Step config key-value pairs
      */
    def executeStep(stepName: String, functionToExecute: js.Function0[js.Promise[Unit]]): js.Promise[Any] = js.native
    def executeStep(stepName: String, functionToExecute: js.Function0[js.Promise[Unit]], stepConfig: Any): js.Promise[Any] = js.native
    
    /**
      * Log step failed with current url and exception, take step failed screen shot
      * @param stepName
      * @param error
      */
    def failStep(stepName: String, error: Any, stepConfiguration: Any): js.Promise[Unit] = js.native
    
    def getCanaryArn(): String = js.native
    
    def getCanaryId(): String = js.native
    
    def getCanaryName(): String = js.native
    
    def getCanaryUserAgentString(): String = js.native
    
    /**
      * Returns global syntheticsConfiguration instance.
      */
    def getConfiguration(): SyntheticsConfiguration = js.native
    
    def getDefaultLaunchOptions(): js.Promise[Args] = js.native
    
    def getErrorString(error: String): String = js.native
    def getErrorString(error: js.Error): String = js.native
    
    def getHttpRequestOptions(requestOptions: Any): Any = js.native
    
    def getLaunchOptions(options: Any): js.Promise[Any] = js.native
    
    def getLogLevel(): Double = js.native
    
    def getPage(): Page = js.native
    
    def getRequestResponseLogHelper(): RequestResponseLogHelper = js.native
    
    def getReturnValue(canaryStatus: Any, canaryError: Any): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: js.Date): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: js.Date, endTime: js.Date): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: js.Date, endTime: js.Date, resetTime: Double): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: js.Date, endTime: Unit, resetTime: Double): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: js.Date,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: Unit, endTime: js.Date): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: Unit, endTime: js.Date, resetTime: Double): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: js.Date,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(canaryStatus: Any, canaryError: Any, startTime: Unit, endTime: Unit, resetTime: Double): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Double,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Double,
      launchTime: Double
    ): String = js.native
    def getReturnValue(
      canaryStatus: Any,
      canaryError: Any,
      startTime: Unit,
      endTime: Unit,
      resetTime: Unit,
      setupTime: Unit,
      launchTime: Double
    ): String = js.native
    
    def getRuntimeVersion(): String = js.native
    
    def getScreenshotResult(stepName: String): js.Array[ScreenshotResult] = js.native
    
    def getStepErrors(): js.Array[Any] = js.native
    
    def getUrl(): String = js.native
    
    def isLambdaExecutionEnv(): Boolean = js.native
    
    def launch(): js.Promise[Unit] = js.native
    def launch(options: js.Object): js.Promise[Unit] = js.native
    
    def publishResult(result: Any, startTime: js.Date, endTime: js.Date, stepName: String, stepConfiguration: Any): js.Promise[Boolean] = js.native
    
    def publishStepResult(
      result: Any,
      startTime: js.Date,
      endTime: js.Date,
      stepName: String,
      canaryStepResult: Any,
      stepConfiguration: Any
    ): js.Promise[Unit] = js.native
    
    /**
      * On Lambda warm starts, we might have the same NodeJS process running with this same instantiated class
      * already created. Reset all the this._* variables that should be reset between Lambda invocations.
      * You could also .reset() Synthetics in the middle of an invocation if you liked.
      */
    def reset(): js.Promise[Unit] = js.native
    
    def setEventAndContext(event: Any, context: Any): js.Promise[Unit] = js.native
    
    def setHarContent(harContent: Any): Unit = js.native
    
    def setLogLevel(logLevel: Double): Unit = js.native
    
    /**
      * Use as a builder pattern for setting the request/response logging flags
      * Example: setRequestResponseLogHelper().withLogRequestHeaders(true).withLogResponseHeaders(true);
      */
    def setRequestResponseLogHelper(): RequestResponseLogHelper = js.native
    
    def setVerboseLogging(verboseLogging: Boolean): Unit = js.native
    
    def setupPageEvents(page: Any): js.Promise[Unit] = js.native
    
    /**
      * Log step start with current url, take step start screen shot
      */
    def startStep(stepName: String, stepConfiguration: Any, canaryStepResult: Any): js.Promise[Unit] = js.native
    
    /**
      * Log step succeeded with current url, take step succeeded screen shot
      * @param stepName
      */
    def succeedStep(stepName: String, stepConfiguration: Any): js.Promise[Unit] = js.native
    
    /**
      *  Takes screenshot of current page and uploads it to S3
      *  @returns fileName and page url of screenshot
      */
    def takeScreenshot(stepName: String): js.Promise[ScreenshotResult] = js.native
    def takeScreenshot(stepName: String, suffix: String): js.Promise[ScreenshotResult] = js.native
    
    def uploadArtifacts(artifacts: Any): js.Promise[Unit] = js.native
    
    def writeHar(): js.Promise[Unit] = js.native
  }
  
  type _To = Synthetics
  
  /* This means you don't have to write `^`, but can instead just say `syntheticsMod.foo` */
  override def _to: Synthetics = ^
}
