package typings.babylonjs

import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.miscSmartArrayMod.SmartArrayNoDuplicate
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.renderingEdgesRendererMod.IEdgesRenderer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spritesSpriteManagerMod.ISpriteManager
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingRenderingGroupMod {
  
  @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup")
  @js.native
  open class RenderingGroup protected () extends StObject {
    /**
      * Creates a new rendering group.
      * @param index The rendering group index
      * @param scene
      * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
      * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
      * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
      */
    def this(index: Double, scene: Scene) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Unit,
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Unit,
      alphaTestSortCompareFn: Unit,
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Unit,
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      alphaTestSortCompareFn: Unit,
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    
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
  /* static members */
  object RenderingGroup {
    
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are grouped by material then geometry.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    inline def PainterSortCompare(a: SubMesh, b: SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("PainterSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Renders the submeshes in a specified order.
      * @param subMeshes The submeshes to sort before render
      * @param sortCompareFn The comparison function use to sort
      * @param camera The camera position use to preprocess the submeshes to help sorting
      * @param transparent Specifies to activate blending if true
      */
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup._RenderSorted")
    @js.native
    def _RenderSorted: Any = js.native
    inline def _RenderSorted_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RenderSorted")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup._ZeroVector")
    @js.native
    def _ZeroVector: Any = js.native
    inline def _ZeroVector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroVector")(x.asInstanceOf[js.Any])
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered back to front.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    inline def backToFrontSortCompare(a: SubMesh, b: SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("backToFrontSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered back to front if in the same alpha index.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    inline def defaultTransparentSortCompare(a: SubMesh, b: SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTransparentSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered front to back (prevent overdraw).
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    inline def frontToBackSortCompare(a: SubMesh, b: SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frontToBackSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
