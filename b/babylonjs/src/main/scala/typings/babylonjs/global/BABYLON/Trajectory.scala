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
open class Trajectory ()
  extends StObject
     with typings.babylonjs.BABYLON.Trajectory {
  def this(segmentLength: Double) = this()
  
  /* private */ /* CompleteClass */
  var _points: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _segmentLength: Any = js.native
  
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
  
  @JSGlobal("BABYLON.Trajectory._BestMatch")
  @js.native
  def _BestMatch: Any = js.native
  inline def _BestMatch_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BestMatch")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._BestScore")
  @js.native
  def _BestScore: Any = js.native
  inline def _BestScore_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BestScore")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._ForwardDir")
  @js.native
  def _ForwardDir: Any = js.native
  inline def _ForwardDir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ForwardDir")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._FromToVec")
  @js.native
  def _FromToVec: Any = js.native
  inline def _FromToVec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromToVec")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._InverseFromVec")
  @js.native
  def _InverseFromVec: Any = js.native
  inline def _InverseFromVec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InverseFromVec")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._LookMatrix")
  @js.native
  def _LookMatrix: Any = js.native
  inline def _LookMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LookMatrix")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._Score")
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
  @JSGlobal("BABYLON.Trajectory._TokenizeSegment")
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
  @JSGlobal("BABYLON.Trajectory._TransformSegmentDirToRef")
  @js.native
  def _TransformSegmentDirToRef: Any = js.native
  inline def _TransformSegmentDirToRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TransformSegmentDirToRef")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Trajectory._UpDir")
  @js.native
  def _UpDir: Any = js.native
  inline def _UpDir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpDir")(x.asInstanceOf[js.Any])
}
