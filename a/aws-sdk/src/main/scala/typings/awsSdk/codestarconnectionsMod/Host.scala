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
  def apply(
    HostArn: HostArn = null,
    Name: HostName = null,
    ProviderEndpoint: Url = null,
    ProviderType: ProviderType = null,
    Status: HostStatus = null,
    StatusMessage: HostStatusMessage = null,
    VpcConfiguration: VpcConfiguration = null
  ): Host = {
    val __obj = js.Dynamic.literal()
    if (HostArn != null) __obj.updateDynamic("HostArn")(HostArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ProviderEndpoint != null) __obj.updateDynamic("ProviderEndpoint")(ProviderEndpoint.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

