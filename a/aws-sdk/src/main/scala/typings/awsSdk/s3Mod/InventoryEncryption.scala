package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryEncryption]
  }
  
  @scala.inline
  implicit class InventoryEncryptionOps[Self <: InventoryEncryption] (val x: Self) extends AnyVal {
    
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
    def setSSEKMS(value: SSEKMS): Self = this.set("SSEKMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEKMS: Self = this.set("SSEKMS", js.undefined)
    
    @scala.inline
    def setSSES3(value: SSES3): Self = this.set("SSES3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSES3: Self = this.set("SSES3", js.undefined)
  }
}
