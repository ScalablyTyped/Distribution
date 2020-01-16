package typings.cassandraDashDriver.libDatastaxMod.datastax.graph

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertex
  extends typings.cassandraDashDriver.libDatastaxGraphMod.graph.Element {
  var properties: js.UndefOr[StringDictionary[js.Array[_]]] = js.undefined
}

object Vertex {
  @scala.inline
  def apply(id: js.Any, label: String, properties: StringDictionary[js.Array[_]] = null): Vertex = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
}

