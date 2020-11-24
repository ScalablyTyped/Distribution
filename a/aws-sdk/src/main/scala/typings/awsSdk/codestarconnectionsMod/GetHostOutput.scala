package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostOutput extends js.Object {
  
  /**
    * The name of the requested host.
    */
  var Name: js.UndefOr[HostName] = js.native
  
  /**
    * The endpoint of the infrastructure represented by the requested host.
    */
  var ProviderEndpoint: js.UndefOr[Url] = js.native
  
  /**
    * The provider type of the requested host, such as GitHub Enterprise Server.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.native
  
  /**
    * The status of the requested host.
    */
  var Status: js.UndefOr[HostStatus] = js.native
  
  /**
    * The VPC configuration of the requested host.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.codestarconnectionsMod.VpcConfiguration] = js.native
}
object GetHostOutput {
  
  @scala.inline
  def apply(): GetHostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostOutput]
  }
  
  @scala.inline
  implicit class GetHostOutputOps[Self <: GetHostOutput] (val x: Self) extends AnyVal {
    
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
    def setName(value: HostName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProviderEndpoint(value: Url): Self = this.set("ProviderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderEndpoint: Self = this.set("ProviderEndpoint", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderType: Self = this.set("ProviderType", js.undefined)
    
    @scala.inline
    def setStatus(value: HostStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
}
