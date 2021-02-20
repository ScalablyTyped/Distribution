package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubscriptionDefinitionRequest extends StObject {
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string = js.native
}
object UpdateSubscriptionDefinitionRequest {
  
  @scala.inline
  def apply(SubscriptionDefinitionId: string): UpdateSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriptionDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateSubscriptionDefinitionRequestMutableBuilder[Self <: UpdateSubscriptionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
