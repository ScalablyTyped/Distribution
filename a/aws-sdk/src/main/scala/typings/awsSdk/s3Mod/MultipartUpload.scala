package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartUpload extends StObject {
  
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
  implicit class MultipartUploadMutableBuilder[Self <: MultipartUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiated(value: Initiated): Self = StObject.set(x, "Initiated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatedUndefined: Self = StObject.set(x, "Initiated", js.undefined)
    
    @scala.inline
    def setInitiator(value: Initiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
  }
}
