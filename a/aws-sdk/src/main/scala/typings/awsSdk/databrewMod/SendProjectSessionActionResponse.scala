package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendProjectSessionActionResponse extends js.Object {
  
  /**
    * A unique identifier for the action that was performed.
    */
  var ActionId: js.UndefOr[typings.awsSdk.databrewMod.ActionId] = js.native
  
  /**
    * The name of the project that was affected by the action.
    */
  var Name: ProjectName = js.native
  
  /**
    * A message indicating the result of performing the action.
    */
  var Result: js.UndefOr[typings.awsSdk.databrewMod.Result] = js.native
}
object SendProjectSessionActionResponse {
  
  @scala.inline
  def apply(Name: ProjectName): SendProjectSessionActionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendProjectSessionActionResponse]
  }
  
  @scala.inline
  implicit class SendProjectSessionActionResponseOps[Self <: SendProjectSessionActionResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: ProjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionId(value: ActionId): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("ActionId", js.undefined)
    
    @scala.inline
    def setResult(value: Result): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
}
