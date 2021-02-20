package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HPOObjective extends StObject {
  
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  
  /**
    * A regular expression for finding the metric in the training job logs.
    */
  var metricRegex: js.UndefOr[MetricRegex] = js.native
  
  /**
    * The type of the metric. Valid values are Maximize and Minimize.
    */
  var `type`: js.UndefOr[HPOObjectiveType] = js.native
}
object HPOObjective {
  
  @scala.inline
  def apply(): HPOObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOObjective]
  }
  
  @scala.inline
  implicit class HPOObjectiveMutableBuilder[Self <: HPOObjective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setMetricRegex(value: MetricRegex): Self = StObject.set(x, "metricRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricRegexUndefined: Self = StObject.set(x, "metricRegex", js.undefined)
    
    @scala.inline
    def setType(value: HPOObjectiveType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
