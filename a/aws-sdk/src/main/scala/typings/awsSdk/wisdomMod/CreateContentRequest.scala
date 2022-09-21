package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContentRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
  
  /**
    * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing data between an external system and Wisdom, you can store an external version identifier as metadata to utilize for determining drift.
    */
  var metadata: js.UndefOr[ContentMetadata] = js.undefined
  
  /**
    * The name of the content. Each piece of content in a knowledge base must have a unique name. You can retrieve a piece of content using only its knowledge base and its name with the SearchContent API.
    */
  var name: Name
  
  /**
    * The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument overrides it for this piece of content.
    */
  var overrideLinkOutUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The title of the content. If not set, the title is equal to the name.
    */
  var title: js.UndefOr[ContentTitle] = js.undefined
  
  /**
    * A pointer to the uploaded asset. This value is returned by StartContentUpload.
    */
  var uploadId: NonEmptyString
}
object CreateContentRequest {
  
  inline def apply(knowledgeBaseId: UuidOrArn, name: Name, uploadId: NonEmptyString): CreateContentRequest = {
    val __obj = js.Dynamic.literal(knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContentRequest]
  }
  
  extension [Self <: CreateContentRequest](x: Self) {
    
    inline def setClientToken(value: NonEmptyString): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ContentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverrideLinkOutUri(value: Uri): Self = StObject.set(x, "overrideLinkOutUri", value.asInstanceOf[js.Any])
    
    inline def setOverrideLinkOutUriUndefined: Self = StObject.set(x, "overrideLinkOutUri", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTitle(value: ContentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUploadId(value: NonEmptyString): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
