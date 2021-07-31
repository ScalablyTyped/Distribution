package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubscriptionDefinitionRequest extends StObject {
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
}
object DeleteSubscriptionDefinitionRequest {
  
  @scala.inline
  def apply(SubscriptionDefinitionId: string): DeleteSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriptionDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteSubscriptionDefinitionRequestMutableBuilder[Self <: DeleteSubscriptionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
