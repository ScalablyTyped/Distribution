package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementType extends js.Object {
  /**
    * The Amazon EC2 Availability Zone for the cluster. AvailabilityZone is used for uniform instance groups, while AvailabilityZones (plural) is used for instance fleets.
    */
  var AvailabilityZone: js.UndefOr[XmlString] = js.native
  /**
    * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal Availability Zone. AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for uniform instance groups.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  var AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.native
}

object PlacementType {
  @scala.inline
  def apply(): PlacementType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementType]
  }
  @scala.inline
  implicit class PlacementTypeOps[Self <: PlacementType] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: XmlString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setAvailabilityZonesVarargs(value: XmlStringMaxLen256*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: XmlStringMaxLen256List): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
  }
  
}

