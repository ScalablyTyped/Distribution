package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StratifyOperator[Datum] extends js.Object {
  /**
    * Generates a new hierarchy from the specified tabular data. Each node in the returned object has a shallow copy of the properties
    * from the corresponding data object, excluding the following reserved properties: id, parentId, children.
    *
    * @param data The root specified data.
    * @throws Error on missing id, ambiguous id, cycle, multiple roots or no root.
    */
  def apply(data: js.Array[Datum]): HierarchyNode[Datum] = js.native
  /**
    * Returns the current id accessor, which defaults to: `(d) => d.id`.
    */
  def id(): js.Function3[
    /* d */ Datum, 
    /* i */ scala.Double, 
    /* data */ js.Array[Datum], 
    js.UndefOr[
      java.lang.String | scala.Null | d3DashHierarchyLib.d3DashHierarchyLibStrings.Empty
    ]
  ] = js.native
  /**
    * Sets the id accessor to the given function.
    * The id accessor is invoked for each element in the input data passed to the stratify operator.
    * The returned string is then used to identify the node's relationships in conjunction with the parent id.
    * For leaf nodes, the id may be undefined, null or the empty string; otherwise, the id must be unique.
    *
    * @param id The id accessor.
    */
  @JSName("id")
  def `id_`(
    id: js.Function3[
      /* d */ Datum, 
      /* i */ scala.Double, 
      /* data */ js.Array[Datum], 
      js.UndefOr[
        java.lang.String | scala.Null | d3DashHierarchyLib.d3DashHierarchyLibStrings.Empty
      ]
    ]
  ): this.type = js.native
  /**
    * Returns the current parent id accessor, which defaults to: `(d) => d.parentId`.
    */
  def parentId(): js.Function3[
    /* d */ Datum, 
    /* i */ scala.Double, 
    /* data */ js.Array[Datum], 
    js.UndefOr[
      java.lang.String | scala.Null | d3DashHierarchyLib.d3DashHierarchyLibStrings.Empty
    ]
  ] = js.native
  /**
    * Sets the parent id accessor to the given function.
    * The parent id accessor is invoked for each element in the input data passed to the stratify operator.
    * The returned string is then used to identify the node's relationships in conjunction with the id.
    * For the root node, the parent id should be undefined, null or the empty string.
    * There must be exactly one root node in the input data, and no circular relationships.
    *
    * @param parentId The parent id accessor.
    */
  @JSName("parentId")
  def `parentId_`(
    parentId: js.Function3[
      /* d */ Datum, 
      /* i */ scala.Double, 
      /* data */ js.Array[Datum], 
      js.UndefOr[
        java.lang.String | scala.Null | d3DashHierarchyLib.d3DashHierarchyLibStrings.Empty
      ]
    ]
  ): this.type = js.native
}

