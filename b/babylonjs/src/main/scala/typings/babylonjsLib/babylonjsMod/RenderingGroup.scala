package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents the object necessary to create a rendering group.
  * This is exclusively used and created by the rendering manager.
  * To modify the behavior, you use the available helpers in your scene or meshes.
  * @hidden
  */
@JSImport("babylonjs", "RenderingGroup")
@js.native
class RenderingGroup protected ()
  extends babylonjsLib.BABYLONNs.RenderingGroup {
  /**
    * Creates a new rendering group.
    * @param index The rendering group index
    * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
    * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
    * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
    */
  def this(index: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(index: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, opaqueSortCompareFn: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* a */ babylonjsLib.BABYLONNs.SubMesh, 
        /* b */ babylonjsLib.BABYLONNs.SubMesh, 
        scala.Double
      ]
    ]) = this()
  def this(index: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, opaqueSortCompareFn: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* a */ babylonjsLib.BABYLONNs.SubMesh, 
        /* b */ babylonjsLib.BABYLONNs.SubMesh, 
        scala.Double
      ]
    ], alphaTestSortCompareFn: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* a */ babylonjsLib.BABYLONNs.SubMesh, 
        /* b */ babylonjsLib.BABYLONNs.SubMesh, 
        scala.Double
      ]
    ]) = this()
  def this(index: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, opaqueSortCompareFn: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* a */ babylonjsLib.BABYLONNs.SubMesh, 
        /* b */ babylonjsLib.BABYLONNs.SubMesh, 
        scala.Double
      ]
    ], alphaTestSortCompareFn: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* a */ babylonjsLib.BABYLONNs.SubMesh, 
        /* b */ babylonjsLib.BABYLONNs.SubMesh, 
        scala.Double
      ]
    ], transparentSortCompareFn: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* a */ babylonjsLib.BABYLONNs.SubMesh, 
        /* b */ babylonjsLib.BABYLONNs.SubMesh, 
        scala.Double
      ]
    ]) = this()
}

/* static members */
@JSImport("babylonjs", "RenderingGroup")
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

