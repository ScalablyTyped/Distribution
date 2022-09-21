package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartUpload extends StObject {
  
  /**
    * The algorithm that was used to create a checksum of the object.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    * Date and time at which the multipart upload was initiated.
    */
  var Initiated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Identifies who initiated the multipart upload.
    */
  var Initiator: js.UndefOr[typings.awsSdk.s3Mod.Initiator] = js.undefined
  
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  
  /**
    * Specifies the owner of the object that is part of the multipart upload. 
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.undefined
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.undefined
  
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
}
object MultipartUpload {
  
  inline def apply(): MultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartUpload]
  }
  
  extension [Self <: MultipartUpload](x: Self) {
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setInitiated(value: js.Date): Self = StObject.set(x, "Initiated", value.asInstanceOf[js.Any])
    
    inline def setInitiatedUndefined: Self = StObject.set(x, "Initiated", js.undefined)
    
    inline def setInitiator(value: Initiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
  }
}
