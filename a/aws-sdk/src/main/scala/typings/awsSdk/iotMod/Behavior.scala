package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Behavior extends StObject {
  
  /**
    * The criteria that determine if a device is behaving normally in regard to the metric.
    */
  var criteria: js.UndefOr[BehaviorCriteria] = js.native
  
  /**
    * What is measured by the behavior.
    */
  var metric: js.UndefOr[BehaviorMetric] = js.native
  
  /**
    * The dimension for a metric in your behavior. For example, using a TOPIC_FILTER dimension, you can narrow down the scope of the metric only to MQTT topics whose name match the pattern specified in the dimension.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.native
  
  /**
    * The name you have given to the behavior.
    */
  var name: BehaviorName = js.native
}
object Behavior {
  
  @scala.inline
  def apply(name: BehaviorName): Behavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
  
  @scala.inline
  implicit class BehaviorMutableBuilder[Self <: Behavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: BehaviorCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setMetric(value: BehaviorMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDimension(value: MetricDimension): Self = StObject.set(x, "metricDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDimensionUndefined: Self = StObject.set(x, "metricDimension", js.undefined)
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setName(value: BehaviorName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
