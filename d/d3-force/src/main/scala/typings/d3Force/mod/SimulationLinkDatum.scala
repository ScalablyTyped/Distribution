package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */] extends js.Object {
  /**
    * The zero-based index into the links array. Internally generated when calling ForceLink.links(...)
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Link’s source node.
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the source property represents the source node object.
    */
  var source: NodeDatum | String | Double
  /**
    * Link’s source link
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the target property represents the target node object.
    */
  var target: NodeDatum | String | Double
}

object SimulationLinkDatum {
  @scala.inline
  def apply[/* <: typings.d3Force.mod.SimulationNodeDatum */ NodeDatum](
    source: NodeDatum | String | Double,
    target: NodeDatum | String | Double,
    index: js.UndefOr[Double] = js.undefined
  ): SimulationLinkDatum[NodeDatum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationLinkDatum[NodeDatum]]
  }
}

