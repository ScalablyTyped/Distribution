package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TrajectoryClassifier")
@js.native
/* private */ class TrajectoryClassifier ()
  extends StObject
     with typings.babylonjs.BABYLON.TrajectoryClassifier {
  
  /* private */ /* CompleteClass */
  var _levenshteinAlphabet: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _maximumAllowableMatchCost: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _nameToDescribedTrajectory: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _vector3Alphabet: js.Any = js.native
  
  /**
    * Add a new Trajectory to the set with a given name.
    * @param trajectory new Trajectory to be added
    * @param classification name to which to add the Trajectory
    */
  /* CompleteClass */
  override def addTrajectoryToClassification(trajectory: typings.babylonjs.BABYLON.Trajectory, classification: String): Unit = js.native
  
  /**
    * Attempt to recognize a Trajectory from among all the classifications
    * already known to the classifier.
    * @param trajectory Trajectory to be recognized
    * @returns classification of Trajectory if recognized, null otherwise
    */
  /* CompleteClass */
  override def classifyTrajectory(trajectory: typings.babylonjs.BABYLON.Trajectory): Nullable[String] = js.native
  
  /**
    * Remove a known named trajectory and all Trajectories associated with it.
    * @param classification name to remove
    * @returns whether anything was removed
    */
  /* CompleteClass */
  override def deleteClassification(classification: String): Boolean = js.native
  
  /**
    * Serialize to JSON.
    * @returns JSON serialization
    */
  /* CompleteClass */
  override def serialize(): String = js.native
}
/* static members */
object TrajectoryClassifier {
  
  @JSGlobal("BABYLON.TrajectoryClassifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize from JSON.
    * @param json JSON serialization
    * @returns deserialized TrajectorySet
    */
  inline def Deserialize(json: String): typings.babylonjs.BABYLON.TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.TrajectoryClassifier]
  
  /**
    * Initialize a new empty TrajectorySet with auto-generated Alphabets.
    * VERY naive, need to be generating these things from known
    * sets. Better version later, probably eliminating this one.
    * @returns auto-generated TrajectorySet
    */
  inline def Generate(): typings.babylonjs.BABYLON.TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Generate")().asInstanceOf[typings.babylonjs.BABYLON.TrajectoryClassifier]
}
