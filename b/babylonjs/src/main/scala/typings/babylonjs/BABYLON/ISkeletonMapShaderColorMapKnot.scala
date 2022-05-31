package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISkeletonMapShaderColorMapKnot extends StObject {
  
  /** Color of the Knot */
  var color: Color3
  
  /** Location of the Knot */
  var location: Double
}
object ISkeletonMapShaderColorMapKnot {
  
  inline def apply(color: Color3, location: Double): ISkeletonMapShaderColorMapKnot = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkeletonMapShaderColorMapKnot]
  }
  
  extension [Self <: ISkeletonMapShaderColorMapKnot](x: Self) {
    
    inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
