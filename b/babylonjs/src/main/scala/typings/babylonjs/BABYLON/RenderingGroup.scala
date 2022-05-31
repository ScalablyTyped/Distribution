package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingGroup extends StObject {
  
  /* private */ var _alphaTestSortCompareFn: js.Any = js.native
  
  /* private */ var _alphaTestSubMeshes: js.Any = js.native
  
  /* private */ var _depthOnlySubMeshes: js.Any = js.native
  
  /** @hidden */
  var _edgesRenderers: SmartArrayNoDuplicate[IEdgesRenderer] = js.native
  
  /* private */ var _opaqueSortCompareFn: js.Any = js.native
  
  /* private */ var _opaqueSubMeshes: js.Any = js.native
  
  /* private */ var _particleSystems: js.Any = js.native
  
  /* private */ var _renderAlphaTest: js.Any = js.native
  
  /* private */ var _renderOpaque: js.Any = js.native
  
  /* private */ var _renderParticles: js.Any = js.native
  
  /* private */ var _renderSprites: js.Any = js.native
  
  /* private */ var _renderTransparent: js.Any = js.native
  
  /* private */ var _scene: js.Any = js.native
  
  /* private */ var _spriteManagers: js.Any = js.native
  
  /* private */ var _transparentSortCompareFn: js.Any = js.native
  
  /* private */ var _transparentSubMeshes: js.Any = js.native
  
  /**
    * Set the alpha test sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  def alphaTestSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
  
  /**
    * Inserts the submesh in its correct queue depending on its material.
    * @param subMesh The submesh to dispatch
    * @param [mesh] Optional reference to the submeshes's mesh. Provide if you have an exiting reference to improve performance.
    * @param [material] Optional reference to the submeshes's material. Provide if you have an exiting reference to improve performance.
    */
  def dispatch(subMesh: SubMesh): Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: Unit, material: Nullable[Material]): Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: AbstractMesh): Unit = js.native
  def dispatch(subMesh: SubMesh, mesh: AbstractMesh, material: Nullable[Material]): Unit = js.native
  
  def dispatchParticles(particleSystem: IParticleSystem): Unit = js.native
  
  def dispatchSprites(spriteManager: ISpriteManager): Unit = js.native
  
  def dispose(): Unit = js.native
  
  var index: Double = js.native
  
  def onBeforeTransparentRendering(): Unit = js.native
  
  /**
    * Set the opaque sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  def opaqueSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
  
  /**
    * Resets the different lists of submeshes to prepare a new frame.
    */
  def prepare(): Unit = js.native
  
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
        Unit
      ]
    ],
    renderSprites: Boolean,
    renderParticles: Boolean,
    activeMeshes: Nullable[js.Array[AbstractMesh]]
  ): Unit = js.native
  
  /**
    * Renders the opaque submeshes in the order from the alphatestSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  /* private */ var renderAlphaTestSorted: js.Any = js.native
  
  /**
    * Renders the opaque submeshes in the order from the opaqueSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  /* private */ var renderOpaqueSorted: js.Any = js.native
  
  /**
    * Renders the opaque submeshes in the order from the transparentSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  /* private */ var renderTransparentSorted: js.Any = js.native
  
  /**
    * Set the transparent sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  def transparentSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
}
