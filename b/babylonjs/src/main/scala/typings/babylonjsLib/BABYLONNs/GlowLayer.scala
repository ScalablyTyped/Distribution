package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The glow layer Helps adding a glow effect around the emissive parts of a mesh.
  *
  * Once instantiated in a scene, simply use the pushMesh or removeMesh method to add or remove
  * glowy meshes to your scene.
  *
  * Documentation: https://doc.babylonjs.com/how_to/glow_layer
  */
@JSGlobal("BABYLON.GlowLayer")
@js.native
class GlowLayer protected () extends EffectLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: java.lang.String, scene: Scene) = this()
  def this(name: java.lang.String, scene: Scene, options: stdLib.Partial[IGlowLayerOptions]) = this()
  var _blurTexture1: js.Any = js.native
  var _blurTexture2: js.Any = js.native
  var _excludedMeshes: js.Any = js.native
  var _horizontalBlurPostprocess1: js.Any = js.native
  var _horizontalBlurPostprocess2: js.Any = js.native
  var _includedOnlyMeshes: js.Any = js.native
  var _intensity: js.Any = js.native
  var _options: js.Any = js.native
  var _postProcesses1: js.Any = js.native
  var _postProcesses2: js.Any = js.native
  var _verticalBlurPostprocess1: js.Any = js.native
  var _verticalBlurPostprocess2: js.Any = js.native
  /**
    * Sets the kernel size of the blur.
    */
  /**
    * Gets the kernel size of the blur.
    */
  var blurKernelSize: scala.Double = js.native
  /**
    * Sets the glow intensity.
    */
  /**
    * Gets the glow intensity.
    */
  var intensity: scala.Double = js.native
  /**
    * Add a mesh in the exclusion list to prevent it to impact or being impacted by the glow layer.
    * @param mesh The mesh to exclude from the glow layer
    */
  def addExcludedMesh(mesh: Mesh): scala.Unit = js.native
  /**
    * Add a mesh in the inclusion list to impact or being impacted by the glow layer.
    * @param mesh The mesh to include in the glow layer
    */
  def addIncludedOnlyMesh(mesh: Mesh): scala.Unit = js.native
  /**
    * Callback used to let the user override the color selection on a per mesh basis
    */
  def customEmissiveColorSelector(mesh: Mesh, subMesh: SubMesh, material: Material, result: Color4): scala.Unit = js.native
  /**
    * Callback used to let the user override the texture selection on a per mesh basis
    */
  def customEmissiveTextureSelector(mesh: Mesh, subMesh: SubMesh, material: Material): Texture = js.native
  /**
    * Remove a mesh from the exclusion list to let it impact or being impacted by the glow layer.
    * @param mesh The mesh to remove
    */
  def removeExcludedMesh(mesh: Mesh): scala.Unit = js.native
  /**
    * Remove a mesh from the Inclusion list to prevent it to impact or being impacted by the glow layer.
    * @param mesh The mesh to remove
    */
  def removeIncludedOnlyMesh(mesh: Mesh): scala.Unit = js.native
  /**
    * Serializes this glow layer
    * @returns a serialized glow layer object
    */
  @JSName("serialize")
  def serialize_MGlowLayer(): js.Any = js.native
}

/**
  * The glow layer Helps adding a glow effect around the emissive parts of a mesh.
  *
  * Once instantiated in a scene, simply use the pushMesh or removeMesh method to add or remove
  * glowy meshes to your scene.
  *
  * Documentation: https://doc.babylonjs.com/how_to/glow_layer
  */
@JSGlobal("BABYLON.GlowLayer")
@js.native
object GlowLayer extends js.Object {
  /**
    * The default blur kernel size used for the glow.
    */
  var DefaultBlurKernelSize: scala.Double = js.native
  /**
    * The default texture size ratio used for the glow.
    */
  var DefaultTextureRatio: scala.Double = js.native
  /**
    * Effect Name of the layer.
    */
  val EffectName: java.lang.String = js.native
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  def Parse(parsedGlowLayer: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.GlowLayer = js.native
}

