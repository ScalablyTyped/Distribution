package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Name: HostName = null,
    ProviderEndpoint: Url = null,
    ProviderType: ProviderType = null,
    Status: HostStatus = null,
    VpcConfiguration: VpcConfiguration = null
  ): GetHostOutput = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ProviderEndpoint != null) __obj.updateDynamic("ProviderEndpoint")(ProviderEndpoint.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostOutput]
  }
}

