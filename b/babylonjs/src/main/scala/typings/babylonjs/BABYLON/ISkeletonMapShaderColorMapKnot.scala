package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonMapShaderColorMapKnot extends js.Object {
  
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
  implicit class ISkeletonMapShaderColorMapKnotOps[Self <: ISkeletonMapShaderColorMapKnot] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
  }
}
