package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossRegionCopyRetainRule extends js.Object {
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.native
  /**
    * The unit of time for time-based retention.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object CrossRegionCopyRetainRule {
  @scala.inline
  def apply(Interval: Int | Double = null, IntervalUnit: RetentionIntervalUnitValues = null): CrossRegionCopyRetainRule = {
    val __obj = js.Dynamic.literal()
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (IntervalUnit != null) __obj.updateDynamic("IntervalUnit")(IntervalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyRetainRule]
  }
}

