package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anomaly extends js.Object {
  
  /**
    *  A list of the instances of the detected anomalies during the requested period. 
    */
  var instances: AnomalyInstances = js.native
  
  /**
    *  Details about the metric that the analysis used when it detected the anomaly. The metric includes the name of the frame that was analyzed with the type and thread states used to derive the metric value for that frame. 
    */
  var metric: Metric = js.native
  
  /**
    * The reason for which metric was flagged as anomalous.
    */
  var reason: String = js.native
}
object Anomaly {
  
  @scala.inline
  def apply(instances: AnomalyInstances, metric: Metric, reason: String): Anomaly = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anomaly]
  }
  
  @scala.inline
  implicit class AnomalyOps[Self <: Anomaly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstancesVarargs(value: AnomalyInstance*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: AnomalyInstances): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: Metric): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
