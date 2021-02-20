package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisMeshNames extends StObject {
  
  var axisMeshNames: js.Array[String] = js.native
  
  var buttonMeshNames: Grip = js.native
  
  var buttonObservableNames: Grip = js.native
  
  var buttons: js.Array[String] = js.native
  
  var pointingPoseMeshName: String = js.native
}
object AxisMeshNames {
  
  @scala.inline
  def apply(
    axisMeshNames: js.Array[String],
    buttonMeshNames: Grip,
    buttonObservableNames: Grip,
    buttons: js.Array[String],
    pointingPoseMeshName: String
  ): AxisMeshNames = {
    val __obj = js.Dynamic.literal(axisMeshNames = axisMeshNames.asInstanceOf[js.Any], buttonMeshNames = buttonMeshNames.asInstanceOf[js.Any], buttonObservableNames = buttonObservableNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], pointingPoseMeshName = pointingPoseMeshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisMeshNames]
  }
  
  @scala.inline
  implicit class AxisMeshNamesMutableBuilder[Self <: AxisMeshNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisMeshNames(value: js.Array[String]): Self = StObject.set(x, "axisMeshNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisMeshNamesVarargs(value: String*): Self = StObject.set(x, "axisMeshNames", js.Array(value :_*))
    
    @scala.inline
    def setButtonMeshNames(value: Grip): Self = StObject.set(x, "buttonMeshNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonObservableNames(value: Grip): Self = StObject.set(x, "buttonObservableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setPointingPoseMeshName(value: String): Self = StObject.set(x, "pointingPoseMeshName", value.asInstanceOf[js.Any])
  }
}
