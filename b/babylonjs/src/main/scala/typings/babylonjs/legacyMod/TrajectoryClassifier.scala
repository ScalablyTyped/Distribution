package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "TrajectoryClassifier")
@js.native
/* private */ open class TrajectoryClassifier ()
  extends typings.babylonjs.indexMod.TrajectoryClassifier
/* static members */
object TrajectoryClassifier {
  
  @JSImport("babylonjs/Legacy/legacy", "TrajectoryClassifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize from JSON.
    * @param json JSON serialization
    * @returns deserialized TrajectorySet
    */
  inline def Deserialize(json: String): typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier]
  
  /**
    * Initialize a new empty TrajectorySet with auto-generated Alphabets.
    * VERY naive, need to be generating these things from known
    * sets. Better version later, probably eliminating this one.
    * @returns auto-generated TrajectorySet
    */
  inline def Generate(): typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Generate")().asInstanceOf[typings.babylonjs.trajectoryClassifierMod.TrajectoryClassifier]
}
