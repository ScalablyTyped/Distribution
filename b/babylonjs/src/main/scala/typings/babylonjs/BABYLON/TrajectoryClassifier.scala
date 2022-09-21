package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrajectoryClassifier extends StObject {
  
  /* private */ var _levenshteinAlphabet: Any
  
  /* private */ var _maximumAllowableMatchCost: Any
  
  /* private */ var _nameToDescribedTrajectory: Any
  
  /* private */ var _vector3Alphabet: Any
  
  /**
    * Add a new Trajectory to the set with a given name.
    * @param trajectory new Trajectory to be added
    * @param classification name to which to add the Trajectory
    */
  def addTrajectoryToClassification(trajectory: Trajectory, classification: String): Unit
  
  /**
    * Attempt to recognize a Trajectory from among all the classifications
    * already known to the classifier.
    * @param trajectory Trajectory to be recognized
    * @returns classification of Trajectory if recognized, null otherwise
    */
  def classifyTrajectory(trajectory: Trajectory): Nullable[String]
  
  /**
    * Remove a known named trajectory and all Trajectories associated with it.
    * @param classification name to remove
    * @returns whether anything was removed
    */
  def deleteClassification(classification: String): Boolean
  
  /**
    * Serialize to JSON.
    * @returns JSON serialization
    */
  def serialize(): String
}
object TrajectoryClassifier {
  
  inline def apply(
    _levenshteinAlphabet: Any,
    _maximumAllowableMatchCost: Any,
    _nameToDescribedTrajectory: Any,
    _vector3Alphabet: Any,
    addTrajectoryToClassification: (Trajectory, String) => Unit,
    classifyTrajectory: Trajectory => Nullable[String],
    deleteClassification: String => Boolean,
    serialize: () => String
  ): TrajectoryClassifier = {
    val __obj = js.Dynamic.literal(_levenshteinAlphabet = _levenshteinAlphabet.asInstanceOf[js.Any], _maximumAllowableMatchCost = _maximumAllowableMatchCost.asInstanceOf[js.Any], _nameToDescribedTrajectory = _nameToDescribedTrajectory.asInstanceOf[js.Any], _vector3Alphabet = _vector3Alphabet.asInstanceOf[js.Any], addTrajectoryToClassification = js.Any.fromFunction2(addTrajectoryToClassification), classifyTrajectory = js.Any.fromFunction1(classifyTrajectory), deleteClassification = js.Any.fromFunction1(deleteClassification), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[TrajectoryClassifier]
  }
  
  extension [Self <: TrajectoryClassifier](x: Self) {
    
    inline def setAddTrajectoryToClassification(value: (Trajectory, String) => Unit): Self = StObject.set(x, "addTrajectoryToClassification", js.Any.fromFunction2(value))
    
    inline def setClassifyTrajectory(value: Trajectory => Nullable[String]): Self = StObject.set(x, "classifyTrajectory", js.Any.fromFunction1(value))
    
    inline def setDeleteClassification(value: String => Boolean): Self = StObject.set(x, "deleteClassification", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: () => String): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    inline def set_levenshteinAlphabet(value: Any): Self = StObject.set(x, "_levenshteinAlphabet", value.asInstanceOf[js.Any])
    
    inline def set_maximumAllowableMatchCost(value: Any): Self = StObject.set(x, "_maximumAllowableMatchCost", value.asInstanceOf[js.Any])
    
    inline def set_nameToDescribedTrajectory(value: Any): Self = StObject.set(x, "_nameToDescribedTrajectory", value.asInstanceOf[js.Any])
    
    inline def set_vector3Alphabet(value: Any): Self = StObject.set(x, "_vector3Alphabet", value.asInstanceOf[js.Any])
  }
}
