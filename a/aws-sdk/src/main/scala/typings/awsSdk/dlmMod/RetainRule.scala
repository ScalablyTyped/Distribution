package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetainRule extends js.Object {
  /**
    * The number of snapshots to retain for each volume, up to a maximum of 1000.
    */
  var Count: js.UndefOr[typings.awsSdk.dlmMod.Count] = js.native
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.native
  /**
    * The unit of time for time-based retention.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object RetainRule {
  @scala.inline
  def apply(
    Count: js.UndefOr[Count] = js.undefined,
    Interval: js.UndefOr[Interval] = js.undefined,
    IntervalUnit: RetentionIntervalUnitValues = null
  ): RetainRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Interval)) __obj.updateDynamic("Interval")(Interval.get.asInstanceOf[js.Any])
    if (IntervalUnit != null) __obj.updateDynamic("IntervalUnit")(IntervalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetainRule]
  }
}

