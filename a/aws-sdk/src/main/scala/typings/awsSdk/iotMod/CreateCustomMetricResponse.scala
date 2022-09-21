package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomMetricResponse extends StObject {
  
  /**
    *  The Amazon Resource Number (ARN) of the custom metric. For example, arn:aws-partition:iot:region:accountId:custommetric/metricName  
    */
  var metricArn: js.UndefOr[CustomMetricArn] = js.undefined
  
  /**
    *  The name of the custom metric to be used in the metric report. 
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
}
object CreateCustomMetricResponse {
  
  inline def apply(): CreateCustomMetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomMetricResponse]
  }
  
  extension [Self <: CreateCustomMetricResponse](x: Self) {
    
    inline def setMetricArn(value: CustomMetricArn): Self = StObject.set(x, "metricArn", value.asInstanceOf[js.Any])
    
    inline def setMetricArnUndefined: Self = StObject.set(x, "metricArn", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
