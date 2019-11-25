package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryEncryptionMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSSEKMSMod._UnmarshalledSSEKMS
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSSES3Mod._UnmarshalledSSES3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledInventoryEncryption extends _InventoryEncryption {
  /**
    * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSEKMS")
  var SSEKMS__UnmarshalledInventoryEncryption: js.UndefOr[_UnmarshalledSSEKMS] = js.undefined
  /**
    * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSES3")
  var SSES3__UnmarshalledInventoryEncryption: js.UndefOr[_UnmarshalledSSES3] = js.undefined
}

object _UnmarshalledInventoryEncryption {
  @scala.inline
  def apply(SSEKMS: _UnmarshalledSSEKMS = null, SSES3: _UnmarshalledSSES3 = null): _UnmarshalledInventoryEncryption = {
    val __obj = js.Dynamic.literal()
    if (SSEKMS != null) __obj.updateDynamic("SSEKMS")(SSEKMS.asInstanceOf[js.Any])
    if (SSES3 != null) __obj.updateDynamic("SSES3")(SSES3.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledInventoryEncryption]
  }
}

