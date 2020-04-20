package typings.babylonjs.reflectionProbeMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Probes/reflectionProbe", "ReflectionProbe")
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
  name: String, size: Double, scene: Scene) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: Scene,
    generateMipMaps: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: Scene,
    generateMipMaps: Boolean,
    useFloat: Boolean
  ) = this()
  var _add: js.Any = js.native
  var _attachedMesh: js.Any = js.native
  var _invertYAxis: js.Any = js.native
  var _projectionMatrix: js.Any = js.native
  var _renderTargetTexture: js.Any = js.native
  var _scene: js.Any = js.native
  var _target: js.Any = js.native
  var _viewMatrix: js.Any = js.native
  /** defines the name of the probe */
  var name: String = js.native
  /** Gets or sets probe position (center of the cube map) */
  var position: Vector3 = js.native
  /**
    * Attach the probe to a specific mesh (Rendering will be done from attached mesh's position)
    * @param mesh defines the mesh to attach to
    */
  def attachToMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
  /** Gets the internal CubeTexture used to render to */
  def cubeTexture: RenderTargetTexture = js.native
  /**
    * Clean all associated resources
    */
  def dispose(): Unit = js.native
  /**
    * Get the class name of the relfection probe.
    * @returns "ReflectionProbe"
    */
  def getClassName(): String = js.native
  /**
    * Gets the hosting scene
    * @returns a Scene
    */
  def getScene(): Scene = js.native
  /** Gets or sets the refresh rate to use (on every frame by default) */
  def refreshRate: Double = js.native
  def refreshRate(value: Double): js.Any = js.native
  /** Gets the list of meshes to render */
  def renderList: Nullable[js.Array[AbstractMesh]] = js.native
  /** Gets or sets the number of samples to use for multi-sampling (0 by default). Required WebGL2 */
  def samples: Double = js.native
  def samples(value: Double): js.Any = js.native
  /**
    * Serialize the reflection probe to a JSON representation we can easily use in the resepective Parse function.
    * @returns The JSON representation of the texture
    */
  def serialize(): js.Any = js.native
  /**
    * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups
    * @param renderingGroupId The rendering group id corresponding to its index
    * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
    */
  def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
  def toString(fullDetails: Boolean): String = js.native
}

/* static members */
@JSImport("babylonjs/Probes/reflectionProbe", "ReflectionProbe")
@js.native
object ReflectionProbe extends js.Object {
  /**
    * Parse the JSON representation of a reflection probe in order to recreate the reflection probe in the given scene.
    * @param parsedReflectionProbe Define the JSON representation of the reflection probe
    * @param scene Define the scene the parsed reflection probe should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed reflection probe if successful
    */
  def Parse(parsedReflectionProbe: js.Any, scene: Scene, rootUrl: String): Nullable[ReflectionProbe] = js.native
}

