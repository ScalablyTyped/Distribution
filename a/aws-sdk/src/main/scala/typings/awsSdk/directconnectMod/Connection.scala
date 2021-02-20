package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.native
  
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: js.UndefOr[Bandwidth] = js.native
  
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  
  /**
    * The name of the connection.
    */
  var connectionName: js.UndefOr[ConnectionName] = js.native
  
  /**
    * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.    unknown: The state of the connection is not available.  
    */
  var connectionState: js.UndefOr[ConnectionState] = js.native
  
  /**
    * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.native
  
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.native
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  
  /**
    * The time of the most recent call to DescribeLoa for this connection.
    */
  var loaIssueTime: js.UndefOr[LoaIssueTime] = js.native
  
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.native
  
  /**
    * The ID of the AWS account that owns the connection.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The name of the AWS Direct Connect service provider associated with the connection.
    */
  var partnerName: js.UndefOr[PartnerName] = js.native
  
  /**
    * The name of the service provider associated with the connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsDevice(value: AwsDevice): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
    
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    @scala.inline
    def setConnectionState(value: ConnectionState): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStateUndefined: Self = StObject.set(x, "connectionState", js.undefined)
    
    @scala.inline
    def setHasLogicalRedundancy(value: HasLogicalRedundancy): Self = StObject.set(x, "hasLogicalRedundancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLogicalRedundancyUndefined: Self = StObject.set(x, "hasLogicalRedundancy", js.undefined)
    
    @scala.inline
    def setJumboFrameCapable(value: JumboFrameCapable): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
    
    @scala.inline
    def setLoaIssueTime(value: LoaIssueTime): Self = StObject.set(x, "loaIssueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaIssueTimeUndefined: Self = StObject.set(x, "loaIssueTime", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    @scala.inline
    def setPartnerName(value: PartnerName): Self = StObject.set(x, "partnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerNameUndefined: Self = StObject.set(x, "partnerName", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
  }
}
