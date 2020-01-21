package typings.cassandraDriver.datastaxMod.datastax.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge
  extends typings.cassandraDriver.graphMod.graph.Element {
  var inV: js.UndefOr[typings.cassandraDriver.graphMod.graph.Vertex] = js.undefined
  var inVLabel: js.UndefOr[String] = js.undefined
  var outV: js.UndefOr[typings.cassandraDriver.graphMod.graph.Vertex] = js.undefined
  var outVLabel: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Object] = js.undefined
}

object Edge {
  @scala.inline
  def apply(
    id: js.Any,
    label: String,
    inV: typings.cassandraDriver.graphMod.graph.Vertex = null,
    inVLabel: String = null,
    outV: typings.cassandraDriver.graphMod.graph.Vertex = null,
    outVLabel: String = null,
    properties: js.Object = null
  ): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (inV != null) __obj.updateDynamic("inV")(inV.asInstanceOf[js.Any])
    if (inVLabel != null) __obj.updateDynamic("inVLabel")(inVLabel.asInstanceOf[js.Any])
    if (outV != null) __obj.updateDynamic("outV")(outV.asInstanceOf[js.Any])
    if (outVLabel != null) __obj.updateDynamic("outVLabel")(outVLabel.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

