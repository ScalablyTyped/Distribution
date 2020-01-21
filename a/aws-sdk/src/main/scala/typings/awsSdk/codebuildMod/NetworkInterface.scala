package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the subnet.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(networkInterfaceId: NonEmptyString = null, subnetId: NonEmptyString = null): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

