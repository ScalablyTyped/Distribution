package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectorContextMenuItem extends StObject {
  
  /**
    * Callback function that will be called when the menu item is selected
    * @param entity the entity that is currently selected in the scene explorer
    */
  def action(): Unit = js.native
  def action(entity: Any): Unit = js.native
  
  /**
    * Display label - menu item
    */
  var label: String = js.native
}
