package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricWidgetImageOutput extends StObject {
  
  /**
    * The image of the graph, in the output format specified. The output is base64-encoded.
    */
  var MetricWidgetImage: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricWidgetImage] = js.undefined
}
object GetMetricWidgetImageOutput {
  
  inline def apply(): GetMetricWidgetImageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricWidgetImageOutput]
  }
  
  extension [Self <: GetMetricWidgetImageOutput](x: Self) {
    
    inline def setMetricWidgetImage(value: MetricWidgetImage): Self = StObject.set(x, "MetricWidgetImage", value.asInstanceOf[js.Any])
    
    inline def setMetricWidgetImageUndefined: Self = StObject.set(x, "MetricWidgetImage", js.undefined)
  }
}
