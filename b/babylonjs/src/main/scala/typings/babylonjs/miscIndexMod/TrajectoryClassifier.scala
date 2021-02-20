package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "TrajectoryClassifier")
@js.native
class TrajectoryClassifier protected ()
  extends typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier
/* static members */
object TrajectoryClassifier {
  
  /**
    * Deserialize from JSON.
    * @param json JSON serialization
    * @returns deserialized TrajectorySet
    */
  @JSImport("babylonjs/Misc/index", "TrajectoryClassifier.Deserialize")
  @js.native
  def Deserialize(json: String): typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier = js.native
  
  /**
    * Initialize a new empty TrajectorySet with auto-generated Alphabets.
    * VERY naive, need to be generating these things from known
    * sets. Better version later, probably eliminating this one.
    * @returns auto-generated TrajectorySet
    */
  @JSImport("babylonjs/Misc/index", "TrajectoryClassifier.Generate")
  @js.native
  def Generate(): typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier = js.native
}
