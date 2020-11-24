package typings.babylonjs.engineWebVRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVRPresentationAttributes extends js.Object {
  
  /**
    * Enables foveation in VR to improve perf. 0 none, 1 low, 2 medium, 3 high (Default is 1)
    */
  var foveationLevel: Double = js.native
  
  /**
    * Defines a boolean indicating that we want to get 72hz mode on Oculus Browser (default is off eg. 60hz)
    */
  var highRefreshRate: Boolean = js.native
}
object IVRPresentationAttributes {
  
  @scala.inline
  def apply(foveationLevel: Double, highRefreshRate: Boolean): IVRPresentationAttributes = {
    val __obj = js.Dynamic.literal(foveationLevel = foveationLevel.asInstanceOf[js.Any], highRefreshRate = highRefreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVRPresentationAttributes]
  }
  
  @scala.inline
  implicit class IVRPresentationAttributesOps[Self <: IVRPresentationAttributes] (val x: Self) extends AnyVal {
    
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
    def setFoveationLevel(value: Double): Self = this.set("foveationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighRefreshRate(value: Boolean): Self = this.set("highRefreshRate", value.asInstanceOf[js.Any])
  }
}
