package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHostInput extends js.Object {
  /**
    * The name of the host to be created. The name must be unique in the calling AWS account.
    */
  var Name: HostName = js.native
  /**
    * The endpoint of the infrastructure to be represented by the host after it is created.
    */
  var ProviderEndpoint: Url = js.native
  /**
    * The name of the installed provider to be associated with your connection. The host resource represents the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
    */
  var ProviderType: typings.awsSdk.codestarconnectionsMod.ProviderType = js.native
  /**
    * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be represented by the host must already be connected to the VPC.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.codestarconnectionsMod.VpcConfiguration] = js.native
}

object CreateHostInput {
  @scala.inline
  def apply(Name: HostName, ProviderEndpoint: Url, ProviderType: ProviderType): CreateHostInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProviderEndpoint = ProviderEndpoint.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostInput]
  }
  @scala.inline
  implicit class CreateHostInputOps[Self <: CreateHostInput] (val x: Self) extends AnyVal {
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
    def setProviderEndpoint(value: Url): Self = this.set("ProviderEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderType(value: ProviderType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
  
}

