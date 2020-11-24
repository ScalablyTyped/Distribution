package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunBeforeTestRunHooks. */
@js.native
trait ICommandRunBeforeTestRunHooks extends js.Object {
  
  /** CommandRunBeforeTestRunHooks actionId */
  var actionId: js.UndefOr[String | Null] = js.native
}
object ICommandRunBeforeTestRunHooks {
  
  @scala.inline
  def apply(): ICommandRunBeforeTestRunHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunBeforeTestRunHooks]
  }
  
  @scala.inline
  implicit class ICommandRunBeforeTestRunHooksOps[Self <: ICommandRunBeforeTestRunHooks] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setActionIdNull: Self = this.set("actionId", null)
  }
}
