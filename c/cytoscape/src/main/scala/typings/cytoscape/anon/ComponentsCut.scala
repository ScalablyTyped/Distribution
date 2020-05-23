package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.EdgeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentsCut extends js.Object {
  var components: CollectionReturnValue
  var cut: EdgeCollection
}

object ComponentsCut {
  @scala.inline
  def apply(components: CollectionReturnValue, cut: EdgeCollection): ComponentsCut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsCut]
  }
}

