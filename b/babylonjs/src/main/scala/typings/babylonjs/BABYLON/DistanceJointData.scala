package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceJointData
  extends StObject
     with PhysicsJointData {
  
  /**
    * Max distance the 2 joint objects can be apart
    */
  var maxDistance: Double
}
object DistanceJointData {
  
  inline def apply(maxDistance: Double): DistanceJointData = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceJointData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceJointData] (val x: Self) extends AnyVal {
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
  }
}
