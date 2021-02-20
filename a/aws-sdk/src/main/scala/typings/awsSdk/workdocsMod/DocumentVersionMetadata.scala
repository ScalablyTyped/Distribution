package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentVersionMetadata extends StObject {
  
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.native
  
  /**
    * The timestamp when the document was first uploaded.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  
  /**
    * The ID of the version.
    */
  var Id: js.UndefOr[DocumentVersionIdType] = js.native
  
  /**
    * The timestamp when the document was last uploaded.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The name of the version.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * The signature of the document.
    */
  var Signature: js.UndefOr[HashType] = js.native
  
  /**
    * The size of the document, in bytes.
    */
  var Size: js.UndefOr[SizeType] = js.native
  
  /**
    * The source of the document.
    */
  var Source: js.UndefOr[DocumentSourceUrlMap] = js.native
  
  /**
    * The status of the document.
    */
  var Status: js.UndefOr[DocumentStatusType] = js.native
  
  /**
    * The thumbnail of the document.
    */
  var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.native
}
object DocumentVersionMetadata {
  
  @scala.inline
  def apply(): DocumentVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentVersionMetadata]
  }
  
  @scala.inline
  implicit class DocumentVersionMetadataMutableBuilder[Self <: DocumentVersionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "ContentCreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCreatedTimestampUndefined: Self = StObject.set(x, "ContentCreatedTimestamp", js.undefined)
    
    @scala.inline
    def setContentModifiedTimestamp(value: TimestampType): Self = StObject.set(x, "ContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentModifiedTimestampUndefined: Self = StObject.set(x, "ContentModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setContentType(value: DocumentContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setCreatorId(value: IdType): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    @scala.inline
    def setId(value: DocumentVersionIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSignature(value: HashType): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    @scala.inline
    def setSource(value: DocumentSourceUrlMap): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setStatus(value: DocumentStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThumbnail(value: DocumentThumbnailUrlMap): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "Thumbnail", js.undefined)
  }
}
