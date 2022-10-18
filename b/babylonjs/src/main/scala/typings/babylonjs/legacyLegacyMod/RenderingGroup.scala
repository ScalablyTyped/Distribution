package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RenderingGroup")
@js.native
open class RenderingGroup protected ()
  extends typings.babylonjs.indexMod.RenderingGroup {
  /**
    * Creates a new rendering group.
    * @param index The rendering group index
    * @param scene
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
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
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
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
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
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
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
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Unit,
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          /* b */ typings.babylonjs.meshesSubMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
}
/* static members */
object RenderingGroup {
  
  @JSImport("babylonjs/Legacy/legacy", "RenderingGroup")
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
  inline def PainterSortCompare(a: typings.babylonjs.meshesSubMeshMod.SubMesh, b: typings.babylonjs.meshesSubMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("PainterSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Renders the submeshes in a specified order.
    * @param subMeshes The submeshes to sort before render
    * @param sortCompareFn The comparison function use to sort
    * @param camera The camera position use to preprocess the submeshes to help sorting
    * @param transparent Specifies to activate blending if true
    */
  @JSImport("babylonjs/Legacy/legacy", "RenderingGroup._RenderSorted")
  @js.native
  def _RenderSorted: Any = js.native
  inline def _RenderSorted_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RenderSorted")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "RenderingGroup._ZeroVector")
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
  inline def backToFrontSortCompare(a: typings.babylonjs.meshesSubMeshMod.SubMesh, b: typings.babylonjs.meshesSubMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("backToFrontSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front if in the same alpha index.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def defaultTransparentSortCompare(a: typings.babylonjs.meshesSubMeshMod.SubMesh, b: typings.babylonjs.meshesSubMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTransparentSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered front to back (prevent overdraw).
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def frontToBackSortCompare(a: typings.babylonjs.meshesSubMeshMod.SubMesh, b: typings.babylonjs.meshesSubMeshMod.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frontToBackSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
