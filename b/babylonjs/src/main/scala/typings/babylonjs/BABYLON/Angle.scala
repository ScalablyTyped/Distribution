package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Angle extends js.Object {
  
  var _radians: js.Any = js.native
  
  /**
    * Get value in degrees
    * @returns the Angle value in degrees (float)
    */
  def degrees(): Double = js.native
  
  /**
    * Get value in radians
    * @returns the Angle value in radians (float)
    */
  def radians(): Double = js.native
}
object Angle {
  
  @scala.inline
  def apply(_radians: js.Any, degrees: () => Double, radians: () => Double): Angle = {
    val __obj = js.Dynamic.literal(_radians = _radians.asInstanceOf[js.Any], degrees = js.Any.fromFunction0(degrees), radians = js.Any.fromFunction0(radians))
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit class AngleOps[Self <: Angle] (val x: Self) extends AnyVal {
    
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
    def set_radians(value: js.Any): Self = this.set("_radians", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegrees(value: () => Double): Self = this.set("degrees", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRadians(value: () => Double): Self = this.set("radians", js.Any.fromFunction0(value))
  }
}
