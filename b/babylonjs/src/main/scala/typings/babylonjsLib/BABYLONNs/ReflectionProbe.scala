package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to generate realtime reflection / refraction cube textures
     * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
     */
@JSGlobal("BABYLON.ReflectionProbe")
@js.native
class ReflectionProbe protected () extends js.Object {
  /**
           * Creates a new reflection probe
           * @param name defines the name of the probe
           * @param size defines the texture resolution (for each face)
           * @param scene defines the hosting scene
           * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
           * @param useFloat defines if HDR data (flaot data) should be used to store colors (false by default)
           */
  def this(/** defines the name of the probe */
  name: java.lang.String, size: scala.Double, scene: Scene) = this()
  /**
           * Creates a new reflection probe
           * @param name defines the name of the probe
           * @param size defines the texture resolution (for each face)
           * @param scene defines the hosting scene
           * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
           * @param useFloat defines if HDR data (flaot data) should be used to store colors (false by default)
           */
  def this(/** defines the name of the probe */
  name: java.lang.String, size: scala.Double, scene: Scene, generateMipMaps: scala.Boolean) = this()
  /**
           * Creates a new reflection probe
           * @param name defines the name of the probe
           * @param size defines the texture resolution (for each face)
           * @param scene defines the hosting scene
           * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
           * @param useFloat defines if HDR data (flaot data) should be used to store colors (false by default)
           */
  def this(/** defines the name of the probe */
  name: java.lang.String, size: scala.Double, scene: Scene, generateMipMaps: scala.Boolean, useFloat: scala.Boolean) = this()
  var _add: js.Any = js.native
  var _attachedMesh: js.Any = js.native
  var _invertYAxis: js.Any = js.native
  var _projectionMatrix: js.Any = js.native
  var _renderTargetTexture: js.Any = js.native
  var _scene: js.Any = js.native
  var _target: js.Any = js.native
  var _viewMatrix: js.Any = js.native
  /** Gets the internal CubeTexture used to render to */
  val cubeTexture: RenderTargetTexture = js.native
  /** defines the name of the probe */
  var name: java.lang.String = js.native
  /** Gets or sets probe position (center of the cube map) */
  var position: Vector3 = js.native
  /** Gets or sets the refresh rate to use (on every frame by default) */
  var refreshRate: scala.Double = js.native
  /** Gets the list of meshes to render */
  val renderList: Nullable[js.Array[AbstractMesh]] = js.native
  /** Gets or sets the number of samples to use for multi-sampling (0 by default). Required WebGL2 */
  var samples: scala.Double = js.native
  /**
           * Attach the probe to a specific mesh (Rendering will be done from attached mesh's position)
           * @param mesh defines the mesh to attach to
           */
  def attachToMesh(mesh: AbstractMesh): scala.Unit = js.native
  /**
           * Clean all associated resources
           */
  def dispose(): scala.Unit = js.native
  /**
           * Gets the hosting scene
           * @returns a Scene
           */
  def getScene(): Scene = js.native
  /**
           * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
           */
  def setRenderingAutoClearDepthStencil(renderingGroupId: scala.Double, autoClearDepthStencil: scala.Boolean): scala.Unit = js.native
}

