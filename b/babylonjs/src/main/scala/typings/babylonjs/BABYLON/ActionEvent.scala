package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionEvent
  extends StObject
     with IActionEvent
object ActionEvent {
  
  inline def apply(pointerX: Double, pointerY: Double, source: Any): ActionEvent = {
    val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], meshUnderPointer = null)
    __obj.asInstanceOf[ActionEvent]
  }
}
