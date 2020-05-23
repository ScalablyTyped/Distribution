package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectivityInfo extends js.Object {
  /**
    * The endpoint for the Greengrass core. Can be an IP address or DNS.
    */
  var HostAddress: js.UndefOr[string] = js.native
  /**
    * The ID of the connectivity information.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Metadata for this endpoint.
    */
  var Metadata: js.UndefOr[string] = js.native
  /**
    * The port of the Greengrass core. Usually 8883.
    */
  var PortNumber: js.UndefOr[integer] = js.native
}

object ConnectivityInfo {
  @scala.inline
  def apply(
    HostAddress: string = null,
    Id: string = null,
    Metadata: string = null,
    PortNumber: js.UndefOr[integer] = js.undefined
  ): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    if (HostAddress != null) __obj.updateDynamic("HostAddress")(HostAddress.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(PortNumber)) __obj.updateDynamic("PortNumber")(PortNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectivityInfo]
  }
}

