package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssistantAssociationData extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Wisdom assistant.
    */
  var assistantArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the assistant association.
    */
  var assistantAssociationArn: Arn
  
  /**
    * The identifier of the assistant association.
    */
  var assistantAssociationId: Uuid
  
  /**
    * The identifier of the Wisdom assistant.
    */
  var assistantId: Uuid
  
  /**
    * A union type that currently has a single argument, the knowledge base ID.
    */
  var associationData: AssistantAssociationOutputData
  
  /**
    * The type of association.
    */
  var associationType: AssociationType
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object AssistantAssociationData {
  
  inline def apply(
    assistantArn: Arn,
    assistantAssociationArn: Arn,
    assistantAssociationId: Uuid,
    assistantId: Uuid,
    associationData: AssistantAssociationOutputData,
    associationType: AssociationType
  ): AssistantAssociationData = {
    val __obj = js.Dynamic.literal(assistantArn = assistantArn.asInstanceOf[js.Any], assistantAssociationArn = assistantAssociationArn.asInstanceOf[js.Any], assistantAssociationId = assistantAssociationId.asInstanceOf[js.Any], assistantId = assistantId.asInstanceOf[js.Any], associationData = associationData.asInstanceOf[js.Any], associationType = associationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistantAssociationData]
  }
  
  extension [Self <: AssistantAssociationData](x: Self) {
    
    inline def setAssistantArn(value: Arn): Self = StObject.set(x, "assistantArn", value.asInstanceOf[js.Any])
    
    inline def setAssistantAssociationArn(value: Arn): Self = StObject.set(x, "assistantAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setAssistantAssociationId(value: Uuid): Self = StObject.set(x, "assistantAssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssistantId(value: Uuid): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setAssociationData(value: AssistantAssociationOutputData): Self = StObject.set(x, "associationData", value.asInstanceOf[js.Any])
    
    inline def setAssociationType(value: AssociationType): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
