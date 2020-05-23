package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfig extends js.Object {
  /**
    * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  /**
    * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object NetworkConfig {
  @scala.inline
  def apply(
    EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    VpcConfig: VpcConfig = null
  ): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableInterContainerTrafficEncryption)) __obj.updateDynamic("EnableInterContainerTrafficEncryption")(EnableInterContainerTrafficEncryption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation.get.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfig]
  }
}

