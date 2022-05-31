package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HemisphericLight
  extends StObject
     with Light {
  
  /**
    * The light reflection direction, not the incoming direction.
    */
  var direction: Vector3 = js.native
  
  /**
    * The groundColor is the light in the opposite direction to the one specified during creation.
    * You can think of the diffuse and specular light as coming from the centre of the object in the given direction and the groundColor light in the opposite direction.
    */
  var groundColor: Color3 = js.native
  
  /**
    * Sets the HemisphericLight direction towards the passed target (Vector3).
    * Returns the updated direction.
    * @param target The target the direction should point to
    * @return The computed direction
    */
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
}
