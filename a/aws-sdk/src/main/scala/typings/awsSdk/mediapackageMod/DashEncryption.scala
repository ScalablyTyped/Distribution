package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashEncryption extends js.Object {
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.native
  var SpekeKeyProvider: typings.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object DashEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider, KeyRotationIntervalSeconds: Int | Double = null): DashEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    if (KeyRotationIntervalSeconds != null) __obj.updateDynamic("KeyRotationIntervalSeconds")(KeyRotationIntervalSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashEncryption]
  }
}

