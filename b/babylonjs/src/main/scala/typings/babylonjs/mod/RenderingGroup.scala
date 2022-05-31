package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RenderingGroup")
@js.native
class RenderingGroup protected ()
  extends typings.babylonjs.legacyMod.RenderingGroup {
  /**
    * Creates a new rendering group.
    * @param index The rendering group index
    * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
    * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
    * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
    */
  def this(index: Double, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Unit,
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Unit,
    alphaTestSortCompareFn: Unit,
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Unit,
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Unit,
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.subMeshMod.SubMesh, 
          /* b */ typings.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
}
/* static members */
object RenderingGroup {
  
  @JSImport("babylonjs", "RenderingGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "RenderingGroup._zeroVector")
  @js.native
  def _zeroVector: js.Any = js.native
  inline def _zeroVector_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_zeroVector")(x.asInstanceOf[js.Any])
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def backToFrontSortCompare(a: typings.babylonjs.subMeshMod.SubMesh, b: typings.babylonjs.subMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("backToFrontSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front if in the same alpha index.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def defaultTransparentSortCompare(a: typings.babylonjs.subMeshMod.SubMesh, b: typings.babylonjs.subMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTransparentSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered front to back (prevent overdraw).
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def frontToBackSortCompare(a: typings.babylonjs.subMeshMod.SubMesh, b: typings.babylonjs.subMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frontToBackSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Renders the submeshes in a specified order.
    * @param subMeshes The submeshes to sort before render
    * @param sortCompareFn The comparison function use to sort
    * @param cameraPosition The camera position use to preprocess the submeshes to help sorting
    * @param transparent Specifies to activate blending if true
    */
  @JSImport("babylonjs", "RenderingGroup.renderSorted")
  @js.native
  def renderSorted: js.Any = js.native
  inline def renderSorted_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderSorted")(x.asInstanceOf[js.Any])
  
  /**
    * Renders the submeshes in the order they were dispatched (no sort applied).
    * @param subMeshes The submeshes to render
    */
  @JSImport("babylonjs", "RenderingGroup.renderUnsorted")
  @js.native
  def renderUnsorted: js.Any = js.native
  inline def renderUnsorted_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderUnsorted")(x.asInstanceOf[js.Any])
}
