package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMitigationActionResponse extends js.Object {
  
  /**
    * The ARN for the new mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  
  /**
    * A unique identifier for the mitigation action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
}
object UpdateMitigationActionResponse {
  
  @scala.inline
  def apply(): UpdateMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMitigationActionResponse]
  }
  
  @scala.inline
  implicit class UpdateMitigationActionResponseOps[Self <: UpdateMitigationActionResponse] (val x: Self) extends AnyVal {
    
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
    def setActionArn(value: MitigationActionArn): Self = this.set("actionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionArn: Self = this.set("actionArn", js.undefined)
    
    @scala.inline
    def setActionId(value: MitigationActionId): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
  }
}
