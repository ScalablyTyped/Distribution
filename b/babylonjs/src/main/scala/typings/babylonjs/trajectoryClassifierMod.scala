package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/trajectoryClassifier", JSImport.Namespace)
@js.native
object trajectoryClassifierMod extends js.Object {
  
  @js.native
  /**
    * Create a new empty Trajectory.
    * @param segmentLength radius of discretization for Trajectory points
    */
  class Trajectory () extends js.Object {
    def this(segmentLength: Double) = this()
    
    var _points: js.Any = js.native
    
    val _segmentLength: js.Any = js.native
    
    /**
      * Append a new point to the Trajectory.
      * NOTE: This implementation has many allocations.
      * @param point point to append to the Trajectory
      */
    def add(point: DeepImmutable[Vector3]): Unit = js.native
    
    /**
      * Get the length of the Trajectory.
      * @returns length of the Trajectory
      */
    def getLength(): Double = js.native
    
    /**
      * Create a new Trajectory with a segment length chosen to make it
      * probable that the new Trajectory will have a specified number of
      * segments. This operation is imprecise.
      * @param targetResolution number of segments desired
      * @returns new Trajectory with approximately the requested number of segments
      */
    def resampleAtTargetResolution(targetResolution: Double): Trajectory = js.native
    
    /**
      * Serialize to JSON.
      * @returns serialized JSON string
      */
    def serialize(): String = js.native
    
    /**
      * Convert Trajectory segments into tokenized representation. This
      * representation is an array of numbers where each nth number is the
      * index of the token which is most similar to the nth segment of the
      * Trajectory.
      * @param tokens list of vectors which serve as discrete tokens
      * @returns list of indices of most similar token per segment
      */
    def tokenize(tokens: DeepImmutable[js.Array[Vector3]]): js.Array[Double] = js.native
  }
  /* static members */
  @js.native
  object Trajectory extends js.Object {
    
    /**
      * Deserialize from JSON.
      * @param json serialized JSON string
      * @returns deserialized Trajectory
      */
    def Deserialize(json: String): Trajectory = js.native
    
    var _bestMatch: js.Any = js.native
    
    var _bestScore: js.Any = js.native
    
    var _forwardDir: js.Any = js.native
    
    var _fromToVec: js.Any = js.native
    
    var _inverseFromVec: js.Any = js.native
    
    var _lookMatrix: js.Any = js.native
    
    var _score: js.Any = js.native
    
    /**
      * Determine which token vector is most similar to the
      * segment vector.
      * @param segment segment vector
      * @param tokens token vector list
      * @returns index of the most similar token to the segment
      */
    var _tokenizeSegment: js.Any = js.native
    
    /**
      * Transform the rotation (i.e., direction) of a segment to isolate
      * the relative transformation represented by the segment. This operation
      * may or may not succeed due to singularities in the equations that define
      * motion relativity in this context.
      * @param priorVec the origin of the prior segment
      * @param fromVec the origin of the current segment
      * @param toVec the destination of the current segment
      * @param result reference to output variable
      * @returns whether or not transformation was successful
      */
    var _transformSegmentDirToRef: js.Any = js.native
    
    var _upDir: js.Any = js.native
  }
  
  @js.native
  class TrajectoryClassifier protected () extends js.Object {
    
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
  /* static members */
  @js.native
  object TrajectoryClassifier extends js.Object {
    
    /**
      * Deserialize from JSON.
      * @param json JSON serialization
      * @returns deserialized TrajectorySet
      */
    def Deserialize(json: String): TrajectoryClassifier = js.native
    
    /**
      * Initialize a new empty TrajectorySet with auto-generated Alphabets.
      * VERY naive, need to be generating these things from known
      * sets. Better version later, probably eliminating this one.
      * @returns auto-generated TrajectorySet
      */
    def Generate(): TrajectoryClassifier = js.native
  }
}
