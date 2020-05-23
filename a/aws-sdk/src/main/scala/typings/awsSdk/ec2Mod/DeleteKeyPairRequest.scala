package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[typings.awsSdk.ec2Mod.KeyPairId] = js.native
}

object DeleteKeyPairRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    KeyName: KeyPairName = null,
    KeyPairId: KeyPairId = null
  ): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (KeyPairId != null) __obj.updateDynamic("KeyPairId")(KeyPairId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
}

