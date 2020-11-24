package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends js.Object {
  
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * Attributes of the blockchain framework for the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsSdk.managedblockchainMod.Framework] = js.native
  
  /**
    * Attributes of the blockchain framework that the network uses.
    */
  var FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes] = js.native
  
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.native
  
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.native
  
  /**
    * The voting rules for the network to decide if a proposal is accepted.
    */
  var VotingPolicy: js.UndefOr[typings.awsSdk.managedblockchainMod.VotingPolicy] = js.native
  
  /**
    * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service name to create a VPC endpoint to access network resources.
    */
  var VpcEndpointServiceName: js.UndefOr[String] = js.native
}
object Network {
  
  @scala.inline
  def apply(): Network = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFramework(value: Framework): Self = this.set("Framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("Framework", js.undefined)
    
    @scala.inline
    def setFrameworkAttributes(value: NetworkFrameworkAttributes): Self = this.set("FrameworkAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkAttributes: Self = this.set("FrameworkAttributes", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: FrameworkVersionString): Self = this.set("FrameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkVersion: Self = this.set("FrameworkVersion", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: NetworkStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVotingPolicy(value: VotingPolicy): Self = this.set("VotingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVotingPolicy: Self = this.set("VotingPolicy", js.undefined)
    
    @scala.inline
    def setVpcEndpointServiceName(value: String): Self = this.set("VpcEndpointServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointServiceName: Self = this.set("VpcEndpointServiceName", js.undefined)
  }
}
