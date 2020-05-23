package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostProperties extends js.Object {
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.native
  /**
    * The instance family supported by the Dedicated Host. For example, m5.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.native
  /**
    * The total number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.native
}

object HostProperties {
  @scala.inline
  def apply(
    Cores: js.UndefOr[Integer] = js.undefined,
    InstanceFamily: String = null,
    InstanceType: String = null,
    Sockets: js.UndefOr[Integer] = js.undefined,
    TotalVCpus: js.UndefOr[Integer] = js.undefined
  ): HostProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Cores)) __obj.updateDynamic("Cores")(Cores.get.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Sockets)) __obj.updateDynamic("Sockets")(Sockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalVCpus)) __obj.updateDynamic("TotalVCpus")(TotalVCpus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostProperties]
  }
}

