package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssistantAssociationRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
  
  /**
    * The identifier of the associated resource.
    */
  var association: AssistantAssociationInputData
  
  /**
    * The type of association.
    */
  var associationType: AssociationType
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateAssistantAssociationRequest {
  
  inline def apply(
    assistantId: UuidOrArn,
    association: AssistantAssociationInputData,
    associationType: AssociationType
  ): CreateAssistantAssociationRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any], association = association.asInstanceOf[js.Any], associationType = associationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssistantAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssistantAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setAssociation(value: AssistantAssociationInputData): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationType(value: AssociationType): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
