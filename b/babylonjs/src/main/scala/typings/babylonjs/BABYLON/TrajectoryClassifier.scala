package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrajectoryClassifier extends StObject {
  
  var _levenshteinAlphabet: js.Any = js.native
  
  var _maximumAllowableMatchCost: js.Any = js.native
  
  var _nameToDescribedTrajectory: js.Any = js.native
  
  var _vector3Alphabet: js.Any = js.native
  
  /**
    * Add a new Trajectory to the set with a given name.
    * @param trajectory new Trajectory to be added
    * @param classification name to which to add the Trajectory
    */
  def addTrajectoryToClassification(trajectory: Trajectory, classification: String): Unit = js.native
  
  /**
    * Attempt to recognize a Trajectory from among all the classifications
    * already known to the classifier.
    * @param trajectory Trajectory to be recognized
    * @returns classification of Trajectory if recognized, null otherwise
    */
  def classifyTrajectory(trajectory: Trajectory): Nullable[String] = js.native
  
  /**
    * Remove a known named trajectory and all Trajectories associated with it.
    * @param classification name to remove
    * @returns whether anything was removed
    */
  def deleteClassification(classification: String): Boolean = js.native
  
  /**
    * Serialize to JSON.
    * @returns JSON serialization
    */
  def serialize(): String = js.native
}
object TrajectoryClassifier {
  
  @scala.inline
  def apply(
    _levenshteinAlphabet: js.Any,
    _maximumAllowableMatchCost: js.Any,
    _nameToDescribedTrajectory: js.Any,
    _vector3Alphabet: js.Any,
    addTrajectoryToClassification: (Trajectory, String) => Unit,
    classifyTrajectory: Trajectory => Nullable[String],
    deleteClassification: String => Boolean,
    serialize: () => String
  ): TrajectoryClassifier = {
    val __obj = js.Dynamic.literal(_levenshteinAlphabet = _levenshteinAlphabet.asInstanceOf[js.Any], _maximumAllowableMatchCost = _maximumAllowableMatchCost.asInstanceOf[js.Any], _nameToDescribedTrajectory = _nameToDescribedTrajectory.asInstanceOf[js.Any], _vector3Alphabet = _vector3Alphabet.asInstanceOf[js.Any], addTrajectoryToClassification = js.Any.fromFunction2(addTrajectoryToClassification), classifyTrajectory = js.Any.fromFunction1(classifyTrajectory), deleteClassification = js.Any.fromFunction1(deleteClassification), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[TrajectoryClassifier]
  }
  
  @scala.inline
  implicit class TrajectoryClassifierMutableBuilder[Self <: TrajectoryClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTrajectoryToClassification(value: (Trajectory, String) => Unit): Self = StObject.set(x, "addTrajectoryToClassification", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassifyTrajectory(value: Trajectory => Nullable[String]): Self = StObject.set(x, "classifyTrajectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteClassification(value: String => Boolean): Self = StObject.set(x, "deleteClassification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: () => String): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_levenshteinAlphabet(value: js.Any): Self = StObject.set(x, "_levenshteinAlphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_maximumAllowableMatchCost(value: js.Any): Self = StObject.set(x, "_maximumAllowableMatchCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameToDescribedTrajectory(value: js.Any): Self = StObject.set(x, "_nameToDescribedTrajectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vector3Alphabet(value: js.Any): Self = StObject.set(x, "_vector3Alphabet", value.asInstanceOf[js.Any])
  }
}
