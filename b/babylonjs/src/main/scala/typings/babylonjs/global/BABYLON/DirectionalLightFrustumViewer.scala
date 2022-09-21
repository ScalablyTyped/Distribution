package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DirectionalLightFrustumViewer")
@js.native
open class DirectionalLightFrustumViewer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DirectionalLightFrustumViewer {
  /**
    * Creates a new frustum viewer
    * @param light directional light to display the frustum for
    * @param camera camera used to retrieve the minZ / maxZ values if the shadowMinZ/shadowMaxZ values of the light are not setup
    */
  def this(light: typings.babylonjs.BABYLON.DirectionalLight, camera: typings.babylonjs.BABYLON.Camera) = this()
}
