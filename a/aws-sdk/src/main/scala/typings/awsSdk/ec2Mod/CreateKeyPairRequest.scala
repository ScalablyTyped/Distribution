package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * A unique name for the key pair. Constraints: Up to 255 ASCII characters
    */
  var KeyName: String = js.native
  /**
    * The tags to apply to the new key pair.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateKeyPairRequest {
  @scala.inline
  def apply(
    KeyName: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyPairRequest]
  }
}

