package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Trajectory")
@js.native
/**
  * Create a new empty Trajectory.
  * @param segmentLength radius of discretization for Trajectory points
  */
class Trajectory ()
  extends StObject
     with typings.babylonjs.BABYLON.Trajectory {
  def this(segmentLength: Double) = this()
  
  /* private */ /* CompleteClass */
  var _points: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override val _segmentLength: js.Any = js.native
  
  /**
    * Append a new point to the Trajectory.
    * NOTE: This implementation has many allocations.
    * @param point point to append to the Trajectory
    */
  /* CompleteClass */
  override def add(point: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): Unit = js.native
  
  /**
    * Get the length of the Trajectory.
    * @returns length of the Trajectory
    */
  /* CompleteClass */
  override def getLength(): Double = js.native
  
  /**
    * Create a new Trajectory with a segment length chosen to make it
    * probable that the new Trajectory will have a specified number of
    * segments. This operation is imprecise.
    * @param targetResolution number of segments desired
    * @returns new Trajectory with approximately the requested number of segments
    */
  /* CompleteClass */
  override def resampleAtTargetResolution(targetResolution: Double): typings.babylonjs.BABYLON.Trajectory = js.native
  
  /**
    * Serialize to JSON.
    * @returns serialized JSON string
    */
  /* CompleteClass */
  override def serialize(): String = js.native
  
  /**
    * Convert Trajectory segments into tokenized representation. This
    * representation is an array of numbers where each nth number is the
    * index of the token which is most similar to the nth segment of the
    * Trajectory.
    * @param tokens list of vectors which serve as discrete tokens
    * @returns list of indices of most similar token per segment
    */
  /* CompleteClass */
  override def tokenize(tokens: DeepImmutable[js.Array[typings.babylonjs.BABYLON.Vector3]]): js.Array[Double] = js.native
}
/* static members */
object Trajectory {
  
  @JSGlobal("BABYLON.Trajectory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize from JSON.
    * @param json serialized JSON string
    * @returns deserialized Trajectory
    */
  inline def Deserialize(json: String): typings.babylonjs.BABYLON.Trajectory = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Trajectory]
  
  @JSGlobal("BABYLON.Trajectory._bestMatch")
  @js.native
  def _bestMatch: js.Any = js.native
  inline def _bestMatch_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bestMatch")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._bestScore")
  @js.native
  def _bestScore: js.Any = js.native
  inline def _bestScore_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bestScore")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._forwardDir")
  @js.native
  def _forwardDir: js.Any = js.native
  inline def _forwardDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forwardDir")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._fromToVec")
  @js.native
  def _fromToVec: js.Any = js.native
  inline def _fromToVec_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fromToVec")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._inverseFromVec")
  @js.native
  def _inverseFromVec: js.Any = js.native
  inline def _inverseFromVec_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_inverseFromVec")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._lookMatrix")
  @js.native
  def _lookMatrix: js.Any = js.native
  inline def _lookMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_lookMatrix")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._score")
  @js.native
  def _score: js.Any = js.native
  inline def _score_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_score")(x.asInstanceOf[js.Any])
  
  /**
    * Determine which token vector is most similar to the
    * segment vector.
    * @param segment segment vector
    * @param tokens token vector list
    * @returns index of the most similar token to the segment
    */
  @JSGlobal("BABYLON.Trajectory._tokenizeSegment")
  @js.native
  def _tokenizeSegment: js.Any = js.native
  inline def _tokenizeSegment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tokenizeSegment")(x.asInstanceOf[js.Any])
  
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
  @JSGlobal("BABYLON.Trajectory._transformSegmentDirToRef")
  @js.native
  def _transformSegmentDirToRef: js.Any = js.native
  inline def _transformSegmentDirToRef_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_transformSegmentDirToRef")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._upDir")
  @js.native
  def _upDir: js.Any = js.native
  inline def _upDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_upDir")(x.asInstanceOf[js.Any])
}
