package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Trajectory")
@js.native
/**
  * Create a new empty Trajectory.
  * @param segmentLength radius of discretization for Trajectory points
  */
class Trajectory ()
  extends typings.babylonjs.miscIndexMod.Trajectory {
  def this(segmentLength: Double) = this()
}
/* static members */
@JSImport("babylonjs/index", "Trajectory")
@js.native
object Trajectory extends js.Object {
  
  /**
    * Deserialize from JSON.
    * @param json serialized JSON string
    * @returns deserialized Trajectory
    */
  def Deserialize(json: String): typings.babylonjs.trajectoryClassifierMod.Trajectory = js.native
  
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
