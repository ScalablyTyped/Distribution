package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeToNodeEncryptionOptions extends js.Object {
  /**
    * Specify true to enable node-to-node encryption.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object NodeToNodeEncryptionOptions {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): NodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeToNodeEncryptionOptions]
  }
}

