package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonMapShaderColorMapKnot extends StObject {
  
  /** Color of the Knot */
  var color: Color3 = js.native
  
  /** Location of the Knot */
  var location: Double = js.native
}
object ISkeletonMapShaderColorMapKnot {
  
  @scala.inline
  def apply(color: Color3, location: Double): ISkeletonMapShaderColorMapKnot = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkeletonMapShaderColorMapKnot]
  }
  
  @scala.inline
  implicit class ISkeletonMapShaderColorMapKnotMutableBuilder[Self <: ISkeletonMapShaderColorMapKnot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
