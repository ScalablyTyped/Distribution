package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetAttributes extends js.Object {
  
  /**
    * The ID of the agent that is installed on the EC2 instance where the finding is generated.
    */
  var agentId: js.UndefOr[AgentId] = js.native
  
  /**
    * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  
  /**
    * The Auto Scaling group of the EC2 instance where the finding is generated.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  
  /**
    * The hostname of the EC2 instance where the finding is generated.
    */
  var hostname: js.UndefOr[Hostname] = js.native
  
  /**
    * The list of IP v4 addresses of the EC2 instance where the finding is generated.
    */
  var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.native
  
  /**
    * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion = js.native
  
  /**
    * The tags related to the EC2 instance where the finding is generated.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object AssetAttributes {
  
  @scala.inline
  def apply(schemaVersion: NumericVersion): AssetAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetAttributes]
  }
  
  @scala.inline
  implicit class AssetAttributesOps[Self <: AssetAttributes] (val x: Self) extends AnyVal {
    
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
    def setSchemaVersion(value: NumericVersion): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentId(value: AgentId): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentId: Self = this.set("agentId", js.undefined)
    
    @scala.inline
    def setAmiId(value: AmiId): Self = this.set("amiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiId: Self = this.set("amiId", js.undefined)
    
    @scala.inline
    def setAutoScalingGroup(value: AutoScalingGroup): Self = this.set("autoScalingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroup: Self = this.set("autoScalingGroup", js.undefined)
    
    @scala.inline
    def setHostname(value: Hostname): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIpv4AddressesVarargs(value: Ipv4Address*): Self = this.set("ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv4Addresses(value: Ipv4AddressList): Self = this.set("ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Addresses: Self = this.set("ipv4Addresses", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
