package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyEnvironmentManagedActionResult extends js.Object {
  
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  
  /**
    * The action ID of the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  
  /**
    * The status of the managed action.
    */
  var Status: js.UndefOr[String] = js.native
}
object ApplyEnvironmentManagedActionResult {
  
  @scala.inline
  def apply(): ApplyEnvironmentManagedActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
  }
  
  @scala.inline
  implicit class ApplyEnvironmentManagedActionResultOps[Self <: ApplyEnvironmentManagedActionResult] (val x: Self) extends AnyVal {
    
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
    def setActionDescription(value: String): Self = this.set("ActionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionDescription: Self = this.set("ActionDescription", js.undefined)
    
    @scala.inline
    def setActionId(value: String): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("ActionId", js.undefined)
    
    @scala.inline
    def setActionType(value: ActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("ActionType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
