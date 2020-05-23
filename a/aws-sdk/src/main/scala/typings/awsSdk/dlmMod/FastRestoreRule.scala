package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastRestoreRule extends js.Object {
  /**
    * The Availability Zones in which to enable fast snapshot restore.
    */
  var AvailabilityZones: AvailabilityZoneList = js.native
  /**
    * The number of snapshots to be enabled with fast snapshot restore.
    */
  var Count: js.UndefOr[typings.awsSdk.dlmMod.Count] = js.native
  /**
    * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.native
  /**
    * The unit of time for enabling fast snapshot restore.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object FastRestoreRule {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList,
    Count: js.UndefOr[Count] = js.undefined,
    Interval: js.UndefOr[Interval] = js.undefined,
    IntervalUnit: RetentionIntervalUnitValues = null
  ): FastRestoreRule = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any])
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Interval)) __obj.updateDynamic("Interval")(Interval.get.asInstanceOf[js.Any])
    if (IntervalUnit != null) __obj.updateDynamic("IntervalUnit")(IntervalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRestoreRule]
  }
}

