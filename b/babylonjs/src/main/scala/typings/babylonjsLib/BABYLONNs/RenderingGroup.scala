package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents the object necessary to create a rendering group.
  * This is exclusively used and created by the rendering manager.
  * To modify the behavior, you use the available helpers in your scene or meshes.
  * @hidden
  */
@JSGlobal("BABYLON.RenderingGroup")
@js.native
class RenderingGroup protected () extends js.Object {
  /**
    * Creates a new rendering group.
    * @param index The rendering group index
    * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
    * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
    * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
    */
  def this(index: scala.Double, scene: Scene) = this()
  def this(index: scala.Double, scene: Scene, opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]) = this()
  def this(index: scala.Double, scene: Scene, opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]], alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]) = this()
  def this(index: scala.Double, scene: Scene, opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]], alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]], transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]) = this()
  var _alphaTestSortCompareFn: js.Any = js.native
  var _alphaTestSubMeshes: js.Any = js.native
  var _depthOnlySubMeshes: js.Any = js.native
  var _edgesRenderers: js.Any = js.native
  var _opaqueSortCompareFn: js.Any = js.native
  var _opaqueSubMeshes: js.Any = js.native
  var _particleSystems: js.Any = js.native
  var _renderAlphaTest: js.Any = js.native
  var _renderOpaque: js.Any = js.native
  var _renderParticles: js.Any = js.native
  var _renderSprites: js.Any = js.native
  var _renderTransparent: js.Any = js.native
  var _scene: js.Any = js.native
  var _spriteManagers: js.Any = js.native
  var _transparentSortCompareFn: js.Any = js.native
  var _transparentSubMeshes: js.Any = js.native
  /**
    * Set the alpha test sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  var alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]] = js.native
  var index: scala.Double = js.native
  /**
    * Set the opaque sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  var opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]] = js.native
  /**
    * Renders the opaque submeshes in the order from the alphatestSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  var renderAlphaTestSorted: js.Any = js.native
  /**
    * Renders the opaque submeshes in the order from the opaqueSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  var renderOpaqueSorted: js.Any = js.native
  /**
    * Renders the opaque submeshes in the order from the transparentSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  var renderTransparentSorted: js.Any = js.native
  /**
    * Set the transparent sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  var transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]] = js.native
  /**
    * Inserts the submesh in its correct queue depending on its material.
    * @param subMesh The submesh to dispatch
    * @param [mesh] Optional reference to the submeshes's mesh. Provide if you have an exiting reference to improve performance.
    * @param [material] Optional reference to the submeshes's material. Provide if you have an exiting reference to improve performance.
    */
  def dispatch(subMesh: SubMesh): scala.Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: AbstractMesh): scala.Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: AbstractMesh, material: Nullable[Material]): scala.Unit = js.native
  def dispatchParticles(particleSystem: IParticleSystem): scala.Unit = js.native
  def dispatchSprites(spriteManager: ISpriteManager): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def onBeforeTransparentRendering(): scala.Unit = js.native
  /**
    * Resets the different lists of submeshes to prepare a new frame.
    */
  def prepare(): scala.Unit = js.native
  /**
    * Render all the sub meshes contained in the group.
    * @param customRenderFunction Used to override the default render behaviour of the group.
    * @returns true if rendered some submeshes.
    */
  def render(
    customRenderFunction: Nullable[
      js.Function4[
        /* opaqueSubMeshes */ SmartArray[SubMesh], 
        /* transparentSubMeshes */ SmartArray[SubMesh], 
        /* alphaTestSubMeshes */ SmartArray[SubMesh], 
        /* depthOnlySubMeshes */ SmartArray[SubMesh], 
        scala.Unit
      ]
    ],
    renderSprites: scala.Boolean,
    renderParticles: scala.Boolean,
    activeMeshes: Nullable[js.Array[AbstractMesh]]
  ): scala.Unit = js.native
}

/**
  * This represents the object necessary to create a rendering group.
  * This is exclusively used and created by the rendering manager.
  * To modify the behavior, you use the available helpers in your scene or meshes.
  * @hidden
  */
@JSGlobal("BABYLON.RenderingGroup")
@js.native
object RenderingGroup extends js.Object {
  /**
    * Renders the submeshes in a specified order.
    * @param subMeshes The submeshes to sort before render
    * @param sortCompareFn The comparison function use to sort
    * @param cameraPosition The camera position use to preprocess the submeshes to help sorting
    * @param transparent Specifies to activate blending if true
    */
  var renderSorted: js.Any = js.native
  /**
    * Renders the submeshes in the order they were dispatched (no sort applied).
    * @param subMeshes The submeshes to render
    */
  var renderUnsorted: js.Any = js.native
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  def backToFrontSortCompare(a: babylonjsLib.BABYLONNs.SubMesh, b: babylonjsLib.BABYLONNs.SubMesh): scala.Double = js.native
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front if in the same alpha index.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  def defaultTransparentSortCompare(a: babylonjsLib.BABYLONNs.SubMesh, b: babylonjsLib.BABYLONNs.SubMesh): scala.Double = js.native
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered front to back (prevent overdraw).
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  def frontToBackSortCompare(a: babylonjsLib.BABYLONNs.SubMesh, b: babylonjsLib.BABYLONNs.SubMesh): scala.Double = js.native
}

