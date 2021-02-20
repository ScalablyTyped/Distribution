package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TrajectoryClassifier")
@js.native
class TrajectoryClassifier protected ()
  extends typings.babylonjs.BABYLON.TrajectoryClassifier
/* static members */
object TrajectoryClassifier {
  
  /**
    * Deserialize from JSON.
    * @param json JSON serialization
    * @returns deserialized TrajectorySet
    */
  @JSGlobal("BABYLON.TrajectoryClassifier.Deserialize")
  @js.native
  def Deserialize(json: String): typings.babylonjs.BABYLON.TrajectoryClassifier = js.native
  
  /**
    * Initialize a new empty TrajectorySet with auto-generated Alphabets.
    * VERY naive, need to be generating these things from known
    * sets. Better version later, probably eliminating this one.
    * @returns auto-generated TrajectorySet
    */
  @JSGlobal("BABYLON.TrajectoryClassifier.Generate")
  @js.native
  def Generate(): typings.babylonjs.BABYLON.TrajectoryClassifier = js.native
}
