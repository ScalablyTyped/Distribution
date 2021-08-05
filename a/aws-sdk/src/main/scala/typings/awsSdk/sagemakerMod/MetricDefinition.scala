package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDefinition extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: MetricName
  
  /**
    * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see Defining Objective Metrics.
    */
  var Regex: MetricRegex
}
object MetricDefinition {
  
  inline def apply(Name: MetricName, Regex: MetricRegex): MetricDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Regex = Regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDefinition]
  }
  
  extension [Self <: MetricDefinition](x: Self) {
    
    inline def setName(value: MetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: MetricRegex): Self = StObject.set(x, "Regex", value.asInstanceOf[js.Any])
  }
}
