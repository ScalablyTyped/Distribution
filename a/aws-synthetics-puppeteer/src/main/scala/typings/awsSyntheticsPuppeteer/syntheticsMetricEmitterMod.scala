package typings.awsSyntheticsPuppeteer

import typings.awsSyntheticsPuppeteer.anon.Dimensions
import typings.awsSyntheticsPuppeteer.anon.MetricName
import typings.awsSyntheticsPuppeteer.syntheticsConfigurationMod.SyntheticsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsMetricEmitterMod {
  
  @JSImport("SyntheticsMetricEmitter", "SyntheticsMetricEmitter")
  @js.native
  open class SyntheticsMetricEmitter () extends StObject {
    
    var _awsCloudWatchClient: Any = js.native
    
    var _namespace: String = js.native
    
    var _syntheticsConfiguration: SyntheticsConfiguration = js.native
    
    def configure(namespace: Any, syntheticsConfiguration: Any): Unit = js.native
    
    def getAwsAccountLevelMetricParameters(namespace: Any, metricName: Any, value: Any, unit: Any, date: Any): MetricName = js.native
    
    def getCanaryLevelMetricParameters(namespace: Any, metricName: Any, value: Any, unit: Any, date: Any, canaryName: Any): Dimensions = js.native
    
    def getCanaryStepLevelMetricParameters(namespace: Any, metricName: Any, value: Any, unit: Any, date: Any, canaryName: Any, stepName: Any): Dimensions = js.native
    
    def publishResult(
      canaryName: Any,
      result: Any,
      startDateTimeInUTC: js.Date,
      endDateTimeInUTC: js.Date,
      timestamp: js.Date,
      stepName: Any,
      requestsResult: Any,
      stepConfiguration: Any
    ): js.Promise[Boolean] = js.native
    
    def putMetric(params: Any): js.Promise[Unit] = js.native
    
    def setNamespace(namespace: Any): Unit = js.native
  }
}
