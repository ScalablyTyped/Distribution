package typings
package d3DashForceLib.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */] extends js.Object {
  /**
    * The zero-based index into the links array. Internally generated when calling ForceLink.links(...)
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Link’s source node.
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the source property represents the source node object.
    */
  var source: NodeDatum | java.lang.String | scala.Double
  /**
    * Link’s source link
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the target property represents the target node object.
    */
  var target: NodeDatum | java.lang.String | scala.Double
}

object SimulationLinkDatum {
  @scala.inline
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    source: NodeDatum | java.lang.String | scala.Double,
    target: NodeDatum | java.lang.String | scala.Double,
    index: scala.Int | scala.Double = null
  ): SimulationLinkDatum[NodeDatum] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationLinkDatum[NodeDatum]]
  }
}

