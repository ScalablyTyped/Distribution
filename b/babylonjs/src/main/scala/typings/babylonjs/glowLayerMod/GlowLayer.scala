package typings.babylonjs.glowLayerMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.PartialIGlowLayerOptions
import typings.babylonjs.effectLayerMod.EffectLayer
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Layers/glowLayer", "GlowLayer")
@js.native
class GlowLayer protected () extends EffectLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: String, scene: Scene) = this()
  def this(name: String, scene: Scene, options: PartialIGlowLayerOptions) = this()
  var _blurTexture1: js.Any = js.native
  var _blurTexture2: js.Any = js.native
  var _excludedMeshes: js.Any = js.native
  var _horizontalBlurPostprocess1: js.Any = js.native
  var _horizontalBlurPostprocess2: js.Any = js.native
  var _includedOnlyMeshes: js.Any = js.native
  var _intensity: js.Any = js.native
  var _meshesUsingTheirOwnMaterials: js.Any = js.native
  var _options: js.Any = js.native
  var _postProcesses1: js.Any = js.native
  var _postProcesses2: js.Any = js.native
  var _verticalBlurPostprocess1: js.Any = js.native
  var _verticalBlurPostprocess2: js.Any = js.native
  /**
    * Returns true if the mesh should render, otherwise false.
    * @param mesh The mesh to render
    * @returns true if it should render otherwise false
    */
  /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
  /**
    * Add a mesh in the exclusion list to prevent it to impact or being impacted by the glow layer.
    * @param mesh The mesh to exclude from the glow layer
    */
  def addExcludedMesh(mesh: Mesh): Unit = js.native
  /**
    * Add a mesh in the inclusion list to impact or being impacted by the glow layer.
    * @param mesh The mesh to include in the glow layer
    */
  def addIncludedOnlyMesh(mesh: Mesh): Unit = js.native
  /**
    * Gets the kernel size of the blur.
    */
  def blurKernelSize: Double = js.native
  /**
    * Sets the kernel size of the blur.
    */
  def blurKernelSize(value: Double): js.Any = js.native
  /**
    * Callback used to let the user override the color selection on a per mesh basis
    */
  def customEmissiveColorSelector(mesh: Mesh, subMesh: SubMesh, material: Material, result: Color4): Unit = js.native
  /**
    * Callback used to let the user override the texture selection on a per mesh basis
    */
  def customEmissiveTextureSelector(mesh: Mesh, subMesh: SubMesh, material: Material): Texture = js.native
  /**
    * Gets the glow intensity.
    */
  def intensity: Double = js.native
  /**
    * Sets the glow intensity.
    */
  def intensity(value: Double): js.Any = js.native
  /**
    * Add a mesh to be rendered through its own material and not with emissive only.
    * @param mesh The mesh for which we need to use its material
    */
  def referenceMeshToUseItsOwnMaterial(mesh: AbstractMesh): Unit = js.native
  /**
    * Remove a mesh from the exclusion list to let it impact or being impacted by the glow layer.
    * @param mesh The mesh to remove
    */
  def removeExcludedMesh(mesh: Mesh): Unit = js.native
  /**
    * Remove a mesh from the Inclusion list to prevent it to impact or being impacted by the glow layer.
    * @param mesh The mesh to remove
    */
  def removeIncludedOnlyMesh(mesh: Mesh): Unit = js.native
  /**
    * Serializes this glow layer
    * @returns a serialized glow layer object
    */
  @JSName("serialize")
  def serialize_MGlowLayer(): js.Any = js.native
  /**
    * Remove a mesh from being rendered through its own material and not with emissive only.
    * @param mesh The mesh for which we need to not use its material
    */
  def unReferenceMeshFromUsingItsOwnMaterial(mesh: AbstractMesh): Unit = js.native
}

/* static members */
@JSImport("babylonjs/Layers/glowLayer", "GlowLayer")
@js.native
object GlowLayer extends js.Object {
  /**
    * The default blur kernel size used for the glow.
    */
  var DefaultBlurKernelSize: Double = js.native
  /**
    * The default texture size ratio used for the glow.
    */
  var DefaultTextureRatio: Double = js.native
  /**
    * Effect Name of the layer.
    */
  val EffectName: String = js.native
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  def Parse(parsedGlowLayer: js.Any, scene: Scene, rootUrl: String): GlowLayer = js.native
}

