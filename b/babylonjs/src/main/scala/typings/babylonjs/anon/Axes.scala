package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axes extends StObject {
  
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
  implicit class AxesMutableBuilder[Self <: Axes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: Xrstandardthumbstick): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Xrstandardsqueeze): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAxis(value: MaxNodeName): Self = StObject.set(x, "defaultAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultButton(value: PressedNodeName): Self = StObject.set(x, "defaultButton", value.asInstanceOf[js.Any])
  }
}
