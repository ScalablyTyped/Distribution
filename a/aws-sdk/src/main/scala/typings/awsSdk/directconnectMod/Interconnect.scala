package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interconnect extends StObject {
  
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.undefined
  
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: js.UndefOr[Bandwidth] = js.undefined
  
  /**
    * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.undefined
  
  /**
    * The name of the interconnect.
    */
  var interconnectName: js.UndefOr[InterconnectName] = js.undefined
  
  /**
    * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.    unknown: The state of the interconnect is not available.  
    */
  var interconnectState: js.UndefOr[InterconnectState] = js.undefined
  
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  
  /**
    * The time of the most recent call to DescribeLoa for this connection.
    */
  var loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined
  
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.undefined
  
  /**
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The tags associated with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object Interconnect {
  
  inline def apply(): Interconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnect]
  }
  
  extension [Self <: Interconnect](x: Self) {
    
    inline def setAwsDevice(value: AwsDevice): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
    
    inline def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
    
    inline def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    inline def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setHasLogicalRedundancy(value: HasLogicalRedundancy): Self = StObject.set(x, "hasLogicalRedundancy", value.asInstanceOf[js.Any])
    
    inline def setHasLogicalRedundancyUndefined: Self = StObject.set(x, "hasLogicalRedundancy", js.undefined)
    
    inline def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
    
    inline def setInterconnectIdUndefined: Self = StObject.set(x, "interconnectId", js.undefined)
    
    inline def setInterconnectName(value: InterconnectName): Self = StObject.set(x, "interconnectName", value.asInstanceOf[js.Any])
    
    inline def setInterconnectNameUndefined: Self = StObject.set(x, "interconnectName", js.undefined)
    
    inline def setInterconnectState(value: InterconnectState): Self = StObject.set(x, "interconnectState", value.asInstanceOf[js.Any])
    
    inline def setInterconnectStateUndefined: Self = StObject.set(x, "interconnectState", js.undefined)
    
    inline def setJumboFrameCapable(value: JumboFrameCapable): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
    
    inline def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    inline def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
    
    inline def setLoaIssueTime(value: LoaIssueTime): Self = StObject.set(x, "loaIssueTime", value.asInstanceOf[js.Any])
    
    inline def setLoaIssueTimeUndefined: Self = StObject.set(x, "loaIssueTime", js.undefined)
    
    inline def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
