package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interconnect extends js.Object {
  
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
    * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.native
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
  
  /**
    * The name of the interconnect.
    */
  var interconnectName: js.UndefOr[InterconnectName] = js.native
  
  /**
    * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.    unknown: The state of the interconnect is not available.  
    */
  var interconnectState: js.UndefOr[InterconnectState] = js.native
  
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
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  
  /**
    * The tags associated with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object Interconnect {
  
  @scala.inline
  def apply(): Interconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnect]
  }
  
  @scala.inline
  implicit class InterconnectOps[Self <: Interconnect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsDevice(value: AwsDevice): Self = this.set("awsDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsDevice: Self = this.set("awsDevice", js.undefined)
    
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = this.set("awsDeviceV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsDeviceV2: Self = this.set("awsDeviceV2", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setHasLogicalRedundancy(value: HasLogicalRedundancy): Self = this.set("hasLogicalRedundancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasLogicalRedundancy: Self = this.set("hasLogicalRedundancy", js.undefined)
    
    @scala.inline
    def setInterconnectId(value: InterconnectId): Self = this.set("interconnectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectId: Self = this.set("interconnectId", js.undefined)
    
    @scala.inline
    def setInterconnectName(value: InterconnectName): Self = this.set("interconnectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectName: Self = this.set("interconnectName", js.undefined)
    
    @scala.inline
    def setInterconnectState(value: InterconnectState): Self = this.set("interconnectState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectState: Self = this.set("interconnectState", js.undefined)
    
    @scala.inline
    def setJumboFrameCapable(value: JumboFrameCapable): Self = this.set("jumboFrameCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJumboFrameCapable: Self = this.set("jumboFrameCapable", js.undefined)
    
    @scala.inline
    def setLagId(value: LagId): Self = this.set("lagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLagId: Self = this.set("lagId", js.undefined)
    
    @scala.inline
    def setLoaIssueTime(value: LoaIssueTime): Self = this.set("loaIssueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaIssueTime: Self = this.set("loaIssueTime", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationCode): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderName): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
