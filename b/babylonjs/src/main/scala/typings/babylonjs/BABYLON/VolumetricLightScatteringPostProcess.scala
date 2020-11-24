package typings.babylonjs.BABYLON

import typings.babylonjs.anon.PositionVector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumetricLightScatteringPostProcess extends PostProcess {
  
  var _cachedDefines: js.Any = js.native
  
  var _createPass: js.Any = js.native
  
  var _isReady: js.Any = js.native
  
  var _meshExcluded: js.Any = js.native
  
  var _screenCoordinates: js.Any = js.native
  
  var _updateMeshScreenCoordinates: js.Any = js.native
  
  var _viewPort: js.Any = js.native
  
  var _volumetricLightScatteringPass: js.Any = js.native
  
  var _volumetricLightScatteringRTT: js.Any = js.native
  
  /**
    * If not undefined, the mesh position is computed from the attached node position
    */
  var attachedNode: PositionVector3 = js.native
  
  /**
    * Custom position of the mesh. Used if "useCustomMeshPosition" is set to "true"
    */
  var customMeshPosition: Vector3 = js.native
  
  /**
    * Dissipates each sample's contribution in range [0, 1]
    */
  var decay: Double = js.native
  
  /**
    * Controls the density of each sample
    */
  var density: Double = js.native
  
  /**
    * Array containing the excluded meshes not rendered in the internal pass
    */
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  
  /**
    * Controls the overall intensity of the post-process
    */
  var exposure: Double = js.native
  
  /**
    * Returns the light position for light scattering effect
    * @return Vector3 The custom light position
    */
  def getCustomMeshPosition(): Vector3 = js.native
  
  /**
    * Returns the render target texture used by the post-process
    * @return the render target texture used by the post-process
    */
  def getPass(): RenderTargetTexture = js.native
  
  /**
    * If the post-process should inverse the light scattering direction
    */
  var invert: Boolean = js.native
  
  /**
    * The internal mesh used by the post-process
    */
  var mesh: Mesh = js.native
  
  /**
    * Sets the new light position for light scattering effect
    * @param position The new custom light position
    */
  def setCustomMeshPosition(position: Vector3): Unit = js.native
  
  /**
    * Set if the post-process should use a custom position for the light source (true) or the internal mesh position (false)
    */
  var useCustomMeshPosition: Boolean = js.native
  
  /**
    * @hidden
    * VolumetricLightScatteringPostProcess.useDiffuseColor is no longer used, use the mesh material directly instead
    */
  def useDiffuseColor: Boolean = js.native
  def useDiffuseColor_=(useDiffuseColor: Boolean): Unit = js.native
  
  /**
    * Controls the overall intensity of each sample
    */
  var weight: Double = js.native
}
