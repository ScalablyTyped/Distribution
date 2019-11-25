package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryEncryptionMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSSEKMSMod._SSEKMS
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSSES3Mod._SSES3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventoryEncryption extends js.Object {
  /**
    * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
    */
  var SSEKMS: js.UndefOr[_SSEKMS] = js.undefined
  /**
    * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
    */
  var SSES3: js.UndefOr[_SSES3] = js.undefined
}

object _InventoryEncryption {
  @scala.inline
  def apply(SSEKMS: _SSEKMS = null, SSES3: _SSES3 = null): _InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    if (SSEKMS != null) __obj.updateDynamic("SSEKMS")(SSEKMS.asInstanceOf[js.Any])
    if (SSES3 != null) __obj.updateDynamic("SSES3")(SSES3.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InventoryEncryption]
  }
}

