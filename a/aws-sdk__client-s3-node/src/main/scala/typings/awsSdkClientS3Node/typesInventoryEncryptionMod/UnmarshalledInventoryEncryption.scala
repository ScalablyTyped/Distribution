package typings.awsSdkClientS3Node.typesInventoryEncryptionMod

import typings.awsSdkClientS3Node.typesSsekmsMod.UnmarshalledSSEKMS
import typings.awsSdkClientS3Node.typesSses3Mod.UnmarshalledSSES3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInventoryEncryption extends InventoryEncryption {
  /**
    * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSEKMS")
  var SSEKMS_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSEKMS] = js.undefined
  /**
    * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSES3")
  var SSES3_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSES3] = js.undefined
}

object UnmarshalledInventoryEncryption {
  @scala.inline
  def apply(SSEKMS: UnmarshalledSSEKMS = null, SSES3: UnmarshalledSSES3 = null): UnmarshalledInventoryEncryption = {
    val __obj = js.Dynamic.literal()
    if (SSEKMS != null) __obj.updateDynamic("SSEKMS")(SSEKMS.asInstanceOf[js.Any])
    if (SSES3 != null) __obj.updateDynamic("SSES3")(SSES3.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryEncryption]
  }
}

