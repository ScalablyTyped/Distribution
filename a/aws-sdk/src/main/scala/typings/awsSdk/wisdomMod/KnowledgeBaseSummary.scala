package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeBaseSummary extends StObject {
  
  /**
    * The description of the knowledge base.
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
    * Configuration information about the external data source.
    */
  var sourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
  
  /**
    * The status of the knowledge base summary.
    */
  var status: KnowledgeBaseStatus
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object KnowledgeBaseSummary {
  
  inline def apply(
    knowledgeBaseArn: Arn,
    knowledgeBaseId: Uuid,
    knowledgeBaseType: KnowledgeBaseType,
    name: Name,
    status: KnowledgeBaseStatus
  ): KnowledgeBaseSummary = {
    val __obj = js.Dynamic.literal(knowledgeBaseArn = knowledgeBaseArn.asInstanceOf[js.Any], knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any], knowledgeBaseType = knowledgeBaseType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeBaseSummary]
  }
  
  extension [Self <: KnowledgeBaseSummary](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKnowledgeBaseArn(value: Arn): Self = StObject.set(x, "knowledgeBaseArn", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseId(value: Uuid): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseType(value: KnowledgeBaseType): Self = StObject.set(x, "knowledgeBaseType", value.asInstanceOf[js.Any])
    
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
