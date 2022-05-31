package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color3Gradient
  extends StObject
     with IValueGradient {
  
  /**
    * Gets or sets the associated color
    */
  var color: Color3
}
object Color3Gradient {
  
  inline def apply(color: Color3, gradient: Double): Color3Gradient = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color3Gradient]
  }
  
  extension [Self <: Color3Gradient](x: Self) {
    
    inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
