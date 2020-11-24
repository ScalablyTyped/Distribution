package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactFlowResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var ContactFlowArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the contact flow.
    */
  var ContactFlowId: js.UndefOr[typings.awsSdk.connectMod.ContactFlowId] = js.native
}
object CreateContactFlowResponse {
  
  @scala.inline
  def apply(): CreateContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactFlowResponse]
  }
  
  @scala.inline
  implicit class CreateContactFlowResponseOps[Self <: CreateContactFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContactFlowArn(value: ARN): Self = this.set("ContactFlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactFlowArn: Self = this.set("ContactFlowArn", js.undefined)
    
    @scala.inline
    def setContactFlowId(value: ContactFlowId): Self = this.set("ContactFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactFlowId: Self = this.set("ContactFlowId", js.undefined)
  }
}
