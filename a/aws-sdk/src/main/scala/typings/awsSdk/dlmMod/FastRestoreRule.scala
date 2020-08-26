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
  def apply(AvailabilityZones: AvailabilityZoneList): FastRestoreRule = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRestoreRule]
  }
  @scala.inline
  implicit class FastRestoreRuleOps[Self <: FastRestoreRule] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Count): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setInterval(value: Interval): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    @scala.inline
    def setIntervalUnit(value: RetentionIntervalUnitValues): Self = this.set("IntervalUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalUnit: Self = this.set("IntervalUnit", js.undefined)
  }
  
}

