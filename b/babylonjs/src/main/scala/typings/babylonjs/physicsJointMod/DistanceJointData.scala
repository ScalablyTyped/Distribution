package typings.babylonjs.physicsJointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceJointData extends PhysicsJointData {
  
  /**
    * Max distance the 2 joint objects can be apart
    */
  var maxDistance: Double = js.native
}
object DistanceJointData {
  
  @scala.inline
  def apply(maxDistance: Double): DistanceJointData = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceJointData]
  }
  
  @scala.inline
  implicit class DistanceJointDataOps[Self <: DistanceJointData] (val x: Self) extends AnyVal {
    
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
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
  }
}
