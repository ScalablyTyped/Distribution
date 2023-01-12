package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the content.
    */
  var contentArn: Arn
  
  /**
    * The identifier of the content.
    */
  var contentId: Uuid
  
  /**
    * The media type of the content.
    */
  var contentType: ContentType
  
  /**
    * The Amazon Resource Name (ARN) of the knowledge base.
    */
  var knowledgeBaseArn: Arn
  
  /**
    * The identifier of the knowledge base.
    */
  var knowledgeBaseId: Uuid
  
  /**
    * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing data between an external system and Wisdom, you can store an external version identifier as metadata to utilize for determining drift.
    */
  var metadata: ContentMetadata
  
  /**
    * The name of the content.
    */
  var name: Name
  
  /**
    * The identifier of the revision of the content.
    */
  var revisionId: NonEmptyString
  
  /**
    * The status of the content.
    */
  var status: ContentStatus
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The title of the content.
    */
  var title: ContentTitle
}
object ContentSummary {
  
  inline def apply(
    contentArn: Arn,
    contentId: Uuid,
    contentType: ContentType,
    knowledgeBaseArn: Arn,
    knowledgeBaseId: Uuid,
    metadata: ContentMetadata,
    name: Name,
    revisionId: NonEmptyString,
    status: ContentStatus,
    title: ContentTitle
  ): ContentSummary = {
    val __obj = js.Dynamic.literal(contentArn = contentArn.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], knowledgeBaseArn = knowledgeBaseArn.asInstanceOf[js.Any], knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSummary] (val x: Self) extends AnyVal {
    
    inline def setContentArn(value: Arn): Self = StObject.set(x, "contentArn", value.asInstanceOf[js.Any])
    
    inline def setContentId(value: Uuid): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseArn(value: Arn): Self = StObject.set(x, "knowledgeBaseArn", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseId(value: Uuid): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ContentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: NonEmptyString): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ContentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTitle(value: ContentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
