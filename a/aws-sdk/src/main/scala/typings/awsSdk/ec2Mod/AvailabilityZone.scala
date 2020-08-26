package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    *  For Availability Zones, this parameter has the same value as the Region name. For Local Zones, the name of the associated group, for example us-west-2-lax-1.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * Any messages about the Zone.
    */
  var Messages: js.UndefOr[AvailabilityZoneMessageList] = js.native
  /**
    * The name of the location from which the address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    *  For Availability Zones, this parameter always has the value of opt-in-not-required. For Local Zones, this parameter is the opt in status. The possible values are opted-in, and not-opted-in.
    */
  var OptInStatus: js.UndefOr[AvailabilityZoneOptInStatus] = js.native
  /**
    * The ID of the zone that handles some of the Local Zone control plane operations, such as API calls.
    */
  var ParentZoneId: js.UndefOr[String] = js.native
  /**
    * The name of the zone that handles some of the Local Zone control plane operations, such as API calls.
    */
  var ParentZoneName: js.UndefOr[String] = js.native
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.native
  /**
    * The state of the Zone.
    */
  var State: js.UndefOr[AvailabilityZoneState] = js.native
  /**
    * The ID of the Zone.
    */
  var ZoneId: js.UndefOr[String] = js.native
  /**
    * The name of the Zone.
    */
  var ZoneName: js.UndefOr[String] = js.native
  /**
    * The type of zone. The valid values are availability-zone and local-zone.
    */
  var ZoneType: js.UndefOr[String] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  @scala.inline
  implicit class AvailabilityZoneOps[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
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
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: AvailabilityZoneMessage*): Self = this.set("Messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: AvailabilityZoneMessageList): Self = this.set("Messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = this.set("NetworkBorderGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("NetworkBorderGroup", js.undefined)
    @scala.inline
    def setOptInStatus(value: AvailabilityZoneOptInStatus): Self = this.set("OptInStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptInStatus: Self = this.set("OptInStatus", js.undefined)
    @scala.inline
    def setParentZoneId(value: String): Self = this.set("ParentZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentZoneId: Self = this.set("ParentZoneId", js.undefined)
    @scala.inline
    def setParentZoneName(value: String): Self = this.set("ParentZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentZoneName: Self = this.set("ParentZoneName", js.undefined)
    @scala.inline
    def setRegionName(value: String): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionName: Self = this.set("RegionName", js.undefined)
    @scala.inline
    def setState(value: AvailabilityZoneState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setZoneId(value: String): Self = this.set("ZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("ZoneId", js.undefined)
    @scala.inline
    def setZoneName(value: String): Self = this.set("ZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneName: Self = this.set("ZoneName", js.undefined)
    @scala.inline
    def setZoneType(value: String): Self = this.set("ZoneType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneType: Self = this.set("ZoneType", js.undefined)
  }
  
}

