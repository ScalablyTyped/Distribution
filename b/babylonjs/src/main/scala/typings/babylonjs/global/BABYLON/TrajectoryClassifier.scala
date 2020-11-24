package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TrajectoryClassifier")
@js.native
class TrajectoryClassifier protected ()
  extends typings.babylonjs.BABYLON.TrajectoryClassifier
/* static members */
@JSGlobal("BABYLON.TrajectoryClassifier")
@js.native
object TrajectoryClassifier extends js.Object {
  
  /**
    * Deserialize from JSON.
    * @param json JSON serialization
    * @returns deserialized TrajectorySet
    */
  def Deserialize(json: String): typings.babylonjs.BABYLON.TrajectoryClassifier = js.native
  
  /**
    * Initialize a new empty TrajectorySet with auto-generated Alphabets.
    * VERY naive, need to be generating these things from known
    * sets. Better version later, probably eliminating this one.
    * @returns auto-generated TrajectorySet
    */
  def Generate(): typings.babylonjs.BABYLON.TrajectoryClassifier = js.native
}
