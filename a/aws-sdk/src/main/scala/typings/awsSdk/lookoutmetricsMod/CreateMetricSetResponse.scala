package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMetricSetResponse extends StObject {
  
  /**
    * The ARN of the dataset.
    */
  var MetricSetArn: js.UndefOr[Arn] = js.undefined
}
object CreateMetricSetResponse {
  
  inline def apply(): CreateMetricSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMetricSetResponse]
  }
  
  extension [Self <: CreateMetricSetResponse](x: Self) {
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArnUndefined: Self = StObject.set(x, "MetricSetArn", js.undefined)
  }
}
