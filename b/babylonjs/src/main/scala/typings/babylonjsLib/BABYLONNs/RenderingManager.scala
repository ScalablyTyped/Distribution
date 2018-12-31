package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the manager responsible of all the rendering for meshes sprites and particles.
  * It is enable to manage the different groups as well as the different necessary sort functions.
  * This should not be used directly aside of the few static configurations
  */
@JSGlobal("BABYLON.RenderingManager")
@js.native
class RenderingManager protected () extends js.Object {
  /**
    * Instantiates a new rendering group for a particular scene
    * @param scene Defines the scene the groups belongs to
    */
  def this(scene: Scene) = this()
  var _autoClearDepthStencil: js.Any = js.native
  var _clearDepthStencilBuffer: js.Any = js.native
  var _customAlphaTestSortCompareFn: js.Any = js.native
  var _customOpaqueSortCompareFn: js.Any = js.native
  var _customTransparentSortCompareFn: js.Any = js.native
  var _depthStencilBufferAlreadyCleaned: js.Any = js.native
  var _prepareRenderingGroup: js.Any = js.native
  var _renderingGroupInfo: js.Any = js.native
  var _renderingGroups: js.Any = js.native
  var _scene: js.Any = js.native
  /**
    * @hidden
    */
  var _useSceneAutoClearSetup: scala.Boolean = js.native
  /**
    * Add a submesh to the manager in order to render it this frame
    * @param subMesh The submesh to dispatch
    * @param mesh Optional reference to the submeshes's mesh. Provide if you have an exiting reference to improve performance.
    * @param material Optional reference to the submeshes's material. Provide if you have an exiting reference to improve performance.
    */
  def dispatch(subMesh: SubMesh): scala.Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: AbstractMesh): scala.Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: AbstractMesh, material: Nullable[Material]): scala.Unit = js.native
  /**
    * Add a particle system to the rendering manager in order to render it this frame.
    * @param particleSystem Define the particle system to render
    */
  def dispatchParticles(particleSystem: IParticleSystem): scala.Unit = js.native
  /**
    * Add a sprite manager to the rendering manager in order to render it this frame.
    * @param spriteManager Define the sprite manager to render
    */
  def dispatchSprites(spriteManager: ISpriteManager): scala.Unit = js.native
  /**
    * Dispose and release the group and its associated resources.
    * @hidden
    */
  def dispose(): scala.Unit = js.native
  /**
    * Clear the info related to rendering groups preventing retention points during dispose.
    */
  def freeRenderingGroups(): scala.Unit = js.native
  /**
    * Gets the current auto clear configuration for one rendering group of the rendering
    * manager.
    * @param index the rendering group index to get the information for
    * @returns The auto clear setup for the requested rendering group
    */
  def getAutoClearDepthStencilSetup(index: scala.Double): IRenderingManagerAutoClearSetup = js.native
  /**
    * Renders the entire managed groups. This is used by the scene or the different rennder targets.
    * @hidden
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
    activeMeshes: Nullable[js.Array[AbstractMesh]],
    renderParticles: scala.Boolean,
    renderSprites: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Resets the different information of the group to prepare a new frame
    * @hidden
    */
  def reset(): scala.Unit = js.native
  /**
    * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
    *
    * @param renderingGroupId The rendering group id corresponding to its index
    * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
    * @param depth Automatically clears depth between groups if true and autoClear is true.
    * @param stencil Automatically clears stencil between groups if true and autoClear is true.
    */
  def setRenderingAutoClearDepthStencil(renderingGroupId: scala.Double, autoClearDepthStencil: scala.Boolean): scala.Unit = js.native
  def setRenderingAutoClearDepthStencil(renderingGroupId: scala.Double, autoClearDepthStencil: scala.Boolean, depth: scala.Boolean): scala.Unit = js.native
  def setRenderingAutoClearDepthStencil(
    renderingGroupId: scala.Double,
    autoClearDepthStencil: scala.Boolean,
    depth: scala.Boolean,
    stencil: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Overrides the default sort function applied in the renderging group to prepare the meshes.
    * This allowed control for front to back rendering or reversly depending of the special needs.
    *
    * @param renderingGroupId The rendering group id corresponding to its index
    * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
    * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
    * @param transparentSortCompareFn The transparent queue comparison function use to sort.
    */
  def setRenderingOrder(renderingGroupId: scala.Double): scala.Unit = js.native
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
}

/**
  * This is the manager responsible of all the rendering for meshes sprites and particles.
  * It is enable to manage the different groups as well as the different necessary sort functions.
  * This should not be used directly aside of the few static configurations
  */
@JSGlobal("BABYLON.RenderingManager")
@js.native
object RenderingManager extends js.Object {
  /**
    * Used to globally prevent autoclearing scenes.
    */
  var AUTOCLEAR: scala.Boolean = js.native
  /**
    * The max id used for rendering groups (not included)
    */
  var MAX_RENDERINGGROUPS: scala.Double = js.native
  /**
    * The min id used for rendering groups (included)
    */
  var MIN_RENDERINGGROUPS: scala.Double = js.native
}

