package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageLensDataExportEncryption extends js.Object {
  
  /**
    * 
    */
  var SSEKMS: js.UndefOr[typings.awsSdk.s3controlMod.SSEKMS] = js.native
  
  /**
    * 
    */
  var SSES3: js.UndefOr[typings.awsSdk.s3controlMod.SSES3] = js.native
}
object StorageLensDataExportEncryption {
  
  @scala.inline
  def apply(): StorageLensDataExportEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageLensDataExportEncryption]
  }
  
  @scala.inline
  implicit class StorageLensDataExportEncryptionOps[Self <: StorageLensDataExportEncryption] (val x: Self) extends AnyVal {
    
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
