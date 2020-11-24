package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAvailabilityZone extends js.Object {
  
  /**
    * The identifier of the custom AZ. Amazon RDS generates a unique identifier when a custom AZ is created.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * The name of the custom AZ.
    */
  var CustomAvailabilityZoneName: js.UndefOr[String] = js.native
  
  /**
    * The status of the custom AZ.
    */
  var CustomAvailabilityZoneStatus: js.UndefOr[String] = js.native
  
  /**
    * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
    */
  var VpnDetails: js.UndefOr[typings.awsSdk.rdsMod.VpnDetails] = js.native
}
object CustomAvailabilityZone {
  
  @scala.inline
  def apply(): CustomAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZone]
  }
  
  @scala.inline
  implicit class CustomAvailabilityZoneOps[Self <: CustomAvailabilityZone] (val x: Self) extends AnyVal {
    
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
    def setCustomAvailabilityZoneId(value: String): Self = this.set("CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAvailabilityZoneId: Self = this.set("CustomAvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setCustomAvailabilityZoneName(value: String): Self = this.set("CustomAvailabilityZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAvailabilityZoneName: Self = this.set("CustomAvailabilityZoneName", js.undefined)
    
    @scala.inline
    def setCustomAvailabilityZoneStatus(value: String): Self = this.set("CustomAvailabilityZoneStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAvailabilityZoneStatus: Self = this.set("CustomAvailabilityZoneStatus", js.undefined)
    
    @scala.inline
    def setVpnDetails(value: VpnDetails): Self = this.set("VpnDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnDetails: Self = this.set("VpnDetails", js.undefined)
  }
}
