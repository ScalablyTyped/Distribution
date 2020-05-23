package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var components: CollectionReturnValue
  var cut: EdgeCollection
  var partitionFirst: NodeCollection
  var partitionSecond: NodeCollection
}

object Components {
  @scala.inline
  def apply(
    components: CollectionReturnValue,
    cut: EdgeCollection,
    partitionFirst: NodeCollection,
    partitionSecond: NodeCollection
  ): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
}

