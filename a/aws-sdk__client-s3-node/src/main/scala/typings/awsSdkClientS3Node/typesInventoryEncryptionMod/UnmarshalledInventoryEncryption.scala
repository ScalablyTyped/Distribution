package typings.awsSdkClientS3Node.typesInventoryEncryptionMod

import typings.awsSdkClientS3Node.typesSsekmsMod.UnmarshalledSSEKMS
import typings.awsSdkClientS3Node.typesSses3Mod.UnmarshalledSSES3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInventoryEncryption extends InventoryEncryption {
  /**
    * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSEKMS")
  var SSEKMS_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSEKMS] = js.native
  /**
    * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSES3")
  var SSES3_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSES3] = js.native
}

object UnmarshalledInventoryEncryption {
  @scala.inline
  def apply(): UnmarshalledInventoryEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledInventoryEncryption]
  }
  @scala.inline
  implicit class UnmarshalledInventoryEncryptionOps[Self <: UnmarshalledInventoryEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSSEKMS(value: UnmarshalledSSEKMS): Self = this.set("SSEKMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMS: Self = this.set("SSEKMS", js.undefined)
    @scala.inline
    def setSSES3(value: UnmarshalledSSES3): Self = this.set("SSES3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSES3: Self = this.set("SSES3", js.undefined)
  }
  
}

