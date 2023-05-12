package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContentRequest extends StObject {
  
  /**
    * The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var contentId: UuidOrArn
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN
    */
  var knowledgeBaseId: UuidOrArn
  
  /**
    * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing data between an external system and Wisdom, you can store an external version identifier as metadata to utilize for determining drift.
    */
  var metadata: js.UndefOr[ContentMetadata] = js.undefined
  
  /**
    * The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for this piece of content. To remove an existing overrideLinkOurUri, exclude this argument and set removeOverrideLinkOutUri to true.
    */
  var overrideLinkOutUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * Unset the existing overrideLinkOutUri if it exists.
    */
  var removeOverrideLinkOutUri: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The revisionId of the content resource to update, taken from an earlier call to GetContent, GetContentSummary, SearchContent, or ListContents. If included, this argument acts as an optimistic lock to ensure content was not modified since it was last read. If it has been modified, this API throws a PreconditionFailedException.
    */
  var revisionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The title of the content.
    */
  var title: js.UndefOr[ContentTitle] = js.undefined
  
  /**
    * A pointer to the uploaded asset. This value is returned by StartContentUpload. 
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}
object UpdateContentRequest {
  
  inline def apply(contentId: UuidOrArn, knowledgeBaseId: UuidOrArn): UpdateContentRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContentRequest] (val x: Self) extends AnyVal {
    
    inline def setContentId(value: UuidOrArn): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ContentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOverrideLinkOutUri(value: Uri): Self = StObject.set(x, "overrideLinkOutUri", value.asInstanceOf[js.Any])
    
    inline def setOverrideLinkOutUriUndefined: Self = StObject.set(x, "overrideLinkOutUri", js.undefined)
    
    inline def setRemoveOverrideLinkOutUri(value: Boolean): Self = StObject.set(x, "removeOverrideLinkOutUri", value.asInstanceOf[js.Any])
    
    inline def setRemoveOverrideLinkOutUriUndefined: Self = StObject.set(x, "removeOverrideLinkOutUri", js.undefined)
    
    inline def setRevisionId(value: NonEmptyString): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setTitle(value: ContentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
