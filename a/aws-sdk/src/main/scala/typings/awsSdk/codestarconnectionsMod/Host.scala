package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the host.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.native
  /**
    * The name of the host.
    */
  var Name: js.UndefOr[HostName] = js.native
  /**
    * The endpoint of the infrastructure where your provider type is installed.
    */
  var ProviderEndpoint: js.UndefOr[Url] = js.native
  /**
    * The name of the installed provider to be associated with your connection. The host resource represents the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.native
  /**
    * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and VPC_CONFIG_FAILED_INITIALIZATION.
    */
  var Status: js.UndefOr[HostStatus] = js.native
  /**
    * The status description for the host.
    */
  var StatusMessage: js.UndefOr[HostStatusMessage] = js.native
  /**
    * The VPC configuration provisioned for the host.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.codestarconnectionsMod.VpcConfiguration] = js.native
}

object Host {
  @scala.inline
  def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
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
    def setHostArn(value: HostArn): Self = this.set("HostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostArn: Self = this.set("HostArn", js.undefined)
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
    def setStatusMessage(value: HostStatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
  
}

