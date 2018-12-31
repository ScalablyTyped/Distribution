package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Inspired by http://http.developer.nvidia.com/GPUGems3/gpugems3_ch13.html
  */
@JSGlobal("BABYLON.VolumetricLightScatteringPostProcess")
@js.native
class VolumetricLightScatteringPostProcess protected () extends PostProcess {
  /**
    * @constructor
    * @param name The post-process name
    * @param ratio The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param camera The camera that the post-process will be attached to
    * @param mesh The mesh used to create the light scattering
    * @param samples The post-process quality, default 100
    * @param samplingModeThe post-process filtering mode
    * @param engine The babylon engine
    * @param reusable If the post-process is reusable
    * @param scene The constructor needs a scene reference to initialize internal components. If "camera" is null a "scene" must be provided
    */
  def this(name: java.lang.String, ratio: js.Any, camera: Camera, mesh: js.UndefOr[Mesh], samples: js.UndefOr[scala.Double], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[Engine], reusable: js.UndefOr[scala.Boolean], scene: js.UndefOr[Scene]) = this()
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
  var attachedNode: babylonjsLib.Anon_Position = js.native
  /**
    * Custom position of the mesh. Used if "useCustomMeshPosition" is set to "true"
    */
  var customMeshPosition: Vector3 = js.native
  /**
    * Dissipates each sample's contribution in range [0, 1]
    */
  var decay: scala.Double = js.native
  /**
    * Controls the density of each sample
    */
  var density: scala.Double = js.native
  /**
    * Array containing the excluded meshes not rendered in the internal pass
    */
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  /**
    * Controls the overall intensity of the post-process
    */
  var exposure: scala.Double = js.native
  /**
    * If the post-process should inverse the light scattering direction
    */
  var invert: scala.Boolean = js.native
  /**
    * The internal mesh used by the post-process
    */
  var mesh: Mesh = js.native
  /**
    * Set if the post-process should use a custom position for the light source (true) or the internal mesh position (false)
    */
  var useCustomMeshPosition: scala.Boolean = js.native
  /**
    * @hidden
    * VolumetricLightScatteringPostProcess.useDiffuseColor is no longer used, use the mesh material directly instead
    */
  var useDiffuseColor: scala.Boolean = js.native
  /**
    * Controls the overall intensity of each sample
    */
  var weight: scala.Double = js.native
  /**
    * Returns the string "VolumetricLightScatteringPostProcess"
    * @returns "VolumetricLightScatteringPostProcess"
    */
  def getClassName(): java.lang.String = js.native
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
    * Sets the new light position for light scattering effect
    * @param position The new custom light position
    */
  def setCustomMeshPosition(position: Vector3): scala.Unit = js.native
}

/**
  *  Inspired by http://http.developer.nvidia.com/GPUGems3/gpugems3_ch13.html
  */
@JSGlobal("BABYLON.VolumetricLightScatteringPostProcess")
@js.native
object VolumetricLightScatteringPostProcess extends js.Object {
  /**
    * Creates a default mesh for the Volumeric Light Scattering post-process
    * @param name The mesh name
    * @param scene The scene where to create the mesh
    * @return the default mesh
    */
  def CreateDefaultMesh(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Mesh = js.native
}

