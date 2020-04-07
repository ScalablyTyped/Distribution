package typings.babylonjs.BABYLON

import typings.babylonjs.PartialIHighlightLayerOptAlphaBlendingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.HighlightLayer")
@js.native
class HighlightLayer protected () extends EffectLayer {
  /**
    * Instantiates a new highlight Layer and references it to the scene..
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
    */
  def this(name: String, scene: Scene) = this()
  def this(name: String, scene: Scene, options: PartialIHighlightLayerOptAlphaBlendingMode) = this()
  var _blurTexture: js.Any = js.native
  /**
    * Force the stencil to the normal expected value for none glowing parts
    */
  var _defaultStencilReference: js.Any = js.native
  var _downSamplePostprocess: js.Any = js.native
  var _excludedMeshes: js.Any = js.native
  var _horizontalBlurPostprocess: js.Any = js.native
  var _instanceGlowingMeshStencilReference: js.Any = js.native
  var _meshes: js.Any = js.native
  var _options: js.Any = js.native
  var _verticalBlurPostprocess: js.Any = js.native
  /**
    * Specifies whether or not the inner glow is ACTIVE in the layer.
    */
  var innerGlow: Boolean = js.native
  /**
    * An event triggered when the highlight layer has been blurred.
    */
  var onAfterBlurObservable: Observable[HighlightLayer] = js.native
  /**
    * An event triggered when the highlight layer is being blurred.
    */
  var onBeforeBlurObservable: Observable[HighlightLayer] = js.native
  /**
    * Specifies whether or not the outer glow is ACTIVE in the layer.
    */
  var outerGlow: Boolean = js.native
  /**
    * Returns true if the mesh should render, otherwise false.
    * @param mesh The mesh to render
    * @returns true if it should render otherwise false
    */
  /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
  /**
    * Add a mesh in the exclusion list to prevent it to impact or being impacted by the highlight layer.
    * @param mesh The mesh to exclude from the highlight layer
    */
  def addExcludedMesh(mesh: Mesh): Unit = js.native
  /**
    * Add a mesh in the highlight layer in order to make it glow with the chosen color.
    * @param mesh The mesh to highlight
    * @param color The color of the highlight
    * @param glowEmissiveOnly Extract the glow from the emissive texture
    */
  def addMesh(mesh: Mesh, color: Color3): Unit = js.native
  def addMesh(mesh: Mesh, color: Color3, glowEmissiveOnly: Boolean): Unit = js.native
  /**
    * Gets the horizontal size of the blur.
    */
  def blurHorizontalSize(): Double = js.native
  /**
    * Specifies the horizontal size of the blur.
    */
  def blurHorizontalSize(value: Double): js.Any = js.native
  /**
    * Gets the vertical size of the blur.
    */
  def blurVerticalSize(): Double = js.native
  /**
    * Specifies the vertical size of the blur.
    */
  def blurVerticalSize(value: Double): js.Any = js.native
  /**
    * Remove all the meshes currently referenced in the highlight layer
    */
  def removeAllMeshes(): Unit = js.native
  /**
    * Remove a mesh from the exclusion list to let it impact or being impacted by the highlight layer.
    * @param mesh The mesh to highlight
    */
  def removeExcludedMesh(mesh: Mesh): Unit = js.native
  /**
    * Remove a mesh from the highlight layer in order to make it stop glowing.
    * @param mesh The mesh to highlight
    */
  def removeMesh(mesh: Mesh): Unit = js.native
  /**
    * Serializes this Highlight layer
    * @returns a serialized Highlight layer object
    */
  @JSName("serialize")
  def serialize_MHighlightLayer(): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.HighlightLayer")
@js.native
object HighlightLayer extends js.Object {
  /**
    * Effect Name of the highlight layer.
    */
  val EffectName: String = js.native
  /**
    * Stencil value used for glowing meshes.
    */
  var GlowingMeshStencilReference: Double = js.native
  /**
    * The neutral color used during the preparation of the glow effect.
    * This is black by default as the blend operation is a blend operation.
    */
  var NeutralColor: Color4 = js.native
  /**
    * Stencil value used for the other meshes in the scene.
    */
  var NormalMeshStencilReference: Double = js.native
  /**
    * Creates a Highlight layer from parsed Highlight layer data
    * @param parsedHightlightLayer defines the Highlight layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the Highlight layer information
    * @returns a parsed Highlight layer
    */
  def Parse(parsedHightlightLayer: js.Any, scene: Scene, rootUrl: String): HighlightLayer = js.native
}

