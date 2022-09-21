package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipam extends StObject {
  
  /**
    * The description for the IPAM.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IPAM.
    */
  var IpamArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the IPAM.
    */
  var IpamId: js.UndefOr[typings.awsSdk.ec2Mod.IpamId] = js.undefined
  
  /**
    * The Amazon Web Services Region of the IPAM.
    */
  var IpamRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions. For more information about operating Regions, see Create an IPAM in the Amazon VPC IPAM User Guide.
    */
  var OperatingRegions: js.UndefOr[IpamOperatingRegionSet] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the IPAM.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the IPAM's default private scope.
    */
  var PrivateDefaultScopeId: js.UndefOr[IpamScopeId] = js.undefined
  
  /**
    * The ID of the IPAM's default public scope.
    */
  var PublicDefaultScopeId: js.UndefOr[IpamScopeId] = js.undefined
  
  /**
    * The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see Quotas in IPAM in the Amazon VPC IPAM User Guide. 
    */
  var ScopeCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The state of the IPAM.
    */
  var State: js.UndefOr[IpamState] = js.undefined
  
  /**
    * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Ipam {
  
  inline def apply(): Ipam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipam]
  }
  
  extension [Self <: Ipam](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIpamArn(value: ResourceArn): Self = StObject.set(x, "IpamArn", value.asInstanceOf[js.Any])
    
    inline def setIpamArnUndefined: Self = StObject.set(x, "IpamArn", js.undefined)
    
    inline def setIpamId(value: IpamId): Self = StObject.set(x, "IpamId", value.asInstanceOf[js.Any])
    
    inline def setIpamIdUndefined: Self = StObject.set(x, "IpamId", js.undefined)
    
    inline def setIpamRegion(value: String): Self = StObject.set(x, "IpamRegion", value.asInstanceOf[js.Any])
    
    inline def setIpamRegionUndefined: Self = StObject.set(x, "IpamRegion", js.undefined)
    
    inline def setOperatingRegions(value: IpamOperatingRegionSet): Self = StObject.set(x, "OperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setOperatingRegionsUndefined: Self = StObject.set(x, "OperatingRegions", js.undefined)
    
    inline def setOperatingRegionsVarargs(value: IpamOperatingRegion*): Self = StObject.set(x, "OperatingRegions", js.Array(value*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPrivateDefaultScopeId(value: IpamScopeId): Self = StObject.set(x, "PrivateDefaultScopeId", value.asInstanceOf[js.Any])
    
    inline def setPrivateDefaultScopeIdUndefined: Self = StObject.set(x, "PrivateDefaultScopeId", js.undefined)
    
    inline def setPublicDefaultScopeId(value: IpamScopeId): Self = StObject.set(x, "PublicDefaultScopeId", value.asInstanceOf[js.Any])
    
    inline def setPublicDefaultScopeIdUndefined: Self = StObject.set(x, "PublicDefaultScopeId", js.undefined)
    
    inline def setScopeCount(value: Integer): Self = StObject.set(x, "ScopeCount", value.asInstanceOf[js.Any])
    
    inline def setScopeCountUndefined: Self = StObject.set(x, "ScopeCount", js.undefined)
    
    inline def setState(value: IpamState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
