package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriptionDefinitionRequest extends js.Object {
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
  implicit class UpdateSubscriptionDefinitionRequestOps[Self <: UpdateSubscriptionDefinitionRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

