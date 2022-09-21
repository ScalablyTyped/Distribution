package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssistantSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Wisdom assistant.
    */
  var assistantArn: Arn
  
  /**
    * The identifier of the Wisdom assistant.
    */
  var assistantId: Uuid
  
  /**
    * The description of the assistant.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the assistant.
    */
  var name: Name
  
  /**
    * The KMS key used for encryption.
    */
  var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined
  
  /**
    * The status of the assistant.
    */
  var status: AssistantStatus
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The type of the assistant.
    */
  var `type`: AssistantType
}
object AssistantSummary {
  
  inline def apply(assistantArn: Arn, assistantId: Uuid, name: Name, status: AssistantStatus, `type`: AssistantType): AssistantSummary = {
    val __obj = js.Dynamic.literal(assistantArn = assistantArn.asInstanceOf[js.Any], assistantId = assistantId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistantSummary]
  }
  
  extension [Self <: AssistantSummary](x: Self) {
    
    inline def setAssistantArn(value: Arn): Self = StObject.set(x, "assistantArn", value.asInstanceOf[js.Any])
    
    inline def setAssistantId(value: Uuid): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "serverSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "serverSideEncryptionConfiguration", js.undefined)
    
    inline def setStatus(value: AssistantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: AssistantType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
