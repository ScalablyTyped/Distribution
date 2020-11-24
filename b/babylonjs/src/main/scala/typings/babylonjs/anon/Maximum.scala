package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maximum extends js.Object {
  
  var maximum: Vector3 = js.native
  
  var minimum: Vector3 = js.native
}
object Maximum {
  
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): Maximum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximum]
  }
  
  @scala.inline
  implicit class MaximumOps[Self <: Maximum] (val x: Self) extends AnyVal {
    
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
    def setMaximum(value: Vector3): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Vector3): Self = this.set("minimum", value.asInstanceOf[js.Any])
  }
}
