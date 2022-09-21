package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DirectionalLightFrustumViewer")
@js.native
open class DirectionalLightFrustumViewer protected ()
  extends typings.babylonjs.legacyMod.DirectionalLightFrustumViewer {
  /**
    * Creates a new frustum viewer
    * @param light directional light to display the frustum for
    * @param camera camera used to retrieve the minZ / maxZ values if the shadowMinZ/shadowMaxZ values of the light are not setup
    */
  def this(
    light: typings.babylonjs.directionalLightMod.DirectionalLight,
    camera: typings.babylonjs.cameraMod.Camera
  ) = this()
}
