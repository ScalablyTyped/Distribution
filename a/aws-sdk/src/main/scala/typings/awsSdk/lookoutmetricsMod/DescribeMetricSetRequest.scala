package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricSetRequest extends StObject {
  
  /**
    * The ARN of the dataset.
    */
  var MetricSetArn: Arn
}
object DescribeMetricSetRequest {
  
  inline def apply(MetricSetArn: Arn): DescribeMetricSetRequest = {
    val __obj = js.Dynamic.literal(MetricSetArn = MetricSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetricSetRequest]
  }
  
  extension [Self <: DescribeMetricSetRequest](x: Self) {
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
  }
}
