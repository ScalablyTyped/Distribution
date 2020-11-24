package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAvailabilityZonesRequest extends js.Object {
  
  /**
    * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status. If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
    */
  var AllAvailabilityZones: js.UndefOr[Boolean] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    group-name - For Availability Zones, use the Region name. For Local Zones, use the name of the group associated with the Local Zone (for example, us-west-2-lax-1) For Wavelength Zones, use the name of the group associated with the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).    message - The Zone message.    opt-in-status - The opt-in status (opted-in, and not-opted-in | opt-in-not-required).    parent-zoneID - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.    parent-zoneName - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.    region-name - The name of the Region for the Zone (for example, us-east-1).    state - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (available | information | impaired | unavailable).    zone-id - The ID of the Availability Zone (for example, use1-az1), the Local Zone (for example, usw2-lax1-az1), or the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).    zone-type - The type of zone, for example, local-zone.    zone-name - The name of the Availability Zone (for example, us-east-1a), the Local Zone (for example, us-west-2-lax-1a), or the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).    zone-type - The type of zone, for example, local-zone.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
    */
  var ZoneIds: js.UndefOr[ZoneIdStringList] = js.native
  
  /**
    * The names of the Availability Zones, Local Zones, and Wavelength Zones.
    */
  var ZoneNames: js.UndefOr[ZoneNameStringList] = js.native
}
object DescribeAvailabilityZonesRequest {
  
  @scala.inline
  def apply(): DescribeAvailabilityZonesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityZonesRequest]
  }
  
  @scala.inline
  implicit class DescribeAvailabilityZonesRequestOps[Self <: DescribeAvailabilityZonesRequest] (val x: Self) extends AnyVal {
    
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
    def setAllAvailabilityZones(value: Boolean): Self = this.set("AllAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllAvailabilityZones: Self = this.set("AllAvailabilityZones", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setZoneIdsVarargs(value: String*): Self = this.set("ZoneIds", js.Array(value :_*))
    
    @scala.inline
    def setZoneIds(value: ZoneIdStringList): Self = this.set("ZoneIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneIds: Self = this.set("ZoneIds", js.undefined)
    
    @scala.inline
    def setZoneNamesVarargs(value: String*): Self = this.set("ZoneNames", js.Array(value :_*))
    
    @scala.inline
    def setZoneNames(value: ZoneNameStringList): Self = this.set("ZoneNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneNames: Self = this.set("ZoneNames", js.undefined)
  }
}
