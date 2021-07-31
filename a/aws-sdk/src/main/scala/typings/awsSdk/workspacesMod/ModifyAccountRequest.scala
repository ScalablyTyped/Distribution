package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAccountRequest extends StObject {
  
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block). The CIDR block size must be /16 (for example, 203.0.113.25/16). It must also be specified as available by the ListAvailableManagementCidrRanges operation.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.undefined
  
  /**
    * The status of BYOL.
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum] = js.undefined
}
object ModifyAccountRequest {
  
  @scala.inline
  def apply(): ModifyAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAccountRequest]
  }
  
  @scala.inline
  implicit class ModifyAccountRequestMutableBuilder[Self <: ModifyAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRangeUndefined: Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", js.undefined)
    
    @scala.inline
    def setDedicatedTenancySupport(value: DedicatedTenancySupportEnum): Self = StObject.set(x, "DedicatedTenancySupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedTenancySupportUndefined: Self = StObject.set(x, "DedicatedTenancySupport", js.undefined)
  }
}
