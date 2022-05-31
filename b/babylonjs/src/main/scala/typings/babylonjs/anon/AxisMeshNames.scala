package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisMeshNames extends StObject {
  
  var axisMeshNames: js.Array[String]
  
  var buttonMeshNames: Grip
  
  var buttonObservableNames: Grip
  
  var buttons: js.Array[String]
  
  var pointingPoseMeshName: String
}
object AxisMeshNames {
  
  inline def apply(
    axisMeshNames: js.Array[String],
    buttonMeshNames: Grip,
    buttonObservableNames: Grip,
    buttons: js.Array[String],
    pointingPoseMeshName: String
  ): AxisMeshNames = {
    val __obj = js.Dynamic.literal(axisMeshNames = axisMeshNames.asInstanceOf[js.Any], buttonMeshNames = buttonMeshNames.asInstanceOf[js.Any], buttonObservableNames = buttonObservableNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], pointingPoseMeshName = pointingPoseMeshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisMeshNames]
  }
  
  extension [Self <: AxisMeshNames](x: Self) {
    
    inline def setAxisMeshNames(value: js.Array[String]): Self = StObject.set(x, "axisMeshNames", value.asInstanceOf[js.Any])
    
    inline def setAxisMeshNamesVarargs(value: String*): Self = StObject.set(x, "axisMeshNames", js.Array(value :_*))
    
    inline def setButtonMeshNames(value: Grip): Self = StObject.set(x, "buttonMeshNames", value.asInstanceOf[js.Any])
    
    inline def setButtonObservableNames(value: Grip): Self = StObject.set(x, "buttonObservableNames", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setPointingPoseMeshName(value: String): Self = StObject.set(x, "pointingPoseMeshName", value.asInstanceOf[js.Any])
  }
}
