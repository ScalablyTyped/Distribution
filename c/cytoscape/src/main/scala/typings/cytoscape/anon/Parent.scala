package typings.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends js.Object {
  var parent: String | Null
}

object Parent {
  @scala.inline
  def apply(parent: String = null): Parent = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

