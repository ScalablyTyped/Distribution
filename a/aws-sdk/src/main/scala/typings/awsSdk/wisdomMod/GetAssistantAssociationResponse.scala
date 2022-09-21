package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssistantAssociationResponse extends StObject {
  
  /**
    * The assistant association.
    */
  var assistantAssociation: js.UndefOr[AssistantAssociationData] = js.undefined
}
object GetAssistantAssociationResponse {
  
  inline def apply(): GetAssistantAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssistantAssociationResponse]
  }
  
  extension [Self <: GetAssistantAssociationResponse](x: Self) {
    
    inline def setAssistantAssociation(value: AssistantAssociationData): Self = StObject.set(x, "assistantAssociation", value.asInstanceOf[js.Any])
    
    inline def setAssistantAssociationUndefined: Self = StObject.set(x, "assistantAssociation", js.undefined)
  }
}
