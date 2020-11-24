package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color3Gradient extends IValueGradient {
  
  /**
    * Gets or sets the associated color
    */
  var color: Color3 = js.native
}
object Color3Gradient {
  
  @scala.inline
  def apply(color: Color3, gradient: Double): Color3Gradient = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color3Gradient]
  }
  
  @scala.inline
  implicit class Color3GradientOps[Self <: Color3Gradient] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color3): Self = this.set("color", value.asInstanceOf[js.Any])
  }
}
