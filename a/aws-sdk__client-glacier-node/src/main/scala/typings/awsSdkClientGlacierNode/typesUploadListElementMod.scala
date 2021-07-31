package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUploadListElementMod {
  
  type UnmarshalledUploadListElement = UploadListElement
  
  trait UploadListElement extends StObject {
    
    /**
      * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
      */
    var ArchiveDescription: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The UTC time at which the multipart upload was initiated.</p>
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of a multipart upload.</p>
      */
    var MultipartUploadId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.</p>
      */
    var PartSizeInBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the vault that contains the archive.</p>
      */
    var VaultARN: js.UndefOr[String] = js.undefined
  }
  object UploadListElement {
    
    @scala.inline
    def apply(): UploadListElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadListElement]
    }
    
    @scala.inline
    implicit class UploadListElementMutableBuilder[Self <: UploadListElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchiveDescription(value: String): Self = StObject.set(x, "ArchiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveDescriptionUndefined: Self = StObject.set(x, "ArchiveDescription", js.undefined)
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setMultipartUploadId(value: String): Self = StObject.set(x, "MultipartUploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartUploadIdUndefined: Self = StObject.set(x, "MultipartUploadId", js.undefined)
      
      @scala.inline
      def setPartSizeInBytes(value: Double): Self = StObject.set(x, "PartSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartSizeInBytesUndefined: Self = StObject.set(x, "PartSizeInBytes", js.undefined)
      
      @scala.inline
      def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
    }
  }
}
