package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

