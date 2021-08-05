package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    * The mathematical expression that defines the metric aggregation function. You can specify up to 10 variables per expression. You can specify up to 10 functions per expression.  For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var expression: Expression
  
  /**
    * The list of variables used in the expression.
    */
  var variables: ExpressionVariables
  
  /**
    * The window (time interval) over which AWS IoT SiteWise computes the metric's aggregation expression. AWS IoT SiteWise computes one data point per window.
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
    
    inline def setVariables(value: ExpressionVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: ExpressionVariable*): Self = StObject.set(x, "variables", js.Array(value :_*))
    
    inline def setWindow(value: MetricWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
