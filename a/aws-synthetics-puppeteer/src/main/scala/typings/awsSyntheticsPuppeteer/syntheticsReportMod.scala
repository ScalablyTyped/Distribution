package typings.awsSyntheticsPuppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsReportMod {
  
  @JSImport("SyntheticsReport", "CanaryResult")
  @js.native
  open class CanaryResult () extends StObject {
    
    def addReport(report: Any): Unit = js.native
    
    def addStep(stepResult: Any): CanaryResult = js.native
    
    var endTime: Any = js.native
    
    var failureReason: Any = js.native
    
    def getEndTime(): Any = js.native
    
    def getFailureReason(): Any = js.native
    
    def getReports(): js.Array[Any] = js.native
    
    def getStartTime(): Any = js.native
    
    def getStatus(): String = js.native
    
    def getStepsResult(): js.Array[Any] = js.native
    
    var metricsPublished: Boolean = js.native
    
    var reports: js.Array[Any] = js.native
    
    var requests: RequestsResult = js.native
    
    def reset(): Unit = js.native
    
    var startTime: Any = js.native
    
    var status: String = js.native
    
    var steps: js.Array[Any] = js.native
    
    def withCanaryStatus(status: Any): CanaryResult = js.native
    
    def withEndTime(endTime: Any): CanaryResult = js.native
    
    def withFailureReason(failureReason: Any): CanaryResult = js.native
    
    def withMetricsPublished(metricsPublished: Any): CanaryResult = js.native
    
    def withRequestsResult(requestsResult: Any): CanaryResult = js.native
    
    def withStartTime(startTime: Any): CanaryResult = js.native
    
    def withStepsResult(stepResult: Any): CanaryResult = js.native
  }
  
  object CanaryStatus {
    
    @JSImport("SyntheticsReport", "CanaryStatus.FAILED")
    @js.native
    val FAILED: String = js.native
    
    @JSImport("SyntheticsReport", "CanaryStatus.NO_RESULT_1")
    @js.native
    val NO_RESULT_1: String = js.native
    
    @JSImport("SyntheticsReport", "CanaryStatus.PASSED")
    @js.native
    val PASSED: String = js.native
  }
  
  object ExecutionStatus {
    
    @JSImport("SyntheticsReport", "ExecutionStatus.FAIL_RESULT")
    @js.native
    val FAIL_RESULT: String = js.native
    
    @JSImport("SyntheticsReport", "ExecutionStatus.NO_RESULT")
    @js.native
    val NO_RESULT: String = js.native
    
    @JSImport("SyntheticsReport", "ExecutionStatus.PASS_RESULT")
    @js.native
    val PASS_RESULT: String = js.native
  }
  
  @JSImport("SyntheticsReport", "HttpStepResult")
  @js.native
  open class HttpStepResult ()
    extends StObject
       with CanaryStepResult {
    
    /* CompleteClass */
    var endTime: Any = js.native
    
    /* CompleteClass */
    var failureReason: Any = js.native
    
    /* CompleteClass */
    override def getEndTime(): Any = js.native
    
    /* CompleteClass */
    override def getFailureReason(): Any = js.native
    
    def getHttpRequestNum(): Any = js.native
    
    /* CompleteClass */
    override def getMetricsPublished(): Boolean = js.native
    
    /* CompleteClass */
    override def getStartTime(): Any = js.native
    
    /* CompleteClass */
    override def getStatus(): Any = js.native
    
    /* CompleteClass */
    override def getStepName(): Any = js.native
    
    /* CompleteClass */
    override def getStepNum(): Any = js.native
    
    var httpRequestNum: Any = js.native
    
    /* CompleteClass */
    var metricsPublished: Boolean = js.native
    
    /* CompleteClass */
    var startTime: Any = js.native
    
    /* CompleteClass */
    var status: Any = js.native
    
    /* CompleteClass */
    var stepName: Any = js.native
    
    /* CompleteClass */
    var stepNum: Any = js.native
    
    /* CompleteClass */
    override def withEndTime(endTime: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withFailureReason(failureReason: Any): CanaryStepResult = js.native
    
    def withHttpRequestNum(httpRequestNum: Any): HttpStepResult = js.native
    
    /* CompleteClass */
    override def withMetricsPublished(metricsPublished: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStartTime(startTime: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStepName(stepName: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStepNum(stepNum: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStepStatus(stepStatus: Any): CanaryStepResult = js.native
  }
  
  @JSImport("SyntheticsReport", "RequestsResult")
  @js.native
  open class RequestsResult () extends StObject {
    
    var _2xx: Double = js.native
    
    var _3xx: Double = js.native
    
    var _4xx: Double = js.native
    
    var _5xx: Double = js.native
    
    var failed: Double = js.native
    
    def getErrorRequests(): Double = js.native
    
    def getFailedRequests(): Double = js.native
    
    def getFaultRequests(): Double = js.native
    
    def getRedirectedRequests(): Double = js.native
    
    def getSuccessfulRequests(): Double = js.native
    
    def incrementErrorRequests(): Unit = js.native
    
    def incrementFailedRequests(): Unit = js.native
    
    def incrementFaultRequests(): Unit = js.native
    
    def incrementRedirectedRequests(): Unit = js.native
    
    def incrementSuccessfulRequests(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("SyntheticsReport", "ScreenshotResult")
  @js.native
  open class ScreenshotResult () extends StObject {
    
    var error: Any = js.native
    
    var fileName: Any = js.native
    
    def getError(): Any = js.native
    
    def getFileName(): Any = js.native
    
    def getPageUrl(): Any = js.native
    
    var pageUrl: Any = js.native
    
    def withError(error: Any): ScreenshotResult = js.native
    
    def withFileName(fileName: Any): ScreenshotResult = js.native
    
    def withPageUrl(pageUrl: Any): ScreenshotResult = js.native
  }
  
  @JSImport("SyntheticsReport", "StepResult")
  @js.native
  open class StepResult ()
    extends StObject
       with CanaryStepResult {
    
    var destinationUrl: Any = js.native
    
    /* CompleteClass */
    var endTime: Any = js.native
    
    /* CompleteClass */
    var failureReason: Any = js.native
    
    def getDestinationUrl(): Any = js.native
    
    /* CompleteClass */
    override def getEndTime(): Any = js.native
    
    /* CompleteClass */
    override def getFailureReason(): Any = js.native
    
    /* CompleteClass */
    override def getMetricsPublished(): Boolean = js.native
    
    def getScreenshots(): js.Array[Any] = js.native
    
    def getSourceUrl(): Any = js.native
    
    /* CompleteClass */
    override def getStartTime(): Any = js.native
    
    /* CompleteClass */
    override def getStatus(): Any = js.native
    
    /* CompleteClass */
    override def getStepName(): Any = js.native
    
    /* CompleteClass */
    override def getStepNum(): Any = js.native
    
    /* CompleteClass */
    var metricsPublished: Boolean = js.native
    
    var screenshots: js.Array[Any] = js.native
    
    var sourceUrl: Any = js.native
    
    /* CompleteClass */
    var startTime: Any = js.native
    
    /* CompleteClass */
    var status: Any = js.native
    
    /* CompleteClass */
    var stepName: Any = js.native
    
    /* CompleteClass */
    var stepNum: Any = js.native
    
    def withDestinationUrl(destinationUrl: Any): StepResult = js.native
    
    /* CompleteClass */
    override def withEndTime(endTime: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withFailureReason(failureReason: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withMetricsPublished(metricsPublished: Any): CanaryStepResult = js.native
    
    def withScreenshotResult(screenshots: Any): StepResult = js.native
    
    def withSourceUrl(sourceUrl: Any): StepResult = js.native
    
    /* CompleteClass */
    override def withStartTime(startTime: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStepName(stepName: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStepNum(stepNum: Any): CanaryStepResult = js.native
    
    /* CompleteClass */
    override def withStepStatus(stepStatus: Any): CanaryStepResult = js.native
  }
  
  @JSImport("SyntheticsReport", "SyntheticsReport")
  @js.native
  open class SyntheticsReport () extends StObject {
    
    def addReport(report: Any): Unit = js.native
    
    def addStep(stepResult: Any): Unit = js.native
    
    var canaryName: Any = js.native
    
    var customerScript: CanaryResult = js.native
    
    var endTime: Any = js.native
    
    var executionError: Any = js.native
    
    var executionStatus: String = js.native
    
    def getCanaryName(): Any = js.native
    
    def getCanaryResult(): CanaryResult = js.native
    
    def getConfiguration(): js.Object = js.native
    
    def getEndTime(): Any = js.native
    
    def getReports(): js.Array[Any] = js.native
    
    def getStartTime(): Any = js.native
    
    def getTimeSpentInLaunch(): Any = js.native
    
    def getTimeSpentInReset(): Any = js.native
    
    def getTimeSpentInSetUp(): Any = js.native
    
    def reset(): Unit = js.native
    
    var startTime: Any = js.native
    
    var timeSpentInLaunchInMs: Any = js.native
    
    var timeSpentInResetInMs: Any = js.native
    
    var timeSpentInSetUpInMs: Any = js.native
    
    def withCanaryName(canaryName: Any): SyntheticsReport = js.native
    
    def withCanaryResult(canaryResult: Any): SyntheticsReport = js.native
    
    def withConfiguration(configuration: Any): Unit = js.native
    
    def withEndTime(endTime: Any): SyntheticsReport = js.native
    
    def withExecutionError(error: Any): SyntheticsReport = js.native
    
    def withExecutionStatus(status: Any): SyntheticsReport = js.native
    
    def withStartTime(startTime: Any): SyntheticsReport = js.native
    
    def withTimeSpentInLaunch(timeSpentInLaunchInMs: Any): SyntheticsReport = js.native
    
    def withTimeSpentInReset(timeSpentInResetInMs: Any): SyntheticsReport = js.native
    
    def withTimeSpentInSetUp(timeSpentInSetUpInMs: Any): SyntheticsReport = js.native
  }
  
  trait CanaryStepResult extends StObject {
    
    var endTime: Any
    
    var failureReason: Any
    
    def getEndTime(): Any
    
    def getFailureReason(): Any
    
    def getMetricsPublished(): Boolean
    
    def getStartTime(): Any
    
    def getStatus(): Any
    
    def getStepName(): Any
    
    def getStepNum(): Any
    
    var metricsPublished: Boolean
    
    var startTime: Any
    
    var status: Any
    
    var stepName: Any
    
    var stepNum: Any
    
    def withEndTime(endTime: Any): CanaryStepResult
    
    def withFailureReason(failureReason: Any): CanaryStepResult
    
    def withMetricsPublished(metricsPublished: Any): CanaryStepResult
    
    def withStartTime(startTime: Any): CanaryStepResult
    
    def withStepName(stepName: Any): CanaryStepResult
    
    def withStepNum(stepNum: Any): CanaryStepResult
    
    def withStepStatus(stepStatus: Any): CanaryStepResult
  }
  object CanaryStepResult {
    
    inline def apply(
      endTime: Any,
      failureReason: Any,
      getEndTime: () => Any,
      getFailureReason: () => Any,
      getMetricsPublished: () => Boolean,
      getStartTime: () => Any,
      getStatus: () => Any,
      getStepName: () => Any,
      getStepNum: () => Any,
      metricsPublished: Boolean,
      startTime: Any,
      status: Any,
      stepName: Any,
      stepNum: Any,
      withEndTime: Any => CanaryStepResult,
      withFailureReason: Any => CanaryStepResult,
      withMetricsPublished: Any => CanaryStepResult,
      withStartTime: Any => CanaryStepResult,
      withStepName: Any => CanaryStepResult,
      withStepNum: Any => CanaryStepResult,
      withStepStatus: Any => CanaryStepResult
    ): CanaryStepResult = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], getEndTime = js.Any.fromFunction0(getEndTime), getFailureReason = js.Any.fromFunction0(getFailureReason), getMetricsPublished = js.Any.fromFunction0(getMetricsPublished), getStartTime = js.Any.fromFunction0(getStartTime), getStatus = js.Any.fromFunction0(getStatus), getStepName = js.Any.fromFunction0(getStepName), getStepNum = js.Any.fromFunction0(getStepNum), metricsPublished = metricsPublished.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], stepNum = stepNum.asInstanceOf[js.Any], withEndTime = js.Any.fromFunction1(withEndTime), withFailureReason = js.Any.fromFunction1(withFailureReason), withMetricsPublished = js.Any.fromFunction1(withMetricsPublished), withStartTime = js.Any.fromFunction1(withStartTime), withStepName = js.Any.fromFunction1(withStepName), withStepNum = js.Any.fromFunction1(withStepNum), withStepStatus = js.Any.fromFunction1(withStepStatus))
      __obj.asInstanceOf[CanaryStepResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanaryStepResult] (val x: Self) extends AnyVal {
      
      inline def setEndTime(value: Any): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setFailureReason(value: Any): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      inline def setGetEndTime(value: () => Any): Self = StObject.set(x, "getEndTime", js.Any.fromFunction0(value))
      
      inline def setGetFailureReason(value: () => Any): Self = StObject.set(x, "getFailureReason", js.Any.fromFunction0(value))
      
      inline def setGetMetricsPublished(value: () => Boolean): Self = StObject.set(x, "getMetricsPublished", js.Any.fromFunction0(value))
      
      inline def setGetStartTime(value: () => Any): Self = StObject.set(x, "getStartTime", js.Any.fromFunction0(value))
      
      inline def setGetStatus(value: () => Any): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      inline def setGetStepName(value: () => Any): Self = StObject.set(x, "getStepName", js.Any.fromFunction0(value))
      
      inline def setGetStepNum(value: () => Any): Self = StObject.set(x, "getStepNum", js.Any.fromFunction0(value))
      
      inline def setMetricsPublished(value: Boolean): Self = StObject.set(x, "metricsPublished", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStepName(value: Any): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
      
      inline def setStepNum(value: Any): Self = StObject.set(x, "stepNum", value.asInstanceOf[js.Any])
      
      inline def setWithEndTime(value: Any => CanaryStepResult): Self = StObject.set(x, "withEndTime", js.Any.fromFunction1(value))
      
      inline def setWithFailureReason(value: Any => CanaryStepResult): Self = StObject.set(x, "withFailureReason", js.Any.fromFunction1(value))
      
      inline def setWithMetricsPublished(value: Any => CanaryStepResult): Self = StObject.set(x, "withMetricsPublished", js.Any.fromFunction1(value))
      
      inline def setWithStartTime(value: Any => CanaryStepResult): Self = StObject.set(x, "withStartTime", js.Any.fromFunction1(value))
      
      inline def setWithStepName(value: Any => CanaryStepResult): Self = StObject.set(x, "withStepName", js.Any.fromFunction1(value))
      
      inline def setWithStepNum(value: Any => CanaryStepResult): Self = StObject.set(x, "withStepNum", js.Any.fromFunction1(value))
      
      inline def setWithStepStatus(value: Any => CanaryStepResult): Self = StObject.set(x, "withStepStatus", js.Any.fromFunction1(value))
    }
  }
}
