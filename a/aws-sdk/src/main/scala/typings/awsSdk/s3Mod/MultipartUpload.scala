package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartUpload extends js.Object {
  
  /**
    * Date and time at which the multipart upload was initiated.
    */
  var Initiated: js.UndefOr[typings.awsSdk.s3Mod.Initiated] = js.native
  
  /**
    * Identifies who initiated the multipart upload.
    */
  var Initiator: js.UndefOr[typings.awsSdk.s3Mod.Initiator] = js.native
  
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  
  /**
    * Specifies the owner of the object that is part of the multipart upload. 
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.native
}
object MultipartUpload {
  
  @scala.inline
  def apply(): MultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartUpload]
  }
  
  @scala.inline
  implicit class MultipartUploadOps[Self <: MultipartUpload] (val x: Self) extends AnyVal {
    
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
    def setInitiated(value: Initiated): Self = this.set("Initiated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiated: Self = this.set("Initiated", js.undefined)
    
    @scala.inline
    def setInitiator(value: Initiator): Self = this.set("Initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("Initiator", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = this.set("UploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("UploadId", js.undefined)
  }
}
