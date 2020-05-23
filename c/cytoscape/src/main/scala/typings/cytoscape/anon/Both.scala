package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Both extends js.Object {
  var both: CollectionReturnValue
  var left: CollectionReturnValue
  var right: CollectionReturnValue
}

object Both {
  @scala.inline
  def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Both]
  }
}

