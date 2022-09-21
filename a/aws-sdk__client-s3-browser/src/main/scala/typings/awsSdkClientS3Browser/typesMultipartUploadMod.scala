package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.typesInitiatorMod.Initiator
import typings.awsSdkClientS3Browser.typesInitiatorMod.UnmarshalledInitiator
import typings.awsSdkClientS3Browser.typesOwnerMod.Owner
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMultipartUploadMod {
  
  trait MultipartUpload extends StObject {
    
    /**
      * <p>Date and time at which the multipart upload was initiated.</p>
      */
    var Initiated: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Identifies who initiated the multipart upload.</p>
      */
    var Initiator: js.UndefOr[typings.awsSdkClientS3Browser.typesInitiatorMod.Initiator] = js.undefined
    
    /**
      * <p>Key of the object for which the multipart upload was initiated.</p>
      */
    var Key: js.UndefOr[String] = js.undefined
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typings.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.undefined
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
    
    /**
      * <p>Upload ID that identifies the multipart upload.</p>
      */
    var UploadId: js.UndefOr[String] = js.undefined
  }
  object MultipartUpload {
    
    inline def apply(): MultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipartUpload]
    }
    
    extension [Self <: MultipartUpload](x: Self) {
      
      inline def setInitiated(value: js.Date | String | Double): Self = StObject.set(x, "Initiated", value.asInstanceOf[js.Any])
      
      inline def setInitiatedUndefined: Self = StObject.set(x, "Initiated", js.undefined)
      
      inline def setInitiator(value: Initiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
      
      inline def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      inline def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
    }
  }
  
  trait UnmarshalledMultipartUpload
    extends StObject
       with MultipartUpload {
    
    /**
      * <p>Date and time at which the multipart upload was initiated.</p>
      */
    @JSName("Initiated")
    var Initiated_UnmarshalledMultipartUpload: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>Identifies who initiated the multipart upload.</p>
      */
    @JSName("Initiator")
    var Initiator_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledInitiator] = js.undefined
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledOwner] = js.undefined
  }
  object UnmarshalledMultipartUpload {
    
    inline def apply(): UnmarshalledMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMultipartUpload]
    }
    
    extension [Self <: UnmarshalledMultipartUpload](x: Self) {
      
      inline def setInitiated(value: js.Date): Self = StObject.set(x, "Initiated", value.asInstanceOf[js.Any])
      
      inline def setInitiatedUndefined: Self = StObject.set(x, "Initiated", js.undefined)
      
      inline def setInitiator(value: UnmarshalledInitiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
      
      inline def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
