package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRNearInteractionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRNearInteraction")
@js.native
open class WebXRNearInteraction protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRNearInteraction {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRNearInteractionOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRNearInteraction {
  
  @JSGlobal("BABYLON.WebXRNearInteraction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRNearInteraction.Name")
  @js.native
  val Name: /* "xr-near-interaction" */ String = js.native
  
  /**
    * Picks a mesh with a sphere
    * @param mesh the mesh to pick
    * @param sphere picking sphere in world coordinates
    * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
    * @returns the picking info
    */
  inline def PickMeshWithSphere(mesh: typings.babylonjs.BABYLON.AbstractMesh, sphere: typings.babylonjs.BABYLON.BoundingSphere): typings.babylonjs.BABYLON.PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.PickingInfo]
  inline def PickMeshWithSphere(
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    sphere: typings.babylonjs.BABYLON.BoundingSphere,
    skipBoundingInfo: Boolean
  ): typings.babylonjs.BABYLON.PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], skipBoundingInfo.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.PickingInfo]
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRNearInteraction.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
  
  @JSGlobal("BABYLON.WebXRNearInteraction._IdCounter")
  @js.native
  def _IdCounter: Any = js.native
  inline def _IdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdCounter")(x.asInstanceOf[js.Any])
}
