package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeBaseData extends StObject {
  
  /**
    * The description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the knowledge base.
    */
  var knowledgeBaseArn: Arn
  
  /**
    * The identifier of the knowledge base.
    */
  var knowledgeBaseId: Uuid
  
  /**
    * The type of knowledge base.
    */
  var knowledgeBaseType: KnowledgeBaseType
  
  /**
    * An epoch timestamp indicating the most recent content modification inside the knowledge base. If no content exists in a knowledge base, this value is unset.
    */
  var lastContentModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the knowledge base.
    */
  var name: Name
  
  /**
    * Information about how to render the content.
    */
  var renderingConfiguration: js.UndefOr[RenderingConfiguration] = js.undefined
  
  /**
    * The KMS key used for encryption.
    */
  var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined
  
  /**
    * Source configuration information about the knowledge base.
    */
  var sourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
  
  /**
    * The status of the knowledge base.
    */
  var status: KnowledgeBaseStatus
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object KnowledgeBaseData {
  
  inline def apply(
    knowledgeBaseArn: Arn,
    knowledgeBaseId: Uuid,
    knowledgeBaseType: KnowledgeBaseType,
    name: Name,
    status: KnowledgeBaseStatus
  ): KnowledgeBaseData = {
    val __obj = js.Dynamic.literal(knowledgeBaseArn = knowledgeBaseArn.asInstanceOf[js.Any], knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any], knowledgeBaseType = knowledgeBaseType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeBaseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeBaseData] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKnowledgeBaseArn(value: Arn): Self = StObject.set(x, "knowledgeBaseArn", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseId(value: Uuid): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseType(value: KnowledgeBaseType): Self = StObject.set(x, "knowledgeBaseType", value.asInstanceOf[js.Any])
    
    inline def setLastContentModificationTime(value: js.Date): Self = StObject.set(x, "lastContentModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastContentModificationTimeUndefined: Self = StObject.set(x, "lastContentModificationTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRenderingConfiguration(value: RenderingConfiguration): Self = StObject.set(x, "renderingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRenderingConfigurationUndefined: Self = StObject.set(x, "renderingConfiguration", js.undefined)
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "serverSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "serverSideEncryptionConfiguration", js.undefined)
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "sourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigurationUndefined: Self = StObject.set(x, "sourceConfiguration", js.undefined)
    
    inline def setStatus(value: KnowledgeBaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
