package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamRequest extends StObject {
  
  /**
    * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions. For more information about operating Regions, see Create an IPAM in the Amazon VPC IPAM User Guide.
    */
  var AddOperatingRegions: js.UndefOr[AddIpamOperatingRegionSet] = js.undefined
  
  /**
    * The description of the IPAM you want to modify.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM you want to modify.
    */
  var IpamId: typings.awsSdk.ec2Mod.IpamId
  
  /**
    * The operating Regions to remove.
    */
  var RemoveOperatingRegions: js.UndefOr[RemoveIpamOperatingRegionSet] = js.undefined
}
object ModifyIpamRequest {
  
  inline def apply(IpamId: IpamId): ModifyIpamRequest = {
    val __obj = js.Dynamic.literal(IpamId = IpamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIpamRequest]
  }
  
  extension [Self <: ModifyIpamRequest](x: Self) {
    
    inline def setAddOperatingRegions(value: AddIpamOperatingRegionSet): Self = StObject.set(x, "AddOperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setAddOperatingRegionsUndefined: Self = StObject.set(x, "AddOperatingRegions", js.undefined)
    
    inline def setAddOperatingRegionsVarargs(value: AddIpamOperatingRegion*): Self = StObject.set(x, "AddOperatingRegions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamId(value: IpamId): Self = StObject.set(x, "IpamId", value.asInstanceOf[js.Any])
    
    inline def setRemoveOperatingRegions(value: RemoveIpamOperatingRegionSet): Self = StObject.set(x, "RemoveOperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setRemoveOperatingRegionsUndefined: Self = StObject.set(x, "RemoveOperatingRegions", js.undefined)
    
    inline def setRemoveOperatingRegionsVarargs(value: RemoveIpamOperatingRegion*): Self = StObject.set(x, "RemoveOperatingRegions", js.Array(value*))
  }
}
