package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lag extends StObject {
  
  /**
    * Indicates whether the LAG can host other connections.
    */
  var allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined
  
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.undefined
  
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  
  /**
    * The connections bundled by the LAG.
    */
  var connections: js.UndefOr[ConnectionList] = js.undefined
  
  /**
    * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and 10Gbps. 
    */
  var connectionsBandwidth: js.UndefOr[Bandwidth] = js.undefined
  
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
  
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  
  /**
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.undefined
  
  /**
    * The state of the LAG. The following are the possible values:    requested: The initial state of a LAG. The LAG stays in the requested state until the Letter of Authorization (LOA) is available.    pending: The LAG has been approved and is being initialized.    available: The network link is established and the LAG is ready for use.    down: The network link is down.    deleting: The LAG is being deleted.    deleted: The LAG is deleted.    unknown: The state of the LAG is not available.  
    */
  var lagState: js.UndefOr[LagState] = js.undefined
  
  /**
    * The location of the LAG.
    */
  var location: js.UndefOr[LocationCode] = js.undefined
  
  /**
    * The minimum number of physical dedicated connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.undefined
  
  /**
    * The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
    */
  var numberOfConnections: js.UndefOr[Count] = js.undefined
  
  /**
    * The ID of the AWS account that owns the LAG.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The tags associated with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object Lag {
  
  @scala.inline
  def apply(): Lag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lag]
  }
  
  @scala.inline
  implicit class LagMutableBuilder[Self <: Lag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsHostedConnections(value: BooleanFlag): Self = StObject.set(x, "allowsHostedConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsHostedConnectionsUndefined: Self = StObject.set(x, "allowsHostedConnections", js.undefined)
    
    @scala.inline
    def setAwsDevice(value: AwsDevice): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
    
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    @scala.inline
    def setConnections(value: ConnectionList): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsBandwidth(value: Bandwidth): Self = StObject.set(x, "connectionsBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsBandwidthUndefined: Self = StObject.set(x, "connectionsBandwidth", js.undefined)
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
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
    def setLagName(value: LagName): Self = StObject.set(x, "lagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagNameUndefined: Self = StObject.set(x, "lagName", js.undefined)
    
    @scala.inline
    def setLagState(value: LagState): Self = StObject.set(x, "lagState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagStateUndefined: Self = StObject.set(x, "lagState", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMinimumLinks(value: Count): Self = StObject.set(x, "minimumLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLinksUndefined: Self = StObject.set(x, "minimumLinks", js.undefined)
    
    @scala.inline
    def setNumberOfConnections(value: Count): Self = StObject.set(x, "numberOfConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfConnectionsUndefined: Self = StObject.set(x, "numberOfConnections", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
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
  }
}
