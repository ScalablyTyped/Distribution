package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trajectoryClassifierMod {
  
  @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory")
  @js.native
  /**
    * Create a new empty Trajectory.
    * @param segmentLength radius of discretization for Trajectory points
    */
  class Trajectory () extends StObject {
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
  object Trajectory {
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deserialize from JSON.
      * @param json serialized JSON string
      * @returns deserialized Trajectory
      */
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory.Deserialize")
    @js.native
    def Deserialize(json: String): Trajectory = js.native
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._bestMatch")
    @js.native
    def _bestMatch: js.Any = js.native
    @scala.inline
    def _bestMatch_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bestMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._bestScore")
    @js.native
    def _bestScore: js.Any = js.native
    @scala.inline
    def _bestScore_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bestScore")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._forwardDir")
    @js.native
    def _forwardDir: js.Any = js.native
    @scala.inline
    def _forwardDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forwardDir")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._fromToVec")
    @js.native
    def _fromToVec: js.Any = js.native
    @scala.inline
    def _fromToVec_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fromToVec")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._inverseFromVec")
    @js.native
    def _inverseFromVec: js.Any = js.native
    @scala.inline
    def _inverseFromVec_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_inverseFromVec")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._lookMatrix")
    @js.native
    def _lookMatrix: js.Any = js.native
    @scala.inline
    def _lookMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_lookMatrix")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._score")
    @js.native
    def _score: js.Any = js.native
    @scala.inline
    def _score_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_score")(x.asInstanceOf[js.Any])
    
    /**
      * Determine which token vector is most similar to the
      * segment vector.
      * @param segment segment vector
      * @param tokens token vector list
      * @returns index of the most similar token to the segment
      */
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._tokenizeSegment")
    @js.native
    def _tokenizeSegment: js.Any = js.native
    @scala.inline
    def _tokenizeSegment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tokenizeSegment")(x.asInstanceOf[js.Any])
    
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
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._transformSegmentDirToRef")
    @js.native
    def _transformSegmentDirToRef: js.Any = js.native
    @scala.inline
    def _transformSegmentDirToRef_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_transformSegmentDirToRef")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._upDir")
    @js.native
    def _upDir: js.Any = js.native
    @scala.inline
    def _upDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_upDir")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/trajectoryClassifier", "TrajectoryClassifier")
  @js.native
  class TrajectoryClassifier protected () extends StObject {
    
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
  object TrajectoryClassifier {
    
    /**
      * Deserialize from JSON.
      * @param json JSON serialization
      * @returns deserialized TrajectorySet
      */
    @JSImport("babylonjs/Misc/trajectoryClassifier", "TrajectoryClassifier.Deserialize")
    @js.native
    def Deserialize(json: String): TrajectoryClassifier = js.native
    
    /**
      * Initialize a new empty TrajectorySet with auto-generated Alphabets.
      * VERY naive, need to be generating these things from known
      * sets. Better version later, probably eliminating this one.
      * @returns auto-generated TrajectorySet
      */
    @JSImport("babylonjs/Misc/trajectoryClassifier", "TrajectoryClassifier.Generate")
    @js.native
    def Generate(): TrajectoryClassifier = js.native
  }
}
