package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSubscriptionDefinitionRequest extends StObject {
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string = js.native
}
object GetSubscriptionDefinitionRequest {
  
  @scala.inline
  def apply(SubscriptionDefinitionId: string): GetSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetSubscriptionDefinitionRequestMutableBuilder[Self <: GetSubscriptionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
