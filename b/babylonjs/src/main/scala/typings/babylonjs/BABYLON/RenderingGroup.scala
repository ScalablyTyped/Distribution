package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingGroup extends StObject {
  
  /* private */ var _alphaTestSortCompareFn: Any = js.native
  
  /* private */ var _alphaTestSubMeshes: Any = js.native
  
  /* private */ var _depthOnlySubMeshes: Any = js.native
  
  /** @internal */
  var _edgesRenderers: SmartArrayNoDuplicate[IEdgesRenderer] = js.native
  
  /** @internal */
  var _empty: Boolean = js.native
  
  /* private */ var _opaqueSortCompareFn: Any = js.native
  
  /* private */ var _opaqueSubMeshes: Any = js.native
  
  /* private */ var _particleSystems: Any = js.native
  
  /* private */ var _renderAlphaTest: Any = js.native
  
  /**
    * Renders the opaque submeshes in the order from the alphatestSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  /* private */ var _renderAlphaTestSorted: Any = js.native
  
  /* private */ var _renderOpaque: Any = js.native
  
  /**
    * Renders the opaque submeshes in the order from the opaqueSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  /* private */ var _renderOpaqueSorted: Any = js.native
  
  /* private */ var _renderParticles: Any = js.native
  
  /* private */ var _renderSprites: Any = js.native
  
  /* private */ var _renderTransparent: Any = js.native
  
  /**
    * Renders the opaque submeshes in the order from the transparentSortCompareFn.
    * @param subMeshes The submeshes to render
    */
  /* private */ var _renderTransparentSorted: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _spriteManagers: Any = js.native
  
  /* private */ var _transparentSortCompareFn: Any = js.native
  
  /* private */ var _transparentSubMeshes: Any = js.native
  
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
    * Resets the different lists of sprites to prepare a new frame.
    */
  def prepareSprites(): Unit = js.native
  
  /**
    * Render all the sub meshes contained in the group.
    * @param customRenderFunction Used to override the default render behaviour of the group.
    * @param renderSprites
    * @param renderParticles
    * @param activeMeshes
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
    * Set the transparent sort comparison function.
    * If null the sub meshes will be render in the order they were created
    */
  def transparentSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
}
