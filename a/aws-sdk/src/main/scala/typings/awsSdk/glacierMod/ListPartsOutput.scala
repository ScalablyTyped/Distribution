package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartsOutput extends StObject {
  
  /**
    * The description of the archive that was specified in the Initiate Multipart Upload request.
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  
  /**
    * The UTC time at which the multipart upload was initiated.
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is null.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The ID of the upload to which the parts are associated.
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  
  /**
    * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
    */
  var PartSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * A list of the part sizes of the multipart upload. Each object in the array contains a RangeBytes and sha256-tree-hash name/value pair.
    */
  var Parts: js.UndefOr[PartList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
    */
  var VaultARN: js.UndefOr[String] = js.native
}
object ListPartsOutput {
  
  @scala.inline
  def apply(): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartsOutput]
  }
  
  @scala.inline
  implicit class ListPartsOutputMutableBuilder[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveDescription(value: String): Self = StObject.set(x, "ArchiveDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveDescriptionUndefined: Self = StObject.set(x, "ArchiveDescription", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMultipartUploadId(value: String): Self = StObject.set(x, "MultipartUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUploadIdUndefined: Self = StObject.set(x, "MultipartUploadId", js.undefined)
    
    @scala.inline
    def setPartSizeInBytes(value: long): Self = StObject.set(x, "PartSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSizeInBytesUndefined: Self = StObject.set(x, "PartSizeInBytes", js.undefined)
    
    @scala.inline
    def setParts(value: PartList): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: PartListElement*): Self = StObject.set(x, "Parts", js.Array(value :_*))
    
    @scala.inline
    def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
  }
}
