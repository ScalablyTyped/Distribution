package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDefinition extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: MetricName = js.native
  /**
    * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see Defining Objective Metrics.
    */
  var Regex: MetricRegex = js.native
}

object MetricDefinition {
  @scala.inline
  def apply(Name: MetricName, Regex: MetricRegex): MetricDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Regex = Regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetricDefinition]
  }
}

