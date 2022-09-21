package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssistantAssociationResponse extends StObject {
  
  /**
    * The assistant association.
    */
  var assistantAssociation: js.UndefOr[AssistantAssociationData] = js.undefined
}
object CreateAssistantAssociationResponse {
  
  inline def apply(): CreateAssistantAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssistantAssociationResponse]
  }
  
  extension [Self <: CreateAssistantAssociationResponse](x: Self) {
    
    inline def setAssistantAssociation(value: AssistantAssociationData): Self = StObject.set(x, "assistantAssociation", value.asInstanceOf[js.Any])
    
    inline def setAssistantAssociationUndefined: Self = StObject.set(x, "assistantAssociation", js.undefined)
  }
}
