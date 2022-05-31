package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceJoint
  extends StObject
     with PhysicsJoint {
  
  /**
    * Update the predefined distance.
    * @param maxDistance The maximum preferred distance
    * @param minDistance The minimum preferred distance
    */
  def updateDistance(maxDistance: Double): Unit = js.native
  def updateDistance(maxDistance: Double, minDistance: Double): Unit = js.native
}
