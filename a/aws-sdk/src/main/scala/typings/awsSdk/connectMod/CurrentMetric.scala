package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMetric extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[CurrentMetricName] = js.native
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.connectMod.Unit] = js.native
}

object CurrentMetric {
  @scala.inline
  def apply(Name: CurrentMetricName = null, Unit: Unit = null): CurrentMetric = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMetric]
  }
}

