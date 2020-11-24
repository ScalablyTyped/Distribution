package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackSetDriftInput extends js.Object {
  
  /**
    *  The ID of the stack set operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  
  /**
    * The name of the stack set on which to perform the drift detection operation.
    */
  var StackSetName: StackSetNameOrId = js.native
}
object DetectStackSetDriftInput {
  
  @scala.inline
  def apply(StackSetName: StackSetNameOrId): DetectStackSetDriftInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackSetDriftInput]
  }
  
  @scala.inline
  implicit class DetectStackSetDriftInputOps[Self <: DetectStackSetDriftInput] (val x: Self) extends AnyVal {
    
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
    def setStackSetName(value: StackSetNameOrId): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
    
    @scala.inline
    def setOperationPreferences(value: StackSetOperationPreferences): Self = this.set("OperationPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationPreferences: Self = this.set("OperationPreferences", js.undefined)
  }
}
