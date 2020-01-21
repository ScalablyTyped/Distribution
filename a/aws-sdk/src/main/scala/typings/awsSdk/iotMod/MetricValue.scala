package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricValue extends js.Object {
  /**
    * If the comparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
    */
  var cidrs: js.UndefOr[Cidrs] = js.native
  /**
    * If the comparisonOperator calls for a numeric value, use this to specify that numeric value to be compared with the metric.
    */
  var count: js.UndefOr[UnsignedLong] = js.native
  /**
    * If the comparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
    */
  var ports: js.UndefOr[Ports] = js.native
}

object MetricValue {
  @scala.inline
  def apply(cidrs: Cidrs = null, count: Int | Double = null, ports: Ports = null): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (cidrs != null) __obj.updateDynamic("cidrs")(cidrs.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValue]
  }
}

