package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutMetricDataInput extends js.Object {
  /**
    * The data for the metric. The array can include no more than 20 metrics per call.
    */
  var MetricData: typings.awsSdk.cloudwatchMod.MetricData = js.native
  /**
    * The namespace for the metric data. To avoid conflicts with AWS service namespaces, you should not specify a namespace that begins with AWS/ 
    */
  var Namespace: typings.awsSdk.cloudwatchMod.Namespace = js.native
}

object PutMetricDataInput {
  @scala.inline
  def apply(MetricData: MetricData, Namespace: Namespace): PutMetricDataInput = {
    val __obj = js.Dynamic.literal(MetricData = MetricData.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricDataInput]
  }
}

