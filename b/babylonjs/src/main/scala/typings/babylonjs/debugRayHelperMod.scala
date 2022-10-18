package typings.babylonjs

import typings.babylonjs.cullingRayMod.Ray
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugRayHelperMod {
  
  @JSImport("babylonjs/Debug/rayHelper", "RayHelper")
  @js.native
  open class RayHelper protected () extends StObject {
    /**
      * Instantiate a new ray helper.
      * As raycast might be hard to debug, the RayHelper can help rendering the different rays
      * in order to better appreciate the issue one might have.
      * @see https://doc.babylonjs.com/babylon101/raycasts#debugging
      * @param ray Defines the ray we are currently tryin to visualize
      */
    def this(ray: Ray) = this()
    
    /* private */ var _attachedToMesh: Any = js.native
    
    /* private */ var _meshSpaceDirection: Any = js.native
    
    /* private */ var _meshSpaceOrigin: Any = js.native
    
    /* private */ var _onAfterRenderObserver: Any = js.native
    
    /* private */ var _onAfterStepObserver: Any = js.native
    
    /* private */ var _render: Any = js.native
    
    /* private */ var _renderFunction: Any = js.native
    
    /* private */ var _renderLine: Any = js.native
    
    /* private */ var _renderPoints: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _updateToMesh: Any = js.native
    
    /**
      * Attach a ray helper to a mesh so that we can easily see its orientation for instance or information like its normals.
      * @param mesh Defines the mesh we want the helper attached to
      * @param meshSpaceDirection Defines the direction of the Ray in mesh space (local space of the mesh node)
      * @param meshSpaceOrigin Defines the origin of the Ray in mesh space (local space of the mesh node)
      * @param length Defines the length of the ray
      */
    def attachToMesh(mesh: AbstractMesh): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Unit, meshSpaceOrigin: Unit, length: Double): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Unit, meshSpaceOrigin: Vector3): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Unit, meshSpaceOrigin: Vector3, length: Double): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Unit, length: Double): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Vector3): Unit = js.native
    def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Vector3, length: Double): Unit = js.native
    
    /**
      * Detach the ray helper from the mesh it has previously been attached to.
      */
    def detachFromMesh(): Unit = js.native
    
    /**
      * Dispose the helper and release its associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Hides the ray we are debugging.
      */
    def hide(): Unit = js.native
    
    /**
      * Defines the ray we are currently tryin to visualize.
      */
    var ray: Nullable[Ray] = js.native
    
    /**
      * Shows the ray we are willing to debug.
      * @param scene Defines the scene the ray needs to be rendered in
      * @param color Defines the color the ray needs to be rendered in
      */
    def show(scene: Scene): Unit = js.native
    def show(scene: Scene, color: Color3): Unit = js.native
  }
  /* static members */
  object RayHelper {
    
    @JSImport("babylonjs/Debug/rayHelper", "RayHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function to create a colored helper in a scene in one line.
      * @param ray Defines the ray we are currently tryin to visualize
      * @param scene Defines the scene the ray is used in
      * @param color Defines the color we want to see the ray in
      * @returns The newly created ray helper.
      */
    inline def CreateAndShow(ray: Ray, scene: Scene, color: Color3): RayHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndShow")(ray.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[RayHelper]
  }
}
