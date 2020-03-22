package typings.cytoscape

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.EdgeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentsCut extends js.Object {
  var components: CollectionReturnValue
  var cut: EdgeCollection
}

object AnonComponentsCut {
  @scala.inline
  def apply(components: CollectionReturnValue, cut: EdgeCollection): AnonComponentsCut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponentsCut]
  }
}

