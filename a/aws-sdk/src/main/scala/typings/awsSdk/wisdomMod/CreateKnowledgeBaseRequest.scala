package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKnowledgeBaseRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The type of knowledge base. Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases support integrations with third-party systems whose content is synchronized automatically. 
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
    * The source of the knowledge base content. Only set this argument for EXTERNAL knowledge bases.
    */
  var sourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateKnowledgeBaseRequest {
  
  inline def apply(knowledgeBaseType: KnowledgeBaseType, name: Name): CreateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal(knowledgeBaseType = knowledgeBaseType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKnowledgeBaseRequest]
  }
  
  extension [Self <: CreateKnowledgeBaseRequest](x: Self) {
    
    inline def setClientToken(value: NonEmptyString): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKnowledgeBaseType(value: KnowledgeBaseType): Self = StObject.set(x, "knowledgeBaseType", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRenderingConfiguration(value: RenderingConfiguration): Self = StObject.set(x, "renderingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRenderingConfigurationUndefined: Self = StObject.set(x, "renderingConfiguration", js.undefined)
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "serverSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "serverSideEncryptionConfiguration", js.undefined)
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "sourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigurationUndefined: Self = StObject.set(x, "sourceConfiguration", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
