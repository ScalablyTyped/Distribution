package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesPartListElementMod.UnmarshalledPartListElement
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListPartsOutputMod {
  
  trait ListPartsOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
      */
    var ArchiveDescription: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The UTC time at which the multipart upload was initiated.</p>
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.</p>
      */
    var Marker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of the upload to which the parts are associated.</p>
      */
    var MultipartUploadId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.</p>
      */
    var PartSizeInBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.</p>
      */
    var Parts: js.UndefOr[js.Array[UnmarshalledPartListElement]] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.</p>
      */
    var VaultARN: js.UndefOr[String] = js.undefined
  }
  object ListPartsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListPartsOutput]
    }
    
    extension [Self <: ListPartsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setArchiveDescription(value: String): Self = StObject.set(x, "ArchiveDescription", value.asInstanceOf[js.Any])
      
      inline def setArchiveDescriptionUndefined: Self = StObject.set(x, "ArchiveDescription", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      inline def setMultipartUploadId(value: String): Self = StObject.set(x, "MultipartUploadId", value.asInstanceOf[js.Any])
      
      inline def setMultipartUploadIdUndefined: Self = StObject.set(x, "MultipartUploadId", js.undefined)
      
      inline def setPartSizeInBytes(value: Double): Self = StObject.set(x, "PartSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setPartSizeInBytesUndefined: Self = StObject.set(x, "PartSizeInBytes", js.undefined)
      
      inline def setParts(value: js.Array[UnmarshalledPartListElement]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      inline def setPartsVarargs(value: UnmarshalledPartListElement*): Self = StObject.set(x, "Parts", js.Array(value*))
      
      inline def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
      
      inline def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
    }
  }
}
