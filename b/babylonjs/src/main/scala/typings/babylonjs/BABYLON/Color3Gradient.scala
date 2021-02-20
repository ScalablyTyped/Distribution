package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
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
  implicit class Color3GradientMutableBuilder[Self <: Color3Gradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
