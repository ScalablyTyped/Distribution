package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    * The mathematical expression that defines the metric aggregation function. You can specify up to 10 variables per expression. You can specify up to 10 functions per expression.  For more information, see Quotas in the IoT SiteWise User Guide.
    */
  var expression: Expression
  
  /**
    * The processing configuration for the given metric property. You can configure metrics to be computed at the edge or in the Amazon Web Services Cloud. By default, metrics are forwarded to the cloud.
    */
  var processingConfig: js.UndefOr[MetricProcessingConfig] = js.undefined
  
  /**
    * The list of variables used in the expression.
    */
  var variables: ExpressionVariables
  
  /**
    * The window (time interval) over which IoT SiteWise computes the metric's aggregation expression. IoT SiteWise computes one data point per window.
    */
  var window: MetricWindow
}
object Metric {
  
  inline def apply(expression: Expression, variables: ExpressionVariables, window: MetricWindow): Metric = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  extension [Self <: Metric](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfig(value: MetricProcessingConfig): Self = StObject.set(x, "processingConfig", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigUndefined: Self = StObject.set(x, "processingConfig", js.undefined)
    
    inline def setVariables(value: ExpressionVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: ExpressionVariable*): Self = StObject.set(x, "variables", js.Array(value*))
    
    inline def setWindow(value: MetricWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
