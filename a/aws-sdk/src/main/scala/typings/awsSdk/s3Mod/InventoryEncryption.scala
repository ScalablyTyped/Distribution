package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryEncryption extends js.Object {
  /**
    * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
    */
  var SSEKMS: js.UndefOr[typings.awsSdk.s3Mod.SSEKMS] = js.native
  /**
    * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
    */
  var SSES3: js.UndefOr[typings.awsSdk.s3Mod.SSES3] = js.native
}

object InventoryEncryption {
  @scala.inline
  def apply(SSEKMS: SSEKMS = null, SSES3: SSES3 = null): InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    if (SSEKMS != null) __obj.updateDynamic("SSEKMS")(SSEKMS.asInstanceOf[js.Any])
    if (SSES3 != null) __obj.updateDynamic("SSES3")(SSES3.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryEncryption]
  }
}

