package typings.cytoscape

import typings.cytoscape.mod.CollectionReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoth extends js.Object {
  var both: CollectionReturnValue
  var left: CollectionReturnValue
  var right: CollectionReturnValue
}

object AnonBoth {
  @scala.inline
  def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): AnonBoth = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoth]
  }
}

