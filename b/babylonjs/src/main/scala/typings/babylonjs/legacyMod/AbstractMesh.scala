package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AbstractMesh")
@js.native
open class AbstractMesh protected ()
  extends typings.babylonjs.indexMod.AbstractMesh {
  /**
    * Creates a new AbstractMesh
    * @param name defines the name of the mesh
    * @param scene defines the hosting scene
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object AbstractMesh {
  
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /** Culling strategy : Bounding Sphere Only.
    *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
    *  It's also less accurate than the standard because some not visible objects can still be selected.
    *  Test : is the bounding sphere outside the frustum ?
    *  If not, then the cullable object is in the frustum.
    */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY")
  @js.native
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
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION")
  @js.native
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
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY")
  @js.native
  val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
  
  /** Default culling strategy : this is an exclusion test and it's the more accurate.
    *  Test order :
    *  Is the bounding sphere outside the frustum ?
    *  If not, are the bounding box vertices outside the frustum ?
    *  It not, then the cullable object is in the frustum.
    */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.CULLINGSTRATEGY_STANDARD")
  @js.native
  val CULLINGSTRATEGY_STANDARD: Double = js.native
  
  /** Use an accurate occlusion algorithm */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE")
  @js.native
  def OCCLUSION_ALGORITHM_TYPE_ACCURATE: Double = js.native
  inline def OCCLUSION_ALGORITHM_TYPE_ACCURATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_ALGORITHM_TYPE_ACCURATE")(x.asInstanceOf[js.Any])
  
  /** Use a conservative occlusion algorithm */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE")
  @js.native
  def OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: Double = js.native
  inline def OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE")(x.asInstanceOf[js.Any])
  
  /** No occlusion */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.OCCLUSION_TYPE_NONE")
  @js.native
  def OCCLUSION_TYPE_NONE: Double = js.native
  inline def OCCLUSION_TYPE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_NONE")(x.asInstanceOf[js.Any])
  
  /** Occlusion set to optimistic */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.OCCLUSION_TYPE_OPTIMISTIC")
  @js.native
  def OCCLUSION_TYPE_OPTIMISTIC: Double = js.native
  inline def OCCLUSION_TYPE_OPTIMISTIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_OPTIMISTIC")(x.asInstanceOf[js.Any])
  
  /** Occlusion set to strict */
  @JSImport("babylonjs/Legacy/legacy", "AbstractMesh.OCCLUSION_TYPE_STRICT")
  @js.native
  def OCCLUSION_TYPE_STRICT: Double = js.native
  inline def OCCLUSION_TYPE_STRICT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_STRICT")(x.asInstanceOf[js.Any])
}
