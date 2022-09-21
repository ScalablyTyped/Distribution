package typings.babylonjs.featuresIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingSphereMod.BoundingSphere
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.webXRNearInteractionMod.IWebXRNearInteractionOptions
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRNearInteraction")
@js.native
open class WebXRNearInteraction protected ()
  extends typings.babylonjs.webXRNearInteractionMod.WebXRNearInteraction {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRNearInteractionOptions) = this()
}
/* static members */
object WebXRNearInteraction {
  
  @JSImport("babylonjs/XR/features/index", "WebXRNearInteraction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRNearInteraction.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * Picks a mesh with a sphere
    * @param mesh the mesh to pick
    * @param sphere picking sphere in world coordinates
    * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
    * @returns the picking info
    */
  inline def PickMeshWithSphere(mesh: AbstractMesh, sphere: BoundingSphere): PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[PickingInfo]
  inline def PickMeshWithSphere(mesh: AbstractMesh, sphere: BoundingSphere, skipBoundingInfo: Boolean): PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], skipBoundingInfo.asInstanceOf[js.Any])).asInstanceOf[PickingInfo]
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRNearInteraction.Version")
  @js.native
  val Version: Double = js.native
  
  @JSImport("babylonjs/XR/features/index", "WebXRNearInteraction._IdCounter")
  @js.native
  def _IdCounter: Any = js.native
  inline def _IdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdCounter")(x.asInstanceOf[js.Any])
}
