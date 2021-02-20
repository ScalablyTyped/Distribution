package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.typesInitiatorMod.Initiator
import typings.awsSdkClientS3Browser.typesInitiatorMod.UnmarshalledInitiator
import typings.awsSdkClientS3Browser.typesOwnerMod.Owner
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMultipartUploadMod {
  
  @js.native
  trait MultipartUpload extends StObject {
    
    /**
      * <p>Date and time at which the multipart upload was initiated.</p>
      */
    var Initiated: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>Identifies who initiated the multipart upload.</p>
      */
    var Initiator: js.UndefOr[typings.awsSdkClientS3Browser.typesInitiatorMod.Initiator] = js.native
    
    /**
      * <p>Key of the object for which the multipart upload was initiated.</p>
      */
    var Key: js.UndefOr[String] = js.native
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typings.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.native
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
    
    /**
      * <p>Upload ID that identifies the multipart upload.</p>
      */
    var UploadId: js.UndefOr[String] = js.native
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
      def setInitiated(value: Date | String | Double): Self = StObject.set(x, "Initiated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatedUndefined: Self = StObject.set(x, "Initiated", js.undefined)
      
      @scala.inline
      def setInitiator(value: Initiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      @scala.inline
      def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledMultipartUpload extends MultipartUpload {
    
    /**
      * <p>Date and time at which the multipart upload was initiated.</p>
      */
    @JSName("Initiated")
    var Initiated_UnmarshalledMultipartUpload: js.UndefOr[Date] = js.native
    
    /**
      * <p>Identifies who initiated the multipart upload.</p>
      */
    @JSName("Initiator")
    var Initiator_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledInitiator] = js.native
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object UnmarshalledMultipartUpload {
    
    @scala.inline
    def apply(): UnmarshalledMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMultipartUpload]
    }
    
    @scala.inline
    implicit class UnmarshalledMultipartUploadMutableBuilder[Self <: UnmarshalledMultipartUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitiated(value: Date): Self = StObject.set(x, "Initiated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatedUndefined: Self = StObject.set(x, "Initiated", js.undefined)
      
      @scala.inline
      def setInitiator(value: UnmarshalledInitiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
