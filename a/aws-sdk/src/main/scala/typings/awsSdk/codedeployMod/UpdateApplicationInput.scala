package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationInput extends js.Object {
  
  /**
    * The current name of the application you want to change.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  
  /**
    * The new name to give the application.
    */
  var newApplicationName: js.UndefOr[ApplicationName] = js.native
}
object UpdateApplicationInput {
  
  @scala.inline
  def apply(): UpdateApplicationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationInput]
  }
  
  @scala.inline
  implicit class UpdateApplicationInputOps[Self <: UpdateApplicationInput] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setNewApplicationName(value: ApplicationName): Self = this.set("newApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewApplicationName: Self = this.set("newApplicationName", js.undefined)
  }
}
