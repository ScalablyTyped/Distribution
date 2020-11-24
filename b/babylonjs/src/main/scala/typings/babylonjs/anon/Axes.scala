package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axes extends js.Object {
  
  var axes: Xrstandardthumbstick = js.native
  
  var buttons: Xrstandardsqueeze = js.native
  
  var defaultAxis: MaxNodeName = js.native
  
  var defaultButton: PressedNodeName = js.native
}
object Axes {
  
  @scala.inline
  def apply(
    axes: Xrstandardthumbstick,
    buttons: Xrstandardsqueeze,
    defaultAxis: MaxNodeName,
    defaultButton: PressedNodeName
  ): Axes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultAxis = defaultAxis.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
  
  @scala.inline
  implicit class AxesOps[Self <: Axes] (val x: Self) extends AnyVal {
    
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
    def setAxes(value: Xrstandardthumbstick): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Xrstandardsqueeze): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAxis(value: MaxNodeName): Self = this.set("defaultAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultButton(value: PressedNodeName): Self = this.set("defaultButton", value.asInstanceOf[js.Any])
  }
}
