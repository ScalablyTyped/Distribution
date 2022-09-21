package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "Trajectory")
@js.native
/**
  * Create a new empty Trajectory.
  * @param segmentLength radius of discretization for Trajectory points
  */
open class Trajectory ()
  extends typings.babylonjs.trajectoryClassifierMod.Trajectory {
  def this(segmentLength: Double) = this()
}
/* static members */
object Trajectory {
  
  @JSImport("babylonjs/Misc/index", "Trajectory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize from JSON.
    * @param json serialized JSON string
    * @returns deserialized Trajectory
    */
  inline def Deserialize(json: String): typings.babylonjs.trajectoryClassifierMod.Trajectory = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.trajectoryClassifierMod.Trajectory]
  
  @JSImport("babylonjs/Misc/index", "Trajectory._BestMatch")
  @js.native
  def _BestMatch: Any = js.native
  inline def _BestMatch_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BestMatch")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._BestScore")
  @js.native
  def _BestScore: Any = js.native
  inline def _BestScore_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BestScore")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._ForwardDir")
  @js.native
  def _ForwardDir: Any = js.native
  inline def _ForwardDir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ForwardDir")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._FromToVec")
  @js.native
  def _FromToVec: Any = js.native
  inline def _FromToVec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromToVec")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._InverseFromVec")
  @js.native
  def _InverseFromVec: Any = js.native
  inline def _InverseFromVec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InverseFromVec")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._LookMatrix")
  @js.native
  def _LookMatrix: Any = js.native
  inline def _LookMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LookMatrix")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._Score")
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
  @JSImport("babylonjs/Misc/index", "Trajectory._TokenizeSegment")
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
  @JSImport("babylonjs/Misc/index", "Trajectory._TransformSegmentDirToRef")
  @js.native
  def _TransformSegmentDirToRef: Any = js.native
  inline def _TransformSegmentDirToRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TransformSegmentDirToRef")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Trajectory._UpDir")
  @js.native
  def _UpDir: Any = js.native
  inline def _UpDir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpDir")(x.asInstanceOf[js.Any])
}
