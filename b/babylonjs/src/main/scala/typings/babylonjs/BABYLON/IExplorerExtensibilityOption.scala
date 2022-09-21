package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExplorerExtensibilityOption extends StObject {
  
  /**
    * Defines the action to execute on click
    */
  def action(entity: Any): Unit
  
  /**
    * Define the option label
    */
  var label: String
}
object IExplorerExtensibilityOption {
  
  inline def apply(action: Any => Unit, label: String): IExplorerExtensibilityOption = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerExtensibilityOption]
  }
  
  extension [Self <: IExplorerExtensibilityOption](x: Self) {
    
    inline def setAction(value: Any => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
