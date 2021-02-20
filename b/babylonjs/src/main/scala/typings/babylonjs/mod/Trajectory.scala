package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Trajectory")
@js.native
/**
  * Create a new empty Trajectory.
  * @param segmentLength radius of discretization for Trajectory points
  */
class Trajectory ()
  extends typings.babylonjs.legacyMod.Trajectory {
  def this(segmentLength: Double) = this()
}
/* static members */
object Trajectory {
  
  @JSImport("babylonjs", "Trajectory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize from JSON.
    * @param json serialized JSON string
    * @returns deserialized Trajectory
    */
  @JSImport("babylonjs", "Trajectory.Deserialize")
  @js.native
  def Deserialize(json: String): typings.babylonjs.trajectoryClassifierMod.Trajectory = js.native
  
  @JSImport("babylonjs", "Trajectory._bestMatch")
  @js.native
  def _bestMatch: js.Any = js.native
  @scala.inline
  def _bestMatch_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bestMatch")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._bestScore")
  @js.native
  def _bestScore: js.Any = js.native
  @scala.inline
  def _bestScore_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bestScore")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._forwardDir")
  @js.native
  def _forwardDir: js.Any = js.native
  @scala.inline
  def _forwardDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forwardDir")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._fromToVec")
  @js.native
  def _fromToVec: js.Any = js.native
  @scala.inline
  def _fromToVec_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fromToVec")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._inverseFromVec")
  @js.native
  def _inverseFromVec: js.Any = js.native
  @scala.inline
  def _inverseFromVec_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_inverseFromVec")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._lookMatrix")
  @js.native
  def _lookMatrix: js.Any = js.native
  @scala.inline
  def _lookMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_lookMatrix")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._score")
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
  @JSImport("babylonjs", "Trajectory._tokenizeSegment")
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
  @JSImport("babylonjs", "Trajectory._transformSegmentDirToRef")
  @js.native
  def _transformSegmentDirToRef: js.Any = js.native
  @scala.inline
  def _transformSegmentDirToRef_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_transformSegmentDirToRef")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Trajectory._upDir")
  @js.native
  def _upDir: js.Any = js.native
  @scala.inline
  def _upDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_upDir")(x.asInstanceOf[js.Any])
}
