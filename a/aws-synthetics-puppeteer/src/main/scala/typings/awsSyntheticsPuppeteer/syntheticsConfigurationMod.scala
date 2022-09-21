package typings.awsSyntheticsPuppeteer

import typings.awsSyntheticsPuppeteer.anon.ContinueOnHttpStepFailure
import typings.awsSyntheticsPuppeteer.anon.IncludeRequestBody
import typings.awsSyntheticsPuppeteer.anon.ScreenshotOnStepFailure
import typings.awsSyntheticsPuppeteer.anon.StepDurationMetric
import typings.awsSyntheticsPuppeteer.anon.`2xxMetric`
import typings.awsSyntheticsPuppeteer.anon.`4xxMetric`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsConfigurationMod {
  
  /**
    * Class to configure parameters in Synthetics
    */
  @JSImport("SyntheticsConfiguration", "SyntheticsConfiguration")
  @js.native
  open class SyntheticsConfiguration () extends StObject {
    
    var canaryMetricsConfiguration: `2xxMetric` = js.native
    
    def disableAggregatedRequestMetric(): Unit = js.native
    
    def disableReportingOptions(): Unit = js.native
    
    def disableRequestMetrics(): Unit = js.native
    
    def disableStepMetrics(): Unit = js.native
    
    def disableStepScreenshots(): Unit = js.native
    
    def enableAggregatedRequestMetric(): Unit = js.native
    
    def enableReportingOptions(): Unit = js.native
    
    def enableRequestMetrics(): Unit = js.native
    
    def enableStepMetrics(): Unit = js.native
    
    def enableStepScreenshots(): Unit = js.native
    
    var executionConfiguration: ContinueOnHttpStepFailure = js.native
    
    def get2xxMetric(): Boolean = js.native
    
    def get4xxMetric(): Boolean = js.native
    
    def get5xxMetric(): Boolean = js.native
    
    def getAggregated2xxMetric(): Boolean = js.native
    
    def getAggregated4xxMetric(): Boolean = js.native
    
    def getAggregated5xxMetric(): Boolean = js.native
    
    def getAggregatedFailedCanaryMetric(): Boolean = js.native
    
    def getAggregatedFailedRequestsMetric(): Boolean = js.native
    
    def getAllConfigurations(): `4xxMetric` = js.native
    
    def getConfig(configName: Any): Any = js.native
    
    def getContinueOnHttpStepFailure(): Boolean = js.native
    
    def getContinueOnStepFailure(): Boolean = js.native
    
    def getFailedCanaryMetric(): Boolean = js.native
    
    def getFailedRequestsMetric(): Boolean = js.native
    
    def getIncludeRequestBody(): Boolean = js.native
    
    def getIncludeRequestHeaders(): Boolean = js.native
    
    def getIncludeResponseBody(): Boolean = js.native
    
    def getIncludeResponseHeaders(): Boolean = js.native
    
    def getRestrictedHeaders(): js.Array[Any] = js.native
    
    def getScreenshotOnStepFailure(): Boolean = js.native
    
    def getScreenshotOnStepStart(): Boolean = js.native
    
    def getScreenshotOnStepSuccess(): Boolean = js.native
    
    def getStepConfiguration(stepConfigOptions: Any): SyntheticsConfiguration = js.native
    
    def getStepDurationMetric(): Boolean = js.native
    
    def getStepSuccessMetric(): Boolean = js.native
    
    var reportingConfiguration: IncludeRequestBody = js.native
    
    def reset(): Unit = js.native
    
    var screenshotConfiguration: ScreenshotOnStepFailure = js.native
    
    def setConfig(): Unit = js.native
    def setConfig(options: js.Object): Unit = js.native
    
    var stepMetricsConfiguration: StepDurationMetric = js.native
    
    def with2xxMetric(_2xxMetric: Any): SyntheticsConfiguration = js.native
    
    def with4xxMetric(_4xxMetric: Any): SyntheticsConfiguration = js.native
    
    def with5xxMetric(_5xxMetric: Any): SyntheticsConfiguration = js.native
    
    def withAggregated2xxMetric(aggregated2xxMetric: Any): SyntheticsConfiguration = js.native
    
    def withAggregated4xxMetric(aggregated4xxMetric: Any): SyntheticsConfiguration = js.native
    
    def withAggregated5xxMetric(aggregated5xxMetric: Any): SyntheticsConfiguration = js.native
    
    def withAggregatedFailedCanaryMetric(aggregatedFailedCanaryMetric: Any): SyntheticsConfiguration = js.native
    
    def withAggregatedFailedRequestsMetric(aggregatedFailedRequestsMetric: Any): SyntheticsConfiguration = js.native
    
    def withContinueOnHttpStepFailure(continueOnHttpStepFailure: Any): SyntheticsConfiguration = js.native
    
    def withContinueOnStepFailure(continueOnStepFailure: Any): SyntheticsConfiguration = js.native
    
    def withFailedCanaryMetric(failedCanaryMetric: Any): SyntheticsConfiguration = js.native
    
    def withFailedRequestsMetric(failedRequestsMetric: Any): SyntheticsConfiguration = js.native
    
    def withIncludeRequestBody(includeRequestBody: Any): SyntheticsConfiguration = js.native
    
    def withIncludeRequestHeaders(includeRequestHeaders: Any): SyntheticsConfiguration = js.native
    
    def withIncludeResponseBody(includeResponseBody: Any): SyntheticsConfiguration = js.native
    
    def withIncludeResponseHeaders(includeResponseHeaders: Any): SyntheticsConfiguration = js.native
    
    def withRestrictedHeaders(restrictedHeaders: Any): SyntheticsConfiguration = js.native
    
    def withScreenshotOnStepFailure(screenshotOnStepFailure: Any): SyntheticsConfiguration = js.native
    
    def withScreenshotOnStepStart(screenshotOnStepStart: Any): SyntheticsConfiguration = js.native
    
    def withScreenshotOnStepSuccess(screenshotOnStepSuccess: Any): SyntheticsConfiguration = js.native
    
    def withStepDurationMetric(stepDurationMetric: Any): SyntheticsConfiguration = js.native
    
    def withStepSuccessMetric(stepSuccessMetric: Any): SyntheticsConfiguration = js.native
  }
}
