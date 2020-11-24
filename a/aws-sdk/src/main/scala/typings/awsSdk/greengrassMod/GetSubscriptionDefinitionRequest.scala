package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSubscriptionDefinitionRequest extends js.Object {
  
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
  implicit class GetSubscriptionDefinitionRequestOps[Self <: GetSubscriptionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = this.set("SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
