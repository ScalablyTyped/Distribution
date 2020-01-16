package typings.cassandraDashDriver.libDatastaxMod.datastax.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexProperty
  extends typings.cassandraDashDriver.libDatastaxGraphMod.graph.Element {
  var key: String
  var properties: js.UndefOr[js.Any] = js.undefined
  var value: js.Any
}

object VertexProperty {
  @scala.inline
  def apply(id: js.Any, key: String, label: String, value: js.Any, properties: js.Any = null): VertexProperty = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexProperty]
  }
}

