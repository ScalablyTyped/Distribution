package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
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
  implicit class DistanceJointDataMutableBuilder[Self <: DistanceJointData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
  }
}
