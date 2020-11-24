package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisMeshNames extends js.Object {
  
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
  implicit class AxisMeshNamesOps[Self <: AxisMeshNames] (val x: Self) extends AnyVal {
    
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
    def setAxisMeshNamesVarargs(value: String*): Self = this.set("axisMeshNames", js.Array(value :_*))
    
    @scala.inline
    def setAxisMeshNames(value: js.Array[String]): Self = this.set("axisMeshNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonMeshNames(value: Grip): Self = this.set("buttonMeshNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonObservableNames(value: Grip): Self = this.set("buttonObservableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: String*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointingPoseMeshName(value: String): Self = this.set("pointingPoseMeshName", value.asInstanceOf[js.Any])
  }
}
