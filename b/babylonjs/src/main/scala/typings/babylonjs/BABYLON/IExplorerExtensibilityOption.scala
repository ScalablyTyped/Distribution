package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExplorerExtensibilityOption extends js.Object {
  
  /**
    * Defines the action to execute on click
    */
  def action(entity: js.Any): Unit = js.native
  
  /**
    * Define the option label
    */
  var label: String = js.native
}
object IExplorerExtensibilityOption {
  
  @scala.inline
  def apply(action: js.Any => Unit, label: String): IExplorerExtensibilityOption = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerExtensibilityOption]
  }
  
  @scala.inline
  implicit class IExplorerExtensibilityOptionOps[Self <: IExplorerExtensibilityOption] (val x: Self) extends AnyVal {
    
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
    def setAction(value: js.Any => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
