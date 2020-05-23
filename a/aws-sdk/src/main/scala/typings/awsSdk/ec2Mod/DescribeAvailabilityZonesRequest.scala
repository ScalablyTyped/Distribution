package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityZonesRequest extends js.Object {
  /**
    * Include all Availability Zones and Local Zones regardless of your opt in status. If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
    */
  var AllAvailabilityZones: js.UndefOr[Boolean] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    group-name - For Availability Zones, use the Region name. For Local Zones, use the name of the group associated with the Local Zone (for example, us-west-2-lax-1).    message - The Availability Zone or Local Zone message.    opt-in-status - The opt in status (opted-in, and not-opted-in | opt-in-not-required).    region-name - The name of the Region for the Availability Zone or Local Zone (for example, us-east-1).    state - The state of the Availability Zone or Local Zone (available | information | impaired | unavailable).    zone-id - The ID of the Availability Zone (for example, use1-az1) or the Local Zone (for example, use usw2-lax1-az1).    zone-name - The name of the Availability Zone (for example, us-east-1a) or the Local Zone (for example, use us-west-2-lax-1a).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The IDs of the Availability Zones and Local Zones.
    */
  var ZoneIds: js.UndefOr[ZoneIdStringList] = js.native
  /**
    * The names of the Availability Zones and Local Zones.
    */
  var ZoneNames: js.UndefOr[ZoneNameStringList] = js.native
}

object DescribeAvailabilityZonesRequest {
  @scala.inline
  def apply(
    AllAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    ZoneIds: ZoneIdStringList = null,
    ZoneNames: ZoneNameStringList = null
  ): DescribeAvailabilityZonesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllAvailabilityZones)) __obj.updateDynamic("AllAvailabilityZones")(AllAvailabilityZones.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (ZoneIds != null) __obj.updateDynamic("ZoneIds")(ZoneIds.asInstanceOf[js.Any])
    if (ZoneNames != null) __obj.updateDynamic("ZoneNames")(ZoneNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityZonesRequest]
  }
}

