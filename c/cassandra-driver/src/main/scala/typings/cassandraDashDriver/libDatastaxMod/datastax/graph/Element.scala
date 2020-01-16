package typings.cassandraDashDriver.libDatastaxMod.datastax.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var id: js.Any
  var label: String
}

object Element {
  @scala.inline
  def apply(id: js.Any, label: String): Element = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Element]
  }
}

