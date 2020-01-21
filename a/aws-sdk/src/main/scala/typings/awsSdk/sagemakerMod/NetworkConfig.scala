package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfig extends js.Object {
  /**
    * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object NetworkConfig {
  @scala.inline
  def apply(EnableNetworkIsolation: js.UndefOr[scala.Boolean] = js.undefined, VpcConfig: VpcConfig = null): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfig]
  }
}

