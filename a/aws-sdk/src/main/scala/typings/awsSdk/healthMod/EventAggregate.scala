package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAggregate extends js.Object {
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typings.awsSdk.healthMod.aggregateValue] = js.native
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typings.awsSdk.healthMod.count] = js.native
}

object EventAggregate {
  @scala.inline
  def apply(aggregateValue: aggregateValue = null, count: js.UndefOr[count] = js.undefined): EventAggregate = {
    val __obj = js.Dynamic.literal()
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAggregate]
  }
}

