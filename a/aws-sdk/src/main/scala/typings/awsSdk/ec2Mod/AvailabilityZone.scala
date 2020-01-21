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
    * Any messages about the Availability Zone or Local Zone.
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
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.native
  /**
    * The state of the Availability Zone or Local Zone.
    */
  var State: js.UndefOr[AvailabilityZoneState] = js.native
  /**
    * The ID of the Availability Zone or Local Zone.
    */
  var ZoneId: js.UndefOr[String] = js.native
  /**
    * The name of the Availability Zone or Local Zone.
    */
  var ZoneName: js.UndefOr[String] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(
    GroupName: String = null,
    Messages: AvailabilityZoneMessageList = null,
    NetworkBorderGroup: String = null,
    OptInStatus: AvailabilityZoneOptInStatus = null,
    RegionName: String = null,
    State: AvailabilityZoneState = null,
    ZoneId: String = null,
    ZoneName: String = null
  ): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    if (OptInStatus != null) __obj.updateDynamic("OptInStatus")(OptInStatus.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (ZoneId != null) __obj.updateDynamic("ZoneId")(ZoneId.asInstanceOf[js.Any])
    if (ZoneName != null) __obj.updateDynamic("ZoneName")(ZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

