package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingAction extends js.Object {
  
  /**
    * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates that an entity invoked an API operation for the resource.
    */
  var actionType: js.UndefOr[FindingActionType] = js.native
  
  /**
    * The invocation details of the API operation that an entity invoked for the affected resource, if the value for the actionType property is AWS_API_CALL.
    */
  var apiCallDetails: js.UndefOr[ApiCallDetails] = js.native
}
object FindingAction {
  
  @scala.inline
  def apply(): FindingAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingAction]
  }
  
  @scala.inline
  implicit class FindingActionOps[Self <: FindingAction] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: FindingActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setApiCallDetails(value: ApiCallDetails): Self = this.set("apiCallDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiCallDetails: Self = this.set("apiCallDetails", js.undefined)
  }
}
