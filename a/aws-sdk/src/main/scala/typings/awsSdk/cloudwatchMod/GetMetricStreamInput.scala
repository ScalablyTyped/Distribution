package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricStreamInput extends StObject {
  
  /**
    * The name of the metric stream to retrieve information about.
    */
  var Name: MetricStreamName
}
object GetMetricStreamInput {
  
  inline def apply(Name: MetricStreamName): GetMetricStreamInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricStreamInput]
  }
  
  extension [Self <: GetMetricStreamInput](x: Self) {
    
    inline def setName(value: MetricStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
