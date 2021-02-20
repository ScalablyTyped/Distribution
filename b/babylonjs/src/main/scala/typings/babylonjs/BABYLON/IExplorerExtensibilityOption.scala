package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExplorerExtensibilityOption extends StObject {
  
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
  implicit class IExplorerExtensibilityOptionMutableBuilder[Self <: IExplorerExtensibilityOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Any => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
