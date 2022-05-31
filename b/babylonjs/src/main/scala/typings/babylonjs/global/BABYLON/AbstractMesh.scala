package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AbstractMesh")
@js.native
class AbstractMesh protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AbstractMesh {
  /**
    * Creates a new AbstractMesh
    * @param name defines the name of the mesh
    * @param scene defines the hosting scene
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Releases all held resources
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
/* static members */
object AbstractMesh {
  
  @JSGlobal("BABYLON.AbstractMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /** Culling strategy : Bounding Sphere Only.
    *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
    *  It's also less accurate than the standard because some not visible objects can still be selected.
    *  Test : is the bounding sphere outside the frustum ?
    *  If not, then the cullable object is in the frustum.
    */
  @JSGlobal("BABYLON.AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY")
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
  @JSGlobal("BABYLON.AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION")
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
  @JSGlobal("BABYLON.AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY")
  @js.native
  val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
  
  /** Default culling strategy : this is an exclusion test and it's the more accurate.
    *  Test order :
    *  Is the bounding sphere outside the frustum ?
    *  If not, are the bounding box vertices outside the frustum ?
    *  It not, then the cullable object is in the frustum.
    */
  @JSGlobal("BABYLON.AbstractMesh.CULLINGSTRATEGY_STANDARD")
  @js.native
  val CULLINGSTRATEGY_STANDARD: Double = js.native
  
  /** Use an accurante occlusion algorithm */
  @JSGlobal("BABYLON.AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE")
  @js.native
  def OCCLUSION_ALGORITHM_TYPE_ACCURATE: Double = js.native
  inline def OCCLUSION_ALGORITHM_TYPE_ACCURATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_ALGORITHM_TYPE_ACCURATE")(x.asInstanceOf[js.Any])
  
  /** Use a conservative occlusion algorithm */
  @JSGlobal("BABYLON.AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE")
  @js.native
  def OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: Double = js.native
  inline def OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE")(x.asInstanceOf[js.Any])
  
  /** No occlusion */
  @JSGlobal("BABYLON.AbstractMesh.OCCLUSION_TYPE_NONE")
  @js.native
  def OCCLUSION_TYPE_NONE: Double = js.native
  inline def OCCLUSION_TYPE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_NONE")(x.asInstanceOf[js.Any])
  
  /** Occlusion set to optimisitic */
  @JSGlobal("BABYLON.AbstractMesh.OCCLUSION_TYPE_OPTIMISTIC")
  @js.native
  def OCCLUSION_TYPE_OPTIMISTIC: Double = js.native
  inline def OCCLUSION_TYPE_OPTIMISTIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_OPTIMISTIC")(x.asInstanceOf[js.Any])
  
  /** Occlusion set to strict */
  @JSGlobal("BABYLON.AbstractMesh.OCCLUSION_TYPE_STRICT")
  @js.native
  def OCCLUSION_TYPE_STRICT: Double = js.native
  inline def OCCLUSION_TYPE_STRICT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_STRICT")(x.asInstanceOf[js.Any])
}
