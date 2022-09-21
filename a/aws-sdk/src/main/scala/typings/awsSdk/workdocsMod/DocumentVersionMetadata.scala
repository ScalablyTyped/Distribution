package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentVersionMetadata extends StObject {
  
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.undefined
  
  /**
    * The timestamp when the document was first uploaded.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The ID of the version.
    */
  var Id: js.UndefOr[DocumentVersionIdType] = js.undefined
  
  /**
    * The timestamp when the document was last uploaded.
    */
  var ModifiedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the version.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The signature of the document.
    */
  var Signature: js.UndefOr[HashType] = js.undefined
  
  /**
    * The size of the document, in bytes.
    */
  var Size: js.UndefOr[SizeType] = js.undefined
  
  /**
    * The source of the document.
    */
  var Source: js.UndefOr[DocumentSourceUrlMap] = js.undefined
  
  /**
    * The status of the document.
    */
  var Status: js.UndefOr[DocumentStatusType] = js.undefined
  
  /**
    * The thumbnail of the document.
    */
  var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.undefined
}
object DocumentVersionMetadata {
  
  inline def apply(): DocumentVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentVersionMetadata]
  }
  
  extension [Self <: DocumentVersionMetadata](x: Self) {
    
    inline def setContentCreatedTimestamp(value: js.Date): Self = StObject.set(x, "ContentCreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContentCreatedTimestampUndefined: Self = StObject.set(x, "ContentCreatedTimestamp", js.undefined)
    
    inline def setContentModifiedTimestamp(value: js.Date): Self = StObject.set(x, "ContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContentModifiedTimestampUndefined: Self = StObject.set(x, "ContentModifiedTimestamp", js.undefined)
    
    inline def setContentType(value: DocumentContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setCreatorId(value: IdType): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    inline def setId(value: DocumentVersionIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setModifiedTimestamp(value: js.Date): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    inline def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSignature(value: HashType): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSource(value: DocumentSourceUrlMap): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: DocumentStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThumbnail(value: DocumentThumbnailUrlMap): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "Thumbnail", js.undefined)
  }
}
