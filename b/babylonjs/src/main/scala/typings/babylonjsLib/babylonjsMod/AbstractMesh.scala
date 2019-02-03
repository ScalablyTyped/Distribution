package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store all common mesh properties
  */
@JSImport("babylonjs", "AbstractMesh")
@js.native
class AbstractMesh protected ()
  extends babylonjsLib.BABYLONNs.AbstractMesh {
  /**
    * Creates a new AbstractMesh
    * @param name defines the name of the mesh
    * @param scene defines the hosting scene
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
}

/* static members */
@JSImport("babylonjs", "AbstractMesh")
@js.native
object AbstractMesh extends js.Object {
  /** Billboard on all axes */
  val BILLBOARDMODE_ALL: scala.Double = js.native
  /**
    * No billboard
    */
  val BILLBOARDMODE_NONE: scala.Double = js.native
  /** Billboard on X axis */
  val BILLBOARDMODE_X: scala.Double = js.native
  /** Billboard on Y axis */
  val BILLBOARDMODE_Y: scala.Double = js.native
  /** Billboard on Z axis */
  val BILLBOARDMODE_Z: scala.Double = js.native
  /** Culling strategy with bounding sphere only and then frustum culling */
  val CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: scala.Double = js.native
  /** Default culling strategy with bounding box and bounding sphere and then frustum culling */
  val CULLINGSTRATEGY_STANDARD: scala.Double = js.native
  /** Use an accurante occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_ACCURATE: scala.Double = js.native
  /** Use a conservative occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: scala.Double = js.native
  /** No occlusion */
  var OCCLUSION_TYPE_NONE: scala.Double = js.native
  /** Occlusion set to optimisitic */
  var OCCLUSION_TYPE_OPTIMISTIC: scala.Double = js.native
  /** Occlusion set to strict */
  var OCCLUSION_TYPE_STRICT: scala.Double = js.native
}

