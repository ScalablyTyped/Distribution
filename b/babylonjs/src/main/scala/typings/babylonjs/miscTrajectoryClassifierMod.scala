package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscTrajectoryClassifierMod {
  
  @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory")
  @js.native
  /**
    * Create a new empty Trajectory.
    * @param segmentLength radius of discretization for Trajectory points
    */
  open class Trajectory () extends StObject {
    def this(segmentLength: Double) = this()
    
    /* private */ var _points: Any = js.native
    
    /* private */ val _segmentLength: Any = js.native
    
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
    inline def Deserialize(json: String): Trajectory = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[Trajectory]
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._BestMatch")
    @js.native
    def _BestMatch: Any = js.native
    inline def _BestMatch_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BestMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._BestScore")
    @js.native
    def _BestScore: Any = js.native
    inline def _BestScore_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BestScore")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._ForwardDir")
    @js.native
    def _ForwardDir: Any = js.native
    inline def _ForwardDir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ForwardDir")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._FromToVec")
    @js.native
    def _FromToVec: Any = js.native
    inline def _FromToVec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromToVec")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._InverseFromVec")
    @js.native
    def _InverseFromVec: Any = js.native
    inline def _InverseFromVec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InverseFromVec")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._LookMatrix")
    @js.native
    def _LookMatrix: Any = js.native
    inline def _LookMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LookMatrix")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._Score")
    @js.native
    def _Score: Any = js.native
    inline def _Score_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Score")(x.asInstanceOf[js.Any])
    
    /**
      * Determine which token vector is most similar to the
      * segment vector.
      * @param segment segment vector
      * @param tokens token vector list
      * @returns index of the most similar token to the segment
      */
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._TokenizeSegment")
    @js.native
    def _TokenizeSegment: Any = js.native
    inline def _TokenizeSegment_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TokenizeSegment")(x.asInstanceOf[js.Any])
    
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
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._TransformSegmentDirToRef")
    @js.native
    def _TransformSegmentDirToRef: Any = js.native
    inline def _TransformSegmentDirToRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TransformSegmentDirToRef")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "Trajectory._UpDir")
    @js.native
    def _UpDir: Any = js.native
    inline def _UpDir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpDir")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/trajectoryClassifier", "TrajectoryClassifier")
  @js.native
  /* private */ open class TrajectoryClassifier () extends StObject {
    
    /* private */ var _levenshteinAlphabet: Any = js.native
    
    /* private */ var _maximumAllowableMatchCost: Any = js.native
    
    /* private */ var _nameToDescribedTrajectory: Any = js.native
    
    /* private */ var _vector3Alphabet: Any = js.native
    
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
    
    @JSImport("babylonjs/Misc/trajectoryClassifier", "TrajectoryClassifier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deserialize from JSON.
      * @param json JSON serialization
      * @returns deserialized TrajectorySet
      */
    inline def Deserialize(json: String): TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[TrajectoryClassifier]
    
    /**
      * Initialize a new empty TrajectorySet with auto-generated Alphabets.
      * VERY naive, need to be generating these things from known
      * sets. Better version later, probably eliminating this one.
      * @returns auto-generated TrajectorySet
      */
    inline def Generate(): TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Generate")().asInstanceOf[TrajectoryClassifier]
  }
}
