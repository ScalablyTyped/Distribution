package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "AbstractMesh")
@js.native
class AbstractMesh protected ()
  extends typings.babylonjs.legacyMod.AbstractMesh {
  /**
    * Creates a new AbstractMesh
    * @param name defines the name of the mesh
    * @param scene defines the hosting scene
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}

/* static members */
@JSImport("babylonjs", "AbstractMesh")
@js.native
object AbstractMesh extends js.Object {
  /** Culling strategy : Bounding Sphere Only.
    *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
    *  It's also less accurate than the standard because some not visible objects can still be selected.
    *  Test : is the bounding sphere outside the frustum ?
    *  If not, then the cullable object is in the frustum.
    */
  val CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: Double = js.native
  /** Culling strategy : Optimistic Inclusion.
    *  This in an inclusion test first, then the standard exclusion test.
    *  This can be faster when a cullable object is expected to be almost always in the camera frustum.
    *  This could also be a little slower than the standard test when the tested object center is not the frustum but one of its bounding box vertex is still inside.
    *  Anyway, it's as accurate as the standard strategy.
    *  Test :
    *  Is the cullable object bounding sphere center in the frustum ?
    *  If not, apply the default culling strategy.
    */
  val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION: Double = js.native
  /** Culling strategy : Optimistic Inclusion then Bounding Sphere Only.
    *  This in an inclusion test first, then the bounding sphere only exclusion test.
    *  This can be the fastest test when a cullable object is expected to be almost always in the camera frustum.
    *  This could also be a little slower than the BoundingSphereOnly strategy when the tested object center is not in the frustum but its bounding sphere still intersects it.
    *  It's less accurate than the standard strategy and as accurate as the BoundingSphereOnly strategy.
    *  Test :
    *  Is the cullable object bounding sphere center in the frustum ?
    *  If not, apply the Bounding Sphere Only strategy. No Bounding Box is tested here.
    */
  val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
  /** Default culling strategy : this is an exclusion test and it's the more accurate.
    *  Test order :
    *  Is the bounding sphere outside the frustum ?
    *  If not, are the bounding box vertices outside the frustum ?
    *  It not, then the cullable object is in the frustum.
    */
  val CULLINGSTRATEGY_STANDARD: Double = js.native
  /** Use an accurante occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_ACCURATE: Double = js.native
  /** Use a conservative occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: Double = js.native
  /** No occlusion */
  var OCCLUSION_TYPE_NONE: Double = js.native
  /** Occlusion set to optimisitic */
  var OCCLUSION_TYPE_OPTIMISTIC: Double = js.native
  /** Occlusion set to strict */
  var OCCLUSION_TYPE_STRICT: Double = js.native
  /** Billboard on all axes */
  def BILLBOARDMODE_ALL(): Double = js.native
  /**
    * No billboard
    */
  def BILLBOARDMODE_NONE(): Double = js.native
  /** Billboard on using position instead of orientation */
  def BILLBOARDMODE_USE_POSITION(): Double = js.native
  /** Billboard on X axis */
  def BILLBOARDMODE_X(): Double = js.native
  /** Billboard on Y axis */
  def BILLBOARDMODE_Y(): Double = js.native
  /** Billboard on Z axis */
  def BILLBOARDMODE_Z(): Double = js.native
}

